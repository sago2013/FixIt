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

public class model_andi_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_andi_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_andi_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_andi_p.this, model_iball_p.class);
                startActivity(i);
            }
        });
    }

    public void ch_andi_wink(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi Wink 4G");
        editor.apply();
        Toast.makeText(this, "Andi Wink 4G", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_f2f(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi F2F 5.5U");
        editor.apply();
        Toast.makeText(this, "Andi F2F 5.5U", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_blink(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi Blink 4G");
        editor.apply();
        Toast.makeText(this, "Andi Blink 4G", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_sprinter(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi Sprinter 4G");
        editor.apply();
        Toast.makeText(this, "Andi Sprinter 4G", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_avonte(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi Avonte 5");
        editor.apply();
        Toast.makeText(this, "Andi Avonte 5", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_class(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi Class X");
        editor.apply();
        Toast.makeText(this, "Andi Class X", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_107(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi 107");
        editor.apply();
        Toast.makeText(this, "Andi 107", Toast.LENGTH_SHORT).show();
    }
    public void ch_andi_hd(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Andi HD6");
        editor.apply();
        Toast.makeText(this, "Andi HD6", Toast.LENGTH_SHORT).show();
    }

    public void ch_andi_5(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "andi_5");
        editor.apply();
        Toast.makeText(this, "Andi 5", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_andi_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_andi_4(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "andi_4");
        editor.apply();
        Toast.makeText(this, "Andi 4", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_andi_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_andi_3(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "andi_3");
        editor.apply();
        Toast.makeText(this, "Andi 3", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_andi_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_andi_uddaan(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "andi_uddaan");
        editor.apply();
        Toast.makeText(this, "Andi Uddaan", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_andi_p.this, model_specific_list.class);
        startActivity(i);
    }


}
