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

public class model_coolpad_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_coolpad_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_coolpad_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i = new Intent(model_coolpad_p.this, brand_pp.class);
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
                    collapsingToolbarLayout.setTitle("What Model is Your Coolpad Phone?");
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
        Glide.with(this).load(R.mipmap.ic_coolpad).into(imageView);
    }

    public void ch_coolpad_note(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "coolpad_note");
        editor.apply();
        Toast.makeText(this, "Note", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_coolpad_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_coolpad_cool(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "coolpad_cool");
        editor.apply();
        Toast.makeText(this, "Cool", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_coolpad_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_coolpad_dazen(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "coolpad_dazen");
        editor.apply();
        Toast.makeText(this, "Dazen", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_coolpad_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_coolpad_mega(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "coolpad_mega");
        editor.apply();
        Toast.makeText(this, "Mega", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_coolpad_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_coolpad_conjr(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Conjr");
        editor.apply();
        Toast.makeText(this, "Conjr", Toast.LENGTH_SHORT).show();
    }
    public void ch_coolpad_max(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Max");
        editor.apply();
        Toast.makeText(this, "Max", Toast.LENGTH_SHORT).show();
    }
    public void ch_coolpad_rogue(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Rogue");
        editor.apply();
        Toast.makeText(this, "Rogue", Toast.LENGTH_SHORT).show();
    }

}