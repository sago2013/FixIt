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

public class model_i_cloud_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_i_cloud_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_i_cloud_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_i_cloud_p.this, model_intex_p.class);
                startActivity(i);
            }
        });
    }
    public void ch_i_cloud_3g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_3g");
        editor.apply();
        Toast.makeText(this, "Cloud 3G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_4g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_4g");
        editor.apply();
        Toast.makeText(this, "Cloud 4G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_m(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_m");
        editor.apply();
        Toast.makeText(this, "Cloud M", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_n(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_n");
        editor.apply();
        Toast.makeText(this, "Cloud N", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_q(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_q");
        editor.apply();
        Toast.makeText(this, "Cloud Q", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_string(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_string");
        editor.apply();
        Toast.makeText(this, "Cloud String", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_x(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_x");
        editor.apply();
        Toast.makeText(this, "Cloud X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_y(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_y");
        editor.apply();
        Toast.makeText(this, "Cloud Y", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_i_cloud_other(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_cloud_other");
        editor.apply();
        Toast.makeText(this, "Other Cloud Models", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_cloud_p.this, model_specific_list.class);
        startActivity(i);
    }
}
