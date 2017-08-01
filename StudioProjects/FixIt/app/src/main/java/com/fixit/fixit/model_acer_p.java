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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class model_acer_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_acer_p);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_acer_p.this, MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (os.equals("windows")) {
                    Intent i = new Intent(model_acer_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_acer_p.this, brand_pp.class);
                    startActivity(i);
                }

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
                    collapsingToolbarLayout.setTitle("What Model is Your Acer Phone?");
                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });
        collapsingToolbarLayout.setTitle(" ");

        loadBackdrop();

        //instanciating buttons
        Button w1 = (Button) findViewById(R.id.w1);
        Button w2 = (Button) findViewById(R.id.w2);
        Button w3 = (Button) findViewById(R.id.w3);
        Button a1 = (Button) findViewById(R.id.a1);
        Button a2 = (Button) findViewById(R.id.a2);
        Button a3 = (Button) findViewById(R.id.a3);
        Button a4 = (Button) findViewById(R.id.a4);
        Button a5 = (Button) findViewById(R.id.a5);
        Button a6 = (Button) findViewById(R.id.a6);


        if (os.equals("windows")) {
            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
            a3.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);
            a5.setVisibility(View.GONE);
            a6.setVisibility(View.GONE);

        } else {
            w1.setVisibility(View.GONE);
            w2.setVisibility(View.GONE);
            w3.setVisibility(View.GONE);
        }
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_acer).into(imageView);
    }


    public void ch_acer_e(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "acer_e");
        editor.apply();
        Toast.makeText(this, "Liquid E", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_acer_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_acer_jade(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "acer_jade");
        editor.apply();
        Toast.makeText(this, "Liquid Jade", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_acer_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_acer_s(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "acer_s");
        editor.apply();
        Toast.makeText(this, "Liquid S", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_acer_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_acer_z(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "acer_z");
        editor.apply();
        Toast.makeText(this, "Liquid Z", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_acer_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_acer_zest(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "acer_zest");
        editor.apply();
        Toast.makeText(this, "Liquid Zest", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_acer_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_acer_x1(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Acer Liquid X1");
        editor.apply();
        Toast.makeText(this, "Acer Liquid X1", Toast.LENGTH_SHORT).show();
    }
}
