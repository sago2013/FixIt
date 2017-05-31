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

public class model_karbonn_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_karbonn_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_karbonn_p.this, MainActivity.class);
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
                    Intent i = new Intent(model_karbonn_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_karbonn_p.this, brand_pp.class);
                    startActivity(i);
                }

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }
    public void ch_karbonn_platinum(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Platinum P9");
        editor.apply();
        Toast.makeText(this, "Platinum P9", Toast.LENGTH_SHORT).show();
    }
    public void ch_karbonn_s15(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "S15");
        editor.apply();
        Toast.makeText(this, "S15", Toast.LENGTH_SHORT).show();
    }
    public void ch_karbonn_sparkle(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Sparkle V");
        editor.apply();
        Toast.makeText(this, "Sparkle V", Toast.LENGTH_SHORT).show();
    }
    public void ch_karbonn_aura(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_aura");
        editor.apply();
        Toast.makeText(this, "Aura", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_quattro(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_quattro");
        editor.apply();
        Toast.makeText(this, "Quattro", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_alfa(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_alfa");
        editor.apply();
        Toast.makeText(this, "Alfa", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_k(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_k");
        editor.apply();
        Toast.makeText(this, "K", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_opium(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_opium");
        editor.apply();
        Toast.makeText(this, "Opium", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_legend(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_legend");
        editor.apply();
        Toast.makeText(this, "Legend", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_titanium(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_titanium");
        editor.apply();
        Toast.makeText(this, "Titanium", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_smart(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_smart");
        editor.apply();
        Toast.makeText(this, "Smart", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_karbonn_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "karbonn_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_karbonn_p.this, model_specific_list.class);
        startActivity(i);
    }
}
