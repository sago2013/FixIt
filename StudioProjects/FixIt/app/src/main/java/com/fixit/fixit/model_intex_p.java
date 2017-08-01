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

public class model_intex_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_intex_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_intex_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_intex_p.this, brand_pp.class);
                startActivity(i);
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
                    collapsingToolbarLayout.setTitle("What Model is Your Intex Phone?");
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
        Glide.with(this).load(R.mipmap.ic_intex).into(imageView);
    }

    public void ch_intex_eagle(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Eagle");
        editor.apply();
        Toast.makeText(this, "Eagle", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_elyt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "FLYT-e1");
        editor.apply();
        Toast.makeText(this, "ELYT-e1", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_force(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Force");
        editor.apply();
        Toast.makeText(this, "Force", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_gc(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "GC 5050");
        editor.apply();
        Toast.makeText(this, "GC 5050", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_in(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "IN 50 plus");
        editor.apply();
        Toast.makeText(this, "IN 50 plus", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_aura(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Aura Plus");
        editor.apply();
        Toast.makeText(this, "Aura Plus", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_avatar(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Avatar 3D 2.0");
        editor.apply();
        Toast.makeText(this, "Avatar 3D 2.0", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_boss(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Boss 5.1");
        editor.apply();
        Toast.makeText(this, "Boss 5.1", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_ace(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "4470 Ace");
        editor.apply();
        Toast.makeText(this, "4470 Ace", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_killer(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Killer");
        editor.apply();
        Toast.makeText(this, "Killer", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_player(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Player");
        editor.apply();
        Toast.makeText(this, "Player", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_slimzz(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Slimzz");
        editor.apply();
        Toast.makeText(this, "Slimzz", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_spark(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "index_spark");
        editor.apply();
        Toast.makeText(this, "Spark", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_u(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "U AA Power");
        editor.apply();
        Toast.makeText(this, "U AA Power", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_ultra(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Ultra 4000i");
        editor.apply();
        Toast.makeText(this, "Ultra 4000i", Toast.LENGTH_SHORT).show();
    }
    public void ch_intex_yuvi(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Yuvi Plus");
        editor.apply();
        Toast.makeText(this, "Yuvi Plus", Toast.LENGTH_SHORT).show();
    }

    public void ch_intex_neo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "intex_neo");
        editor.apply();
        Toast.makeText(this, "Neo", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_intex_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_intex_turbo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "intex_turbo");
        editor.apply();
        Toast.makeText(this, "Turbo", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_intex_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_intex_cloud(View view){
        Toast.makeText(this, "Cloud", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_intex_p.this,model_i_cloud_p.class);
        startActivity(i);
    }
    public void ch_intex_aqua(View view){
        Toast.makeText(this, "Aqua", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_intex_p.this,model_i_aqua_p.class);
        startActivity(i);
    }



}
