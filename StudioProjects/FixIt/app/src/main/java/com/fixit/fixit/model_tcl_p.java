package com.fixit.fixit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class model_tcl_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_tcl_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_tcl_p.this, MainActivity.class);
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
                    Intent i = new Intent(model_tcl_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_tcl_p.this, brand_pp.class);
                    startActivity(i);
                }

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        //instanciating buttons
        Button a1 = (Button) findViewById(R.id.a1);
        Button a2 = (Button) findViewById(R.id.a2);
        Button a3 = (Button) findViewById(R.id.a3);
        Button a4 = (Button) findViewById(R.id.a4);
        Button a5 = (Button) findViewById(R.id.a5);
        Button a6 = (Button) findViewById(R.id.a6);
        Button a7 = (Button) findViewById(R.id.a7);
        Button a8 = (Button) findViewById(R.id.a8);
        Button a9 = (Button) findViewById(R.id.a9);
        Button a10 = (Button) findViewById(R.id.a10);
        Button a11 = (Button) findViewById(R.id.a11);
        Button a12 = (Button) findViewById(R.id.a12);
        Button a13 = (Button) findViewById(R.id.a13);
        Button a14 = (Button) findViewById(R.id.a14);
        Button a15 = (Button) findViewById(R.id.a15);
        Button a16 = (Button) findViewById(R.id.a16);
        Button a17 = (Button) findViewById(R.id.a17);
        Button a18 = (Button) findViewById(R.id.a18);
        Button a19 = (Button) findViewById(R.id.a19);
        Button a20 = (Button) findViewById(R.id.a20);
        Button w1 = (Button) findViewById(R.id.w1);
        Button w2 = (Button) findViewById(R.id.w2);



        if (os.equals("windows")) {
            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
            a3.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);
            a5.setVisibility(View.GONE);
            a6.setVisibility(View.GONE);
            a7.setVisibility(View.GONE);
            a8.setVisibility(View.GONE);
            a9.setVisibility(View.GONE);
            a10.setVisibility(View.GONE);
            a11.setVisibility(View.GONE);
            a12.setVisibility(View.GONE);
            a13.setVisibility(View.GONE);
            a14.setVisibility(View.GONE);
            a15.setVisibility(View.GONE);
            a16.setVisibility(View.GONE);
            a17.setVisibility(View.GONE);
            a18.setVisibility(View.GONE);
            a19.setVisibility(View.GONE);
            a20.setVisibility(View.GONE);
        } else {
            w1.setVisibility(View.GONE);
            w2.setVisibility(View.GONE);
        }
    }

    public void ch_tcl_ot(View view){
        Toast.makeText(this, "One Touch", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_tcl_pp.class);
        startActivity(i);
    }
    public void ch_tcl_pop(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_pop");
        editor.apply();
        Toast.makeText(this, "Pop", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_pixi(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_pixi");
        editor.apply();
        Toast.makeText(this, "Pixi", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_hero(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_hero");
        editor.apply();
        Toast.makeText(this, "Hero", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_idol(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_idol");
        editor.apply();
        Toast.makeText(this, "Idol", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_fire(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_fire");
        editor.apply();
        Toast.makeText(this, "Fire", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_flash(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_flash");
        editor.apply();
        Toast.makeText(this, "Flash", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_a(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_p.this,model_specific_list.class);
        startActivity(i);
    }


    public void ch_tcl_lancet(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "TCL Lancet");
        editor.apply();
        Toast.makeText(this, "Lancet", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_orange(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Orange Klif");
        editor.apply();
        Toast.makeText(this, "Orange Klif", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_plus(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Plus 10");
        editor.apply();
        Toast.makeText(this, "Plus 10", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_shine(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Shine Lite");
        editor.apply();
        Toast.makeText(this, "Shine Lite", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_u5(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "U5");
        editor.apply();
        Toast.makeText(this, "U5", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_x1(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "X1");
        editor.apply();
        Toast.makeText(this, "X1", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_xl(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "XL");
        editor.apply();
        Toast.makeText(this, "XL", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_otf(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Flash");
        editor.apply();
        Toast.makeText(this, "One Touch Flashf", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_ott(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Tribe 3040");
        editor.apply();
        Toast.makeText(this, "One Touch Tribe 3040", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_ot2(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch 20.05");
        editor.apply();
        Toast.makeText(this, "One Touch 20.05", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_otfx(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Fierce XL");
        editor.apply();
        Toast.makeText(this, "One Touch Fierce XL", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_otgp(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Go Play");
        editor.apply();
        Toast.makeText(this, "One Touch Go Play", Toast.LENGTH_SHORT).show();
    }



}
