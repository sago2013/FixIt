package com.fixit.fixit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class model_gionee_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_gionee_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_gionee_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_gionee_p.this, brand_pp.class);
                startActivity(i);
            }
        });
    }



    public void ch_gionee_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_gionee_ctrl(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_ctrl");
        editor.apply();
        Toast.makeText(this, "Ctrl", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_elife(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_elife");
        editor.apply();
        Toast.makeText(this, "Elife", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_f(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_f");
        editor.apply();
        Toast.makeText(this, "F", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_gpad(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_gpad");
        editor.apply();
        Toast.makeText(this, "Gpad", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_gionee_l(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_l");
        editor.apply();
        Toast.makeText(this, "L", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_m(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_m");
        editor.apply();
        Toast.makeText(this, "M", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_marathon(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_marathon");
        editor.apply();
        Toast.makeText(this, "Marathon", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_p");
        editor.apply();
        Toast.makeText(this, "P", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_gionee_pioneer(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_pioneer");
        editor.apply();
        Toast.makeText(this, "Pioneer", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_s(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "gionee_s");
        editor.apply();
        Toast.makeText(this, "S", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_gionee_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_gionee_dream(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Dream D1");
        editor.apply();
        Toast.makeText(this, "Dream D1", Toast.LENGTH_SHORT).show();
    }
    public void ch_gionee_gn(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "GN715");
        editor.apply();
        Toast.makeText(this, "GN715", Toast.LENGTH_SHORT).show();
    }
    public void ch_gionee_steel(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Steel 2");
        editor.apply();
        Toast.makeText(this, "Steel 2", Toast.LENGTH_SHORT).show();
    }
    public void ch_gionee_t(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "T 520");
        editor.apply();
        Toast.makeText(this, "T 520", Toast.LENGTH_SHORT).show();
    }
    public void ch_gionee_w(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "W909");
        editor.apply();
        Toast.makeText(this, "W909", Toast.LENGTH_SHORT).show();
    }



}

