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
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Boolean isFabOpen = false;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward, fab_open2, fab_open3, fab_close2, fab_close3;
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

        //launching default fragement
        //getSupportFragmentManager().beginTransaction()
                ///.add(R.id.frag_container, Home_fragment.newInstance(), Home_fragment.TAG)
                //.addToBackStack(null)
                //.commit();


        //fab animations, and functionalities
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_open2 =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open2);
        fab_open3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open3);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fab_close2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close2);
        fab_close3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close3);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        //rotate_bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bouce);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFAB();
                //Intent i = new Intent(MainActivity.this, device.class);
                //startActivity(i);
            }
        });
        FloatingActionButton fab_laptop = (FloatingActionButton) findViewById(R.id.fab_laptop);
        fab_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, brand_c.class);
                startActivity(i);
            }
        });
        FloatingActionButton fab_desktop = (FloatingActionButton) findViewById(R.id.fab_desktop);
        fab_desktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, fixed_feed.class);
                startActivity(i);
            }
        });
        FloatingActionButton fab_phone = (FloatingActionButton) findViewById(R.id.fab_phone);
        fab_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, brand_p.class);
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
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

        } else if (id == R.id.gotofixer) {

        } else if (id == R.id.gohome) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
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


    public void animateFAB(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fab_laptop = (FloatingActionButton) findViewById(R.id.fab_laptop);
        FloatingActionButton fab_phone = (FloatingActionButton) findViewById(R.id.fab_phone);
        FloatingActionButton fab_dektop = (FloatingActionButton) findViewById(R.id.fab_desktop);

        if(isFabOpen){

            fab.startAnimation(rotate_backward);
            fab_dektop.startAnimation(fab_close);
            fab_laptop.startAnimation(fab_close2);
            fab_phone.startAnimation(fab_close3);
            fab_dektop.setClickable(false);
            fab_phone.setClickable(false);
            fab_laptop.setClickable(false);
            isFabOpen = false;
            Log.d("Fab Animation:", "close");

        } else {


            fab.startAnimation(rotate_forward);
            //fab.startAnimation(rotate_bounce);
            fab_phone.startAnimation(fab_open);
            fab_laptop.startAnimation(fab_open2);
            fab_dektop.startAnimation(fab_open3);
            fab_laptop.setClickable(true);
            fab_dektop.setClickable(true);
            fab_phone.setClickable(true);
            isFabOpen = true;
            Log.d("Fab Animation","open");

        }
    }
}
