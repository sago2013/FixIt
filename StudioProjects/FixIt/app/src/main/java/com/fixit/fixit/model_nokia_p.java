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

public class model_nokia_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_nokia_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_nokia_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_nokia_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }
    public void ch_nokia_asha(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_asha");
        editor.apply();
        Toast.makeText(this, "Asha", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_nokia_c(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_c");
        editor.apply();
        Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_nokia_e(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_e");
        editor.apply();
        Toast.makeText(this, "E", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_nokia_lumina(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_lumina");
        editor.apply();
        Toast.makeText(this, "Lumina", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_nokia_x(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_x");
        editor.apply();
        Toast.makeText(this, "z", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_nokia_other(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "nokia_other");
        editor.apply();
        Toast.makeText(this, "Other", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_nokia_p.this,model_specific_list.class);
        startActivity(i);
    }

}
