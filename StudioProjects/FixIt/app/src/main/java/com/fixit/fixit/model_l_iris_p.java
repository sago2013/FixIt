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

public class model_l_iris_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_l_iris_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_l_iris_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_l_iris_p.this, model_lava_p.class);
                startActivity(i);
            }
        });
    }

    public void ch_l_iris(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Iris");
        editor.apply();
        Toast.makeText(this, "Iris", Toast.LENGTH_SHORT).show();
    }

    public void ch_l_iris_100(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Iris 100");
        editor.apply();
        Toast.makeText(this, "Iris 100", Toast.LENGTH_SHORT).show();
    }
    public void ch_l_iris_250(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Iris 250");
        editor.apply();
        Toast.makeText(this, "Iris 250", Toast.LENGTH_SHORT).show();
    }
    public void ch_l_iris_selfie(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Iris Selfie 50");
        editor.apply();
        Toast.makeText(this, "Iris Selfie 50", Toast.LENGTH_SHORT).show();
    }

    public void ch_l_iris_3_99(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_3_99");
        editor.apply();
        Toast.makeText(this, "Iris 300 - 399", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_4_99(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_4_99");
        editor.apply();
        Toast.makeText(this, "Iris 400 - 499", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_5_99(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_5_99");
        editor.apply();
        Toast.makeText(this, "Iris 500 - 599", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_l_iris_alfa(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_alfa");
        editor.apply();
        Toast.makeText(this, "Iris Alfa", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_atom(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_atom");
        editor.apply();
        Toast.makeText(this, "Iris Atom", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_fuel(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_fuel");
        editor.apply();
        Toast.makeText(this, "Iris Fuel", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_n(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_n");
        editor.apply();
        Toast.makeText(this, "Iris N", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_pro(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_pro");
        editor.apply();
        Toast.makeText(this, "Iris Pro", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_l_iris_x(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "l_iris_x");
        editor.apply();
        Toast.makeText(this, "Iris X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_l_iris_p.this, model_specific_list.class);
        startActivity(i);
    }

}
