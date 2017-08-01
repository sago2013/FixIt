package com.fixit.fixit;

import android.*;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/26/17.
 */

public class ViewProfile  extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //declaring Layout variables
    //these are in the content layout
    private TextView aboutTV, phoneTV, emailTV;
    //these are in the app_bar layout
    private ImageView prof_pic;
    private TextView fullNameTV;
    private RatingBar ratingBar;
    private ProgressDialog mPD;

    //declaring Firebase variables
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    DatabaseReference UserDB;
    StorageReference StorageRef;
    StorageReference profileImageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
         //Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) findViewById(R.id.result_tabs);
        tabs.setupWithViewPager(viewPager);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.setTitle(fullNameTV.getText().toString());
                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });
        collapsingToolbarLayout.setTitle(" ");

        //loadBackdrop();




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //variable instantiation
        aboutTV = (TextView) findViewById(R.id.about);
        aboutTV.setMovementMethod(new ScrollingMovementMethod());
        phoneTV = (TextView) findViewById(R.id.phone);
        emailTV = (TextView) findViewById(R.id.email);
        //tooldbar fields
        fullNameTV = (TextView) findViewById(R.id.fullName);
        prof_pic = (ImageView) findViewById(R.id.profileImage);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        //Firebase instantiation
        mAuth = FirebaseAuth.getInstance();


        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null)
                {
                    finish();
                    Intent iDontBelongHere = new Intent(ViewProfile.this, MainActivity.class);
                    iDontBelongHere.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(iDontBelongHere);
                }
                else{
                    //TODO: Sign out user for saftey
                }
            }
        };
        //UserDB = FirebaseDatabase.getInstance().getReference().child("Users");
        //dabatabase refrence
        UserDB = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fixit-sandbox.firebaseio.com/Users/" + mAuth.getCurrentUser().getUid());
        String curUser = mAuth.getCurrentUser().getUid();
        profileImageRef = FirebaseStorage.getInstance().getReference().child("images/"+curUser+"/profile_pic");
        //Checks to see if there was an authentication State change
        populateProfile();


        //edit profile information button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(ViewProfile.this,UserProfile.class);
                startActivity(intent);
            }
        });

    }

    private void loadBackdrop() {
            final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
            Glide.with(this).load(R.mipmap.ic_android).into(imageView);
    }

    private void populateProfile() {
        ValueEventListener profileListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                // test --> Toast.makeText(getApplicationContext(),user.getName(),Toast.LENGTH_LONG).show();
                if (user != null) {
                    profileImageRef.getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
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
                    if (user.hasrating()){
                        ratingBar.setRating(Float.parseFloat(user.getRating()));
                    }//you can hide an empty rating here, if you want to be fancy
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
        UserDB.addValueEventListener(profileListener);
    }

    @Override
        public boolean onNavigationItemSelected (MenuItem item){
            // Handle navigation view item clicks here.
            int id = item.getItemId();
            if (id == R.id.Profile) {
                Intent i = new Intent(ViewProfile.this, UserProfile.class);
                startActivity(i);
            } else if (id == R.id.sign_out) {

            } else if (id == R.id.gotofixer) {

            } else if (id == R.id.gohome) {
                Intent i = new Intent(ViewProfile.this, MainActivity.class);
                startActivity(i);
            } else if (id == R.id.privacy_policy) {

            } else if (id == R.id.file_Claim) {

            } else if (id == R.id.becomefixit) {

            } else if (id == R.id.FixITGuarantee) {

            } else if (id == R.id.terms) {

            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
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

    private void setupViewPager(ViewPager viewPager) {

        ViewProfile.Adapter adapter = new ViewProfile.Adapter(getSupportFragmentManager());
        adapter.addFragment(new pf_info(), "Info");
        adapter.addFragment(new pf_services(), "Services");
        adapter.addFragment(new pf_reviews(), "Reviews");
        viewPager.setAdapter(adapter);
    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }



    }

    @Override
    public void onStart(){
        super.onStart();
        populateProfile();
    }
}

