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

public class model_lenovo_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_lenovo_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_lenovo_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_lenovo_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }
    public void ch_lenovo_zuk(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_zuk");
        editor.apply();
        Toast.makeText(this, "Zuk", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_vibe(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_vibe");
        editor.apply();
        Toast.makeText(this, "Vibe", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_s(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_s");
        editor.apply();
        Toast.makeText(this, "S", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_phab(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_phab");
        editor.apply();
        Toast.makeText(this, "Phab", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_p(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_p");
        editor.apply();
        Toast.makeText(this, "P", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_k(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_k");
        editor.apply();
        Toast.makeText(this, "K", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_a(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lenovo_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lenovo_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_lenovo_lemon(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Lemon 3");
        editor.apply();
        Toast.makeText(this, "Lemon 3", Toast.LENGTH_SHORT).show();
    }
    public void ch_lenovo_r(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "RocStar (A319)");
        editor.apply();
        Toast.makeText(this, "RocStar (A319)", Toast.LENGTH_SHORT).show();
    }
    public void ch_lenovo_sis(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Sisley S90");
        editor.apply();
        Toast.makeText(this, "Sisley S90", Toast.LENGTH_SHORT).show();
    }
    public void ch_lenovo_z(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Z2 Plus");
        editor.apply();
        Toast.makeText(this, "Z2 Plus", Toast.LENGTH_SHORT).show();
    }

}
