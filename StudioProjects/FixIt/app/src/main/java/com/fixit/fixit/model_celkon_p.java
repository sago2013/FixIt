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

public class model_celkon_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_celkon_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_celkon_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (os.equals("windows")) {
                    Intent i = new Intent(model_celkon_p.this, brand_pw.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(model_celkon_p.this, brand_pp.class);
                    startActivity(i);
                }
            }
        });
    }

    public void ch_celkon_millennia(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "celkon_millennia");
        editor.apply();
        Toast.makeText(this, "Millennia", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_celkon_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_celkon_millennium(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "celkon_millennium");
        editor.apply();
        Toast.makeText(this, "Millennium", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_celkon_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_celkon_campus(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "celkon_campus");
        editor.apply();
        Toast.makeText(this, "Campus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_celkon_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_celkon_signature(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "celkon_signature");
        editor.apply();
        Toast.makeText(this, "Signature", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_celkon_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_celkon_rahman(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "celkon_rahman");
        editor.apply();
        Toast.makeText(this, "RahmanIshq", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_celkon_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_celkon_a119q(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "A119Q");
        editor.apply();
        Toast.makeText(this, "A119q", Toast.LENGTH_SHORT).show();
    }

    public void ch_celkon_colt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Colt A401");
        editor.apply();
        Toast.makeText(this, "Colt A401", Toast.LENGTH_SHORT).show();
    }
    public void ch_celkon_xion(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "XION S CT695");
        editor.apply();
        Toast.makeText(this, "XION S CT695", Toast.LENGTH_SHORT).show();
    }
    public void ch_celkon_q40(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Q40+");
        editor.apply();
        Toast.makeText(this, "Q40+", Toast.LENGTH_SHORT).show();
    }
    public void ch_celkon_s1(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "S1");
        editor.apply();
        Toast.makeText(this, "S1", Toast.LENGTH_SHORT).show();
    }
    public void ch_celkon_diamond(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Diamond 4G Plus");
        editor.apply();
        Toast.makeText(this, "Diamond 4G Plus", Toast.LENGTH_SHORT).show();
    }
    public void ch_celkon_monalisa(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Monalisa ML-5");
        editor.apply();
        Toast.makeText(this, "Monalisa ML-5", Toast.LENGTH_SHORT).show();
    }


}