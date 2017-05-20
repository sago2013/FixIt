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

public class model_blu_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_blu_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_blu_p.this, MainActivity.class);
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
                    Intent i = new Intent(model_blu_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_blu_p.this, brand_pp.class);
                    startActivity(i);
                }
            }
        });
    }

    public void ch_blu_life(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "blu_life");
        editor.apply();
        Toast.makeText(this, "Life", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_blu_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_blu_vivo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "blu_vivo");
        editor.apply();
        Toast.makeText(this, "Vivo", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_blu_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_blu_pure(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "blu_pure");
        editor.apply();
        Toast.makeText(this, "Pure", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_blu_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_blu_energy(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "blu_energy");
        editor.apply();
        Toast.makeText(this, "Energy", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_blu_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_blu_r1p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "R1 Plus");
        editor.apply();
        Toast.makeText(this, "R1 Plus", Toast.LENGTH_SHORT).show();
    }

    public void ch_blu_tank2(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Tank 2");
        editor.apply();
        Toast.makeText(this, "Tank 2", Toast.LENGTH_SHORT).show();
    }

    public void ch_blu_studio(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Studio Energy 2");
        editor.apply();
        Toast.makeText(this, "Studio Energy 2", Toast.LENGTH_SHORT).show();
    }
    public void ch_blu_diva(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Diva II");
        editor.apply();
        Toast.makeText(this, "Diva II", Toast.LENGTH_SHORT).show();
    }

}