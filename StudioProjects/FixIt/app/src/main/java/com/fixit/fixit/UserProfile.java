package com.fixit.fixit;

import android.*;
import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.io.ByteArrayOutputStream;

import static android.R.attr.data;

public class UserProfile extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //case switchers
    private static final int FILE_SELECTION = 2;
    private static final int CAMERA = 3;

    //declaring Layout variables
    //these are in the content layout
    private EditText aboutTV, phoneTV;
    private TextView emailTV;
    //these are in the app_bar layout
    private ImageView prof_pic;
    private EditText fullNameTV;
    private RatingBar ratingBar;

    //declaring Firebase variables
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    DatabaseReference UserDB;
    DatabaseReference thisUserDB;
    StorageReference imagesRef;
    public static Uri  downloadUrl;

    //image hold uri
    Uri imageHoldURI = null;

    //other variables
    ProgressDialog mProgressBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveChangesToDB();


            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //variable instantiation
        aboutTV = (EditText) findViewById(R.id.about);
        phoneTV = (EditText) findViewById(R.id.phone);
        emailTV = (TextView) findViewById(R.id.email);
        //tooldbar fields
        fullNameTV = (EditText) findViewById(R.id.fullName);
        prof_pic = (ImageView) findViewById(R.id.profileImage);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        //Firebase instantiation
        mAuth = FirebaseAuth.getInstance();
        StorageReference StorageRef = FirebaseStorage.getInstance().getReference();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null)
                {
                    finish();
                    Intent iDontBelongHere = new Intent(UserProfile.this, MainActivity.class);
                    iDontBelongHere.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(iDontBelongHere);
                }
            }
        };

        //ImageView onClick listener
        prof_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profilePictureChange();
            }
        });

        String curUser = mAuth.getCurrentUser().getUid();
        imagesRef = StorageRef.child("images/"+curUser+"/profile_pic");

        mProgressBox = new ProgressDialog(this);

        //firbase table/storage refrence setup
        UserDB = FirebaseDatabase.getInstance().getReference().child("Users").child(mAuth.getCurrentUser().getUid());

        //dabatabase refrence of the specific user
        thisUserDB = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fixit-sandbox.firebaseio.com/Users/" + mAuth.getCurrentUser().getUid());
        //Checks to see if there was an authentication State change

        populateProfile();



    }

    private void cleanexit() {
        mProgressBox.dismiss();
        finish();
        Intent intent = new Intent(UserProfile.this, ViewProfile.class);
        startActivity(intent);
    }

    private void populateProfile() {
        ValueEventListener profileListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                // test --> Toast.makeText(getApplicationContext(),user.getName(),Toast.LENGTH_LONG).show();
                if (user != null) {
                    imagesRef.getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                        @Override
                        public void onSuccess(byte[] bytes) {
                            Bitmap bm = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                            DisplayMetrics dm = new DisplayMetrics();
                            getWindowManager().getDefaultDisplay().getMetrics(dm);

                            prof_pic.setMinimumHeight(dm.heightPixels);
                            prof_pic.setMinimumWidth(dm.widthPixels);
                            prof_pic.setImageBitmap(bm);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            prof_pic.setImageResource(R.mipmap.no_pic);
                        }
                    });
                    if (user.hasbio()){
                        if (user.getBio().length()> 0) {
                            aboutTV.setText (user.getBio());

                        }else{
                            aboutTV.setText("Add some information about yourself here");
                        }
                    }
                    if (user.getName().length()> 0) {
                        fullNameTV.setText(user.getName());
                    }
                    if (user.getEmail().length()> 0) {
                        emailTV.setText(user.getEmail());
                    }
                    if  (user.hasphone()) {
                        if(user.getPhone().length() > 0){
                            phoneTV.setText(user.getPhone());

                        }
                        else{
                            phoneTV.setText("add your phone so new clients can contact you");
                        }
                    }

                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w("Populating profile", "loadPost:onCancelled", databaseError.toException());
            }
        };
        thisUserDB.addValueEventListener(profileListener);
    }




    private void saveChangesToDB() {

        final String about = aboutTV.getText().toString().trim();
        final String phone = phoneTV.getText().toString().trim();
        final String email = emailTV.getText().toString().trim();
        final String name = fullNameTV.getText().toString().trim();
        mProgressBox.setTitle("Saving Profile Changes");
        mProgressBox.setMessage("Almost Done......");
        mProgressBox.show();
        //save info to db
        // Get the data from an ImageView as bytes
        prof_pic.setDrawingCacheEnabled(true);
        prof_pic.buildDrawingCache();
        Bitmap bitmap = prof_pic.getDrawingCache();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] data = baos.toByteArray();

        UploadTask uploadTask = imagesRef.putBytes(data);
        uploadTask.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle unsuccessful uploads
            }
        }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.
                //Uri downloadUrl = taskSnapshot.getDownloadUrl();
            }
        });

        if (about.length()==0){
            Toast.makeText(this,"Dont forget tot fill out the About Section",Toast.LENGTH_LONG).show();

        }else if(phone.length()==0){
            Toast.makeText(this,"Dont forget to include your phone",Toast.LENGTH_LONG).show();

        }else if(email.length()==0){
            Toast.makeText(this,"There is something wrong with the email you entered",Toast.LENGTH_LONG).show();

        }else if(name.length()==0){
            Toast.makeText(this,"Dont forget to include your name",Toast.LENGTH_LONG).show();

        }else{


            //UserDB.child("profPicURL").setValue(gimic);
            thisUserDB.child("name").setValue(name);
            thisUserDB.child("bio").setValue(about);
            thisUserDB.child("phone").setValue(phone);
            thisUserDB.child("email").setValue(email);

            cleanexit();
        }

        mProgressBox.dismiss();


    }

    private void profilePictureChange() {
        //dialougue that functions as a MiniMenu, to choose how to change the image
        final CharSequence[] miniMenu = {"Take Photo", "Choose from Your Library", "Cancel"};
        AlertDialog.Builder builder = new AlertDialog.Builder(UserProfile.this);
        builder.setTitle("New Profile Picture Options");
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 11);
                }
            }
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 12);
                }
            }
        }
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(new String[]{android.Manifest.permission.CAMERA}, 10);
                }
            }
        }

        //MiniMenu Listeneres
        builder.setItems(miniMenu, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (miniMenu[which].equals("Take Photo")){

                        deviceCameraIntent();

                } else if (miniMenu[which].equals("Choose from Your Library")){

                       deviceGalleryIntent();
                } else if (miniMenu[which].equals("Cancel")){
                   dialog.dismiss();
                }
            }
        });
        builder.show();

    }

    private void  deviceGalleryIntent() {

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, FILE_SELECTION);

    }

    private void deviceCameraIntent() {
        /*
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA);
        */
        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .setAspectRatio(1,1)
                .start(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == FILE_SELECTION && resultCode == RESULT_OK){
            Uri imageURI = data.getData();

            CropImage.activity(imageURI)
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setAspectRatio(1,1)
                    .start(this);

        }else if (requestCode == CAMERA && resultCode == RESULT_OK){
            Uri imageURI = data.getData();

            CropImage.activity(imageURI)
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setAspectRatio(1,1)
                    .start(this);
        }

        //Library code for cropping image dont forget to credit Copyright 2016, Arthur Teplitzki, 2013, Edmodo, Inc.
        if(requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE){
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode ==RESULT_OK){
                imageHoldURI = result.getUri();
                //here the holder deposits the image into the image view field
                prof_pic.setImageURI(imageHoldURI);
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE){
                Exception error = result.getError();
                Log.d("user profile","error croping image", error);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.Profile) {
            Intent i = new Intent(UserProfile.this, ViewProfile.class);
            startActivity(i);
        } else if (id == R.id.sign_out) {

        } else if (id == R.id.gotofixer) {

        } else if (id == R.id.gohome) {
            Intent i = new Intent(UserProfile.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.privacy_policy) {

        } else if (id == R.id.file_Claim) {

        } else if (id == R.id.becomefixit){

        } else if (id == R.id.FixITGuarantee){

        }else if (id == R.id.terms){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
