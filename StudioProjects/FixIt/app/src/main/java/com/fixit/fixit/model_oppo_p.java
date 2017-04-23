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

public class model_oppo_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_oppo_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_oppo_p.this, MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_oppo_p.this, brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }



        public void ch_oppo_r(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_r");
            editor.apply();
            Toast.makeText(this, "r", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }

        public void ch_oppo_a(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_a");
            editor.apply();
            Toast.makeText(this, "a", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }




        public void ch_oppo_joy(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_joy");
            editor.apply();
            Toast.makeText(this, "joy", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }
        public void ch_oppo_find(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_find");
            editor.apply();
            Toast.makeText(this, "find", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }

        public void ch_oppo_mirror(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_mirror");
            editor.apply();
            Toast.makeText(this, "mirror", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }
        public void ch_oppo_neo(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_neo");
            editor.apply();
            Toast.makeText(this, "neo", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }
        public void ch_oppo_n(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "opppo_n");
            editor.apply();
            Toast.makeText(this, "n", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }
        public void ch_oppo_f(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model_spec", "oppo_f");
            editor.apply();
            Toast.makeText(this, "f", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(model_oppo_p.this,model_specific_list.class);
            startActivity(i);
        }
        public void ch_oppo_u(View view){
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("model", "oppo_u3");
            editor.apply();
            Toast.makeText(this, "U3", Toast.LENGTH_SHORT).show();

        }
    public void ch_oppo_3(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "oppo_3000");
        editor.apply();
        Toast.makeText(this, "3000", Toast.LENGTH_SHORT).show();

    }
    }


