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

public class brand_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }

    public void ch_android(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("os", "android");
        editor.apply();
        Toast.makeText(this, "os: Android ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_p.this,brand_pp.class);
        startActivity(i);

    }
    public void ch_apple(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("os", "apple");
        editor.putString("brand", "apple");
        editor.putString("model_spec", "apple");
        editor.apply();
        Toast.makeText(this, "os: Apple \n brand: Apple"  , Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_windows(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("os", "windows");
        editor.apply();
        Toast.makeText(this, "os: Windows ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_p.this,brand_pw.class);
        startActivity(i);


    }

    public void ch_bb_pbb(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("os", "bb");
        editor.putString("model_spec", "bb_pb");
        editor.apply();
        Toast.makeText(this, "os: BlackbBerry", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_p.this,model_specific_list.class);
        startActivity(i);
    }
}
