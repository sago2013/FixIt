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

public class model_htc_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_htc_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                Intent i = new Intent(model_htc_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
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
