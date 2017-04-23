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

public class model_samsung_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_samsung_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_samsung_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_samsung_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }


    public void ch_sam_primo(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_primo");
        editor.apply();
        Toast.makeText(this, "primo", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_sam_mpower(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_mpower");
        editor.apply();
        Toast.makeText(this, "mpower", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_sam_metro(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_metro");
        editor.apply();
        Toast.makeText(this, "metro", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_hero(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_hero");
        editor.apply();
        Toast.makeText(this, "hero", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_sam_guru(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_guru");
        editor.apply();
        Toast.makeText(this, "guru", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_galaxy(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_galaxy");
        editor.apply();
        Toast.makeText(this, "galaxy", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_E2(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_E2");
        editor.apply();
        Toast.makeText(this, "E2", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_B2(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_B2");
        editor.apply();
        Toast.makeText(this, "B2", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_rex(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_rex");
        editor.apply();
        Toast.makeText(this, "rex", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_sam_w(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_w");
        editor.apply();
        Toast.makeText(this, "w", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_wave(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_wave");
        editor.apply();
        Toast.makeText(this, "wave", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_z(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_z");
        editor.apply();
        Toast.makeText(this, "z", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_champ(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "sam_champ");
        editor.apply();
        Toast.makeText(this, "B2", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_samsung_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_sam_SI(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "S III Neo");
        editor.apply();
        Toast.makeText(this, "S III Neo", Toast.LENGTH_SHORT).show();

    }
    public void ch_sam_chat(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Chat");
        editor.apply();
        Toast.makeText(this, "Chat", Toast.LENGTH_SHORT).show();

    }
    public void ch_sam_g9(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "G9198");
        editor.apply();
        Toast.makeText(this, "G9198", Toast.LENGTH_SHORT).show();

    }

    public void ch_sam_omnia(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Omnia M");
        editor.apply();
        Toast.makeText(this, "Omnia M", Toast.LENGTH_SHORT).show();

    }
    public void ch_sam_star(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Star 3 Duos");
        editor.apply();
        Toast.makeText(this, "Star 3 Duos", Toast.LENGTH_SHORT).show();

    }
    public void ch_sam_SM(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "SM-G9098");
        editor.apply();
        Toast.makeText(this, "SM-G9098", Toast.LENGTH_SHORT).show();

    }
    public void ch_sam_gt(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "GT-E2202");
        editor.apply();
        Toast.makeText(this, "GT-E2202", Toast.LENGTH_SHORT).show();

    }

    public void ch_sam_ativ(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Ativ SE");
        editor.apply();
        Toast.makeText(this, "Ative SE", Toast.LENGTH_SHORT).show();
    }
}
