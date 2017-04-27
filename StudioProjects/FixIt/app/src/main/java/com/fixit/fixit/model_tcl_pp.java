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

public class model_tcl_pp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_tcl_pp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_tcl_pp.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_tcl_pp.this,model_tcl_p.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }
    public void ch_tcl_ot_fire(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_fire");
        editor.apply();
        Toast.makeText(this, "OT Fire", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_ot_hero(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_hero");
        editor.apply();
        Toast.makeText(this, "OT hero", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }public void ch_tcl_ot_idol(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_idol");
        editor.apply();
        Toast.makeText(this, "OT Idol", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_ot_pixi(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_pixi");
        editor.apply();
        Toast.makeText(this, "OT Pixi", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_ot_pop(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_pop");
        editor.apply();
        Toast.makeText(this, "OT Pop Star", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_ot_star(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "tcl_ot_star");
        editor.apply();
        Toast.makeText(this, "OT Pop Star", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_tcl_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_tcl_ot_tribe(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Tribe 3040");
        editor.apply();
        Toast.makeText(this, "One Touch Tribe 3040", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_ot_2(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch 20.05");
        editor.apply();
        Toast.makeText(this, "One Touch 20.05", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_ot_fierce(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Fierce XL");
        editor.apply();
        Toast.makeText(this, "One Touch Fierce XL", Toast.LENGTH_SHORT).show();
    }
    public void ch_tcl_ot_popup(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "One Touch Pop Up");
        editor.apply();
        Toast.makeText(this, "One Touch Pop Up", Toast.LENGTH_SHORT).show();
    }


}
