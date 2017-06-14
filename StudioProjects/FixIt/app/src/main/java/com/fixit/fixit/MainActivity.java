package com.fixit.fixit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import com.google.android.gms.auth.api.Auth;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




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


        //Get User information from the database an use it to inflate the nav header.
        RatingBar stars = (RatingBar) navigationView.getHeaderView(0).findViewById(R.id.ratingBar);
        TextView email = (TextView) navigationView.getHeaderView(0).findViewById(R.id.email);
        TextView name = (TextView) navigationView.getHeaderView(0).findViewById(R.id.name);
        ImageView prof_pic = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.profile_image);

        //Toast.makeText(this,tv.getText().toString(),Toast.LENGTH_SHORT).show();
        navigationView.setNavigationItemSelectedListener(this);

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
            Intent i = new Intent(MainActivity.this, UserProfile.class);
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
}
