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

public class model_archos_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_archos_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_archos_p.this, MainActivity.class);
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
                    Intent i = new Intent(model_archos_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_archos_p.this, brand_pp.class);
                    startActivity(i);
                }
            }
        });
    }

    public void ch_archos_platinum(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_platinum");
        editor.apply();
        Toast.makeText(this, "Platinum", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_archos_diamond(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_diamond");
        editor.apply();
        Toast.makeText(this, "Diamond", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_archos_xenon(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_xenon");
        editor.apply();
        Toast.makeText(this, "Xenon", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_archos_helium(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_helium");
        editor.apply();
        Toast.makeText(this, "Helium", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_archos_oxygen(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_oxygen");
        editor.apply();
        Toast.makeText(this, "Oxygen", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_archos_graph(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "archos_graph");
        editor.apply();
        Toast.makeText(this, "Graphite", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_archos_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_archos_50saphir(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "50 Saphir");
        editor.apply();
        Toast.makeText(this, "50 Saphir", Toast.LENGTH_SHORT).show();
    }
    public void ch_archos_40btitanium(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "40b Titanium");
        editor.apply();
        Toast.makeText(this, "40b Titanium", Toast.LENGTH_SHORT).show();
    }

}
