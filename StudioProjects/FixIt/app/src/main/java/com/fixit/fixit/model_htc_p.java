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

public class model_htc_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_htc_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_htc_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(os.equals("windows")) {
                    Intent i = new Intent(model_htc_p.this, brand_pw.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(model_htc_p.this, brand_pp.class);
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
                    collapsingToolbarLayout.setTitle("What Model is Your HTC Phone?");
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
        Button a1 = (Button) findViewById(R.id.a1);
        Button a3 = (Button) findViewById(R.id.a3);
        Button a4 = (Button) findViewById(R.id.a4);
        Button a5 = (Button) findViewById(R.id.a5);
        Button a6 = (Button) findViewById(R.id.a6);
        Button a7 = (Button) findViewById(R.id.a7);
        Button w1 = (Button) findViewById(R.id.w1);
        Button w2 = (Button) findViewById(R.id.w2);
        Button w3 = (Button) findViewById(R.id.w3);
        Button w4 = (Button) findViewById(R.id.w4);
        Button w5 = (Button) findViewById(R.id.w5);
        Button w6 = (Button) findViewById(R.id.w6);
        Button w7 = (Button) findViewById(R.id.w7);
        Button w8 = (Button) findViewById(R.id.w8);
        Button w9 = (Button) findViewById(R.id.w9);




        if(os.equals("windows")){
            a1.setVisibility(View.GONE);
            a3.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);
            a5.setVisibility(View.GONE);
            a6.setVisibility(View.GONE);
            a7.setVisibility(View.GONE);
        }
        else{
            w1.setVisibility(View.GONE);
            w2.setVisibility(View.GONE);
            w3.setVisibility(View.GONE);
            w3.setVisibility(View.GONE);
            w4.setVisibility(View.GONE);
            w5.setVisibility(View.GONE);
            w6.setVisibility(View.GONE);
            w7.setVisibility(View.GONE);
            w8.setVisibility(View.GONE);
            w9.setVisibility(View.GONE);


        }

    }
    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_htc).into(imageView);
    }




    public void ch_htc_10(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "htc_10");
        editor.apply();
        Toast.makeText(this, "10", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_htc_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_htc_bfly(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "htc_bfly");
        editor.apply();
        Toast.makeText(this, "Butterfly", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_htc_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_htc_one(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "htc_one");
        editor.apply();
        Toast.makeText(this, "One", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_htc_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_htc_u(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "htc_u");
        editor.apply();
        Toast.makeText(this, "U", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_htc_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_htc_desire(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "htc_desire");
        editor.apply();
        Toast.makeText(this, "Desire", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_htc_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_htc_8s(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "8S");
        editor.apply();
        Toast.makeText(this, "8S", Toast.LENGTH_SHORT).show();
    }
    public void ch_htc_8x(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "8X");
        editor.apply();
        Toast.makeText(this, "8X", Toast.LENGTH_SHORT).show();
    }public void ch_htc_bolt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Bolt");
        editor.apply();
        Toast.makeText(this, "Bolt", Toast.LENGTH_SHORT).show();
    }


}
