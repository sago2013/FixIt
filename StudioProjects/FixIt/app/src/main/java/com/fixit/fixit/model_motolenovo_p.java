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

public class model_motolenovo_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_motolenovo_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_motolenovo_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_motolenovo_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }
    public void ch_moto_e(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_e");
        editor.apply();
        Toast.makeText(this, "E", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_moto_ex(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_ex");
        editor.apply();
        Toast.makeText(this, "EX", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_moto_droid(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_droid");
        editor.apply();
        Toast.makeText(this, "Droid", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_moto_defy(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_defy");
        editor.apply();
        Toast.makeText(this, "Defy", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_moto_g(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_g");
        editor.apply();
        Toast.makeText(this, "G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_moto_x(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_x");
        editor.apply();
        Toast.makeText(this, "X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_moto_z(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_z");
        editor.apply();
        Toast.makeText(this, "Z", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_moto_razr(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "moto_razr");
        editor.apply();
        Toast.makeText(this, "Razr", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_motolenovo_p.this,model_specific_list.class);
        startActivity(i);

    }

    public void ch_moto_nexus(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Google Nexus 6");
        editor.apply();
        Toast.makeText(this, "Google Nexus 6", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_turbo(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Moto Turbo");
        editor.apply();
        Toast.makeText(this, "Moto Turbo", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_max(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Moto Maxx");
        editor.apply();
        Toast.makeText(this, "Moto Maxx", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_m(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Moto M");
        editor.apply();
        Toast.makeText(this, "Moto M", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_c(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Moto C");
        editor.apply();
        Toast.makeText(this, "Moto C", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_milestone(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Milestone XT800");
        editor.apply();
        Toast.makeText(this, "Milestone XT800", Toast.LENGTH_SHORT).show();

    }

    public void ch_moto_fire(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Fire XT");
        editor.apply();
        Toast.makeText(this, "Fire XT", Toast.LENGTH_SHORT).show();

    }
    public void ch_moto_atrix(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Atrix 2");
        editor.apply();
        Toast.makeText(this, "Atrix 2", Toast.LENGTH_SHORT).show();

    }


}
