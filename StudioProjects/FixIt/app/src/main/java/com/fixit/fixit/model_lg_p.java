package com.fixit.fixit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class model_lg_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_lg_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_lg_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_lg_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
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
                    collapsingToolbarLayout.setTitle("What Model is Your LG Phone?");
                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });
        collapsingToolbarLayout.setTitle(" ");

        loadBackdrop();
    }
    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_lg).into(imageView);
    }

    public void ch_lg_x(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_x");
        editor.apply();
        Toast.makeText(this, "X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_wine(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_wine");
        editor.apply();
        Toast.makeText(this, "Wine", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_v(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_v");
        editor.apply();
        Toast.makeText(this, "V", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_t(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_t");
        editor.apply();
        Toast.makeText(this, "T", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_stylus(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_stylus");
        editor.apply();
        Toast.makeText(this, "Stylus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_spirit(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_spirit");
        editor.apply();
        Toast.makeText(this, "Spirit", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_optimus(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_optimus");
        editor.apply();
        Toast.makeText(this, "Optimus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_lucid(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_lucid");
        editor.apply();
        Toast.makeText(this, "Lucid", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_magna(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_magna");
        editor.apply();
        Toast.makeText(this, "Magna", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_leon(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_leon");
        editor.apply();
        Toast.makeText(this, "Leon", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_l(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_l");
        editor.apply();
        Toast.makeText(this, "L", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_k(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_k");
        editor.apply();
        Toast.makeText(this, "K", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_joy(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_joy");
        editor.apply();
        Toast.makeText(this, "Joy", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_f(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_f");
        editor.apply();
        Toast.makeText(this, "F", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_g(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_g");
        editor.apply();
        Toast.makeText(this, "G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_nexus(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_nexus");
        editor.apply();
        Toast.makeText(this, "Nexus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_isai(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_isai");
        editor.apply();
        Toast.makeText(this, "Isai", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_cookie(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_cookie");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_e(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lg_e");
        editor.apply();
        Toast.makeText(this, "E", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lg_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lg_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "A290");
        editor.apply();
        Toast.makeText(this, "A290", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_aka(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "AKA");
        editor.apply();
        Toast.makeText(this, "AKA", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_band(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Band Play");
        editor.apply();
        Toast.makeText(this, "Band Play", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_class(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Class");
        editor.apply();
        Toast.makeText(this, "Class", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_cougar(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Cougar A350");
        editor.apply();
        Toast.makeText(this, "Cougar A350 ", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_xl(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "XL");
        editor.apply();
        Toast.makeText(this, "XL", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_fireweb(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Fireweb");
        editor.apply();
        Toast.makeText(this, "Fireweb", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_gentle(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Gentle");
        editor.apply();
        Toast.makeText(this, "Gentle", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_ice(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Ice Cream Smart");
        editor.apply();
        Toast.makeText(this, "Ice Cream Smart", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_max(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Max");
        editor.apply();
        Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_ray(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Ray");
        editor.apply();
        Toast.makeText(this, "Ray", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_s(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "S365");
        editor.apply();
        Toast.makeText(this, "S365", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_u(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "U");
        editor.apply();
        Toast.makeText(this, "U", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_volt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Volt");
        editor.apply();
        Toast.makeText(this, "Volt", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_vu(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Vu 3");
        editor.apply();
        Toast.makeText(this, "Vu 3", Toast.LENGTH_SHORT).show();
    }
    public void ch_lg_zero(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Zero");
        editor.apply();
        Toast.makeText(this, "Zero", Toast.LENGTH_SHORT).show();
    }

}
