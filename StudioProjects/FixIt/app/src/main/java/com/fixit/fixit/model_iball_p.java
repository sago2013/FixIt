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

public class model_iball_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_iball_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_iball_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_iball_p.this, brand_pp.class);
                startActivity(i);
            }
        });
    }

    public void ch_iball_cobalt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_cobalt");
        editor.apply();
        Toast.makeText(this, "Cobalt", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_i(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_i");
        editor.apply();
        Toast.makeText(this, "i", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_fab(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_fab");
        editor.apply();
        Toast.makeText(this, "Fab", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_aura(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_aura");
        editor.apply();
        Toast.makeText(this, "Aura", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_vogue(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_vogue");
        editor.apply();
        Toast.makeText(this, "Vogue", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_vibe(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor= mPrefs.edit();
        editor.putString("model_spec", "iball_vibe");
        editor.apply();
        Toast.makeText(this, "Vibe", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_glam(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "iball_glam");
        editor.apply();
        Toast.makeText(this, "Glam", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iball_splash(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Splash 2D");
        editor.apply();
        Toast.makeText(this, "Splash 2D", Toast.LENGTH_SHORT).show();
    }
    public void ch_iball_trio(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Trio 01");
        editor.apply();
        Toast.makeText(this, "Trio 01", Toast.LENGTH_SHORT).show();
    }
    public void ch_iball_gracia(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Gracia 6");
        editor.apply();
        Toast.makeText(this, "Gracia 6", Toast.LENGTH_SHORT).show();
    }
    public void ch_iball_aspire(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Aspire QE 45");
        editor.apply();
        Toast.makeText(this, "Aspire QE 45", Toast.LENGTH_SHORT).show();
    }
    public void ch_iball_macho(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Macho 5");
        editor.apply();
        Toast.makeText(this, "Macho 5", Toast.LENGTH_SHORT).show();
    }
    public void ch_iball_andi(View view){
        Toast.makeText(this, "One Touch", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_iball_p.this,model_andi_p.class);
        startActivity(i);
    }



}
