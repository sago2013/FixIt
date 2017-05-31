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

public class model_lava_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_lava_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String os = mPrefs.getString("os", "error");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_lava_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(os.equals("windows")) {
                    Intent i = new Intent(model_lava_p.this, brand_pw.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(model_lava_p.this, brand_pp.class);
                    startActivity(i);
                }

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

}

    public void ch_lava_4g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "4G Connect M1");
        editor.apply();
        Toast.makeText(this, "4G Connect M1", Toast.LENGTH_SHORT).show();
    }
    public void ch_lava_icon(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Icon");
        editor.apply();
        Toast.makeText(this, "Icon", Toast.LENGTH_SHORT).show();
    }
    public void ch_lava_metal(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Metal 24");
        editor.apply();
        Toast.makeText(this, "Metal 24", Toast.LENGTH_SHORT).show();
    }
    public void ch_lava_magnum(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Magnum X604");
        editor.apply();
        Toast.makeText(this, "Magnum X604", Toast.LENGTH_SHORT).show();
    }
    public void ch_lava_s12(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "S12");
        editor.apply();
        Toast.makeText(this, "S12", Toast.LENGTH_SHORT).show();
    }


    public void ch_lava_3g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_3g");
        editor.apply();
        Toast.makeText(this, "3G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_a");
        editor.apply();
        Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_arc(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_arc");
        editor.apply();
        Toast.makeText(this, "Arc", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_b(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_b");
        editor.apply();
        Toast.makeText(this, "B", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_c(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_c");
        editor.apply();
        Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_discover(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_discover");
        editor.apply();
        Toast.makeText(this, "Discover", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_flair(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_flair");
        editor.apply();
        Toast.makeText(this, "Flair", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_kkt(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_kkt");
        editor.apply();
        Toast.makeText(this, "KKT", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_m(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_m");
        editor.apply();
        Toast.makeText(this, "M", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_p");
        editor.apply();
        Toast.makeText(this, "P", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_pixel(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_pixel");
        editor.apply();
        Toast.makeText(this, "Pixel", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_v(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_v");
        editor.apply();
        Toast.makeText(this, "V", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_x(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_x");
        editor.apply();
        Toast.makeText(this, "X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_lava_z(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "lava_z");
        editor.apply();
        Toast.makeText(this, "Z", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this, model_specific_list.class);
        startActivity(i);
    }
    public void ch_iris(View view){
        Toast.makeText(this, "Iris", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_lava_p.this,model_l_iris_p.class);
        startActivity(i);
    }

}
