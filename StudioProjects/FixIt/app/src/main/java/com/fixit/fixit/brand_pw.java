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

public class brand_pw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_pw);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_pw.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_pw.this,brand_p.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }

    public void ch_htc(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "htc");
        editor.apply();
        Toast.makeText(this, "Brand: HTC ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_htc_p.class);
        startActivity(i);

    }

    public void ch_acer(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "acer");
        editor.apply();
        Toast.makeText(this, "Brand: Acer ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_acer_p.class);
        startActivity(i);
    }
    public void ch_tcl(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "tcl");
        editor.apply();
        Toast.makeText(this, "Brand: Alcatel ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_tcl_p.class);
        startActivity(i);
    }

    public void ch_archos_pw(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "archos");
        editor.putString("model_spec", "archos_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Archos ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);

    }

    public void ch_blu(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Blu");
        editor.putString("model_spec", "blu_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Blu ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);

    }
}
