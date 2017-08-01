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

public class model_zte_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_zte_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_zte_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_zte_p.this,brand_pp.class);
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
                    collapsingToolbarLayout.setTitle("What Model is Your ZTE Phone?");
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
        Glide.with(this).load(R.mipmap.ic_zte).into(imageView);
    }
    public void ch_zte_zmax(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_zmax");
        editor.apply();
        Toast.makeText(this, "zmax", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_v(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_v");
        editor.apply();
        Toast.makeText(this, "V", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_star(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_star");
        editor.apply();
        Toast.makeText(this, "Star", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_open(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_open");
        editor.apply();
        Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_nubia(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_nubia");
        editor.apply();
        Toast.makeText(this, "Nubia", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_kis(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_kis");
        editor.apply();
        Toast.makeText(this, "Kis", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_grand(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_grand");
        editor.apply();
        Toast.makeText(this, "Grand", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_blade(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_blade");
        editor.apply();
        Toast.makeText(this, "Blade", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_axon(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "zte_axon");
        editor.apply();
        Toast.makeText(this, "Axon", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_zte_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zte_avid(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Avid Plus");
                editor.apply();
        Toast.makeText(this, "Avid Plus", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_t(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "CYMBAL-T");
        editor.apply();
        Toast.makeText(this, "CYMBAL-T", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_geek(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Geek");
        editor.apply();
        Toast.makeText(this, "Geek", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_hawkeye(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Hawkeye");
        editor.apply();
        Toast.makeText(this, "Hawkeye", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_n(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "N919D");
        editor.apply();
        Toast.makeText(this, "N919D", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_q(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Q519T");
        editor.apply();
        Toast.makeText(this, "Q519T", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_small(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Small Fresh 4");
        editor.apply();
        Toast.makeText(this, "Small Fresh 4", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_speed(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Speed");
        editor.apply();
        Toast.makeText(this, "Speed", Toast.LENGTH_SHORT).show();
    }
    public void ch_zte_zinger(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Zinger");
        editor.apply();
        Toast.makeText(this, "Zinger", Toast.LENGTH_SHORT).show();
    }


}
