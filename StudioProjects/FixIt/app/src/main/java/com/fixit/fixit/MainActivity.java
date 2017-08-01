package com.fixit.fixit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.util.FloatProperty;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import com.google.android.gms.auth.api.Auth;
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

import java.util.Arrays;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Boolean isDeviceSelected = false;
    private Boolean isFixerSelected = false;
    private BottomNavigationView mBottomNavigationView;
    //declaring Firebase variables
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    DatabaseReference UserDB;
    StorageReference StorageRef;
    StorageReference profileImageRef;
    RatingBar stars;
    TextView email,name;
    ImageView prof_pic;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mAuth = FirebaseAuth.getInstance();


        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
            }
        };



        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_menu);


        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.bbar_home:
                        selectedFragment = Home_fragment.newInstance();
                        break;
                    case R.id.bbar_connect:
                        selectedFragment = NewsFeed.newInstance();
                        break;
                    case R.id.bbar_devices:
                        selectedFragment = MyDevices.newInstance();
                        break;
                    case R.id.bbar_help:
                        selectedFragment = MyDevices.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }
        });

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, Home_fragment.newInstance());
            transaction.commit();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        UserDB = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fixit-sandbox.firebaseio.com/Users/" + mAuth.getCurrentUser().getUid());
        String curUser = mAuth.getCurrentUser().getUid();
        profileImageRef = FirebaseStorage.getInstance().getReference().child("images/"+curUser+"/profile_pic");



        //Get User information from the database an use it to inflate the nav header.
         stars = (RatingBar) navigationView.getHeaderView(0).findViewById(R.id.ratingBar);
         email = (TextView) navigationView.getHeaderView(0).findViewById(R.id.email);
         name = (TextView) navigationView.getHeaderView(0).findViewById(R.id.fullName);
         prof_pic = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.profile_image);

        //Toast.makeText(this,tv.getText().toString(),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,String.valueOf(stars.getRating()),Toast.LENGTH_SHORT).show();

        navigationView.setNavigationItemSelectedListener(this);
        pupulateNavHeader();
    }

    public void pupulateNavHeader() {
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

                        if(user.hasname()){
                            if (user.getName().length()> 0) {
                                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
                                name = (TextView) navigationView.getHeaderView(0).findViewById(R.id.fullName);
                                name.setText(user.getName());
                                SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("mystic_bag", 0);
                                mPrefs.edit().putString("savedCurUserName", user.getName()).apply();
                                String curUser = mAuth.getCurrentUser().getUid();
                                mPrefs.edit().putString("curUserID",curUser).apply();


                            }
                        }


                        if (user.hasrating()){
                            stars.setRating(Float.parseFloat(user.getRating()));
                        }//you can hide an empty rating here, if you want to be fancy
                        if (user.getEmail().length()> 0) {
                            email.setText(user.getEmail());
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
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            isFixerSelected = false;
        } else {
            super.onBackPressed();
            isFixerSelected = false;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            Intent i = new Intent(MainActivity.this, ViewProfile.class);
            startActivity(i);
        } else if (id == R.id.sign_out) {
            Intent intent = new Intent(MainActivity.this, login.class);
            FirebaseAuth.getInstance().signOut();
            startActivity(intent);
            finish();
        } else if (id == R.id.gotofixer) {

        } else if (id == R.id.gohome) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.privacy_policy) {

        } else if (id == R.id.file_Claim) {

        }else if(id == R.id.my_devices){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, MyDevices.newInstance());
            transaction.commit();
            mBottomNavigationView.getMenu().getItem(2).setChecked(true);

        }
        else if (id == R.id.becomefixit){

        } else if (id == R.id.FixITGuarantee){

        }else if (id == R.id.terms){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void click(View view) {
        Intent i = new Intent(MainActivity.this, erase_me.class);
        startActivity(i);
    }

    public void gotoprofile(View view) {
        Intent intent = new Intent(MainActivity.this,ViewProfile.class);
        startActivity(intent);

    }
    @Override
    public void onStart(){
        super.onStart();
        pupulateNavHeader();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void ch_fixer(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("mystic_bag", 0);
        final String savedFixerName = mPrefs.getString("savedFixerName", "error");
        ViewGroup parent = (ViewGroup) view.getParent();
        TextView curFixerName = (TextView) parent.findViewById(R.id.fullName);
        LinearLayout border = (LinearLayout) parent.findViewById(R.id.linLayBorder);
        if (!isFixerSelected) {
            border.setBackground(getResources().getDrawable(R.drawable.border_selected, null));
            isFixerSelected = true;
            mPrefs.edit().putString("savedFixerName",curFixerName.getText().toString()).apply();


        }else if(savedFixerName.equals(curFixerName.getText().toString())){
            border.setBackground(getResources().getDrawable(R.drawable.border, null));
            mPrefs.edit().putString("savedFixerName","error").apply();
            isFixerSelected = false;
            Toast.makeText(this, "removed fixer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "You can only select one fixer,\nClick on the previously selected fixer to deselect it.", Toast.LENGTH_SHORT).show();
        }
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void ch_device(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("mystic_bag", 0);
        final String savedDeviceName = mPrefs.getString("savedDeviceName", "error");
        ViewGroup parent = (ViewGroup) view.getParent();
        TextView curDeviceName = (TextView) parent.findViewById(R.id.deviceName);
        TextView curPart = (TextView) parent.findViewById(R.id.deviceParts);
        LinearLayout border = (LinearLayout) parent.findViewById(R.id.linLayBorder);
        if (!isDeviceSelected) {
            border.setBackground(getResources().getDrawable(R.drawable.border_selected, null));
            isDeviceSelected = true;
            String devicename = curDeviceName.getText().toString();

            mPrefs.edit().putString("savedDeviceName",devicename.substring(devicename.indexOf(" "),devicename.length()))
                    .apply();
            String part = "no part";
            if (curPart.getText()!= null && curPart.getText().toString().length()>0) {
                part = curPart.getText().toString();
            }
            mPrefs.edit().putString("savedPart", part).apply();


        }else if(savedDeviceName.equals(curDeviceName.getText().toString().substring(curDeviceName.getText().toString().indexOf(" "),curDeviceName.getText().toString().length()))){
            border.setBackground(getResources().getDrawable(R.drawable.border, null));
            mPrefs.edit().putString("savedDeviceName","error").apply();
            isDeviceSelected = false;
            Toast.makeText(this, "removed Device", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "You can only select one device,\nClick on the previously selected device to deselect it.", Toast.LENGTH_SHORT).show();
        }
    }
}
