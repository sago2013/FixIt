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

public class model_i_aqua_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_i_aqua_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_i_aqua_p.this, MainActivity.class);
                startActivity(i);
        /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(model_i_aqua_p.this, model_intex_p.class);
                startActivity(i);
            }
        });
    }

    public void ch_i_aqua_3g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_3g");
        editor.apply();
        Toast.makeText(this, "Aqua 3G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_4(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_4");
        editor.apply();
        Toast.makeText(this, "Aqua 4", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_4g(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_4g");
        editor.apply();
        Toast.makeText(this, "Aqua 4G", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_5(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_5");
        editor.apply();
        Toast.makeText(this, "Aqua 5", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_a(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_a");
        editor.apply();
        Toast.makeText(this, "Aqua A", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_ace(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_ace");
        editor.apply();
        Toast.makeText(this, "Aqua Ace", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_air(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_air");
        editor.apply();
        Toast.makeText(this, "Aqua Air", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_curve(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_curve");
        editor.apply();
        Toast.makeText(this, "Aqua Curve", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_craze(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_craze");
        editor.apply();
        Toast.makeText(this, "Aqua Craze", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_desire(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_desire");
        editor.apply();
        Toast.makeText(this, "Aqua Desire", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_dream(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_dream");
        editor.apply();
        Toast.makeText(this, "Aqua Dream", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_eco(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_eco");
        editor.apply();
        Toast.makeText(this, "Aqua Eco", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_hd(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_hd");
        editor.apply();
        Toast.makeText(this, "Aqua HD", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_i(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_i");
        editor.apply();
        Toast.makeText(this, "Aqua i", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_lions(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_lions");
        editor.apply();
        Toast.makeText(this, "Aqua Lions", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_life(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_life");
        editor.apply();
        Toast.makeText(this, "Aqua Life", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_marvel(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_marvel");
        editor.apply();
        Toast.makeText(this, "Aqua Marvel", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_n(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_n");
        editor.apply();
        Toast.makeText(this, "Aqua N", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_power(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_power");
        editor.apply();
        Toast.makeText(this, "Aqua Power", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_q(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_q");
        editor.apply();
        Toast.makeText(this, "Aqua Q", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_raze(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_raze");
        editor.apply();
        Toast.makeText(this, "Aqua Raze", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_s(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_s");
        editor.apply();
        Toast.makeText(this, "Aqua S", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_sense(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_sense");
        editor.apply();
        Toast.makeText(this, "Aqua Sense", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_speed(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_speed");
        editor.apply();
        Toast.makeText(this, "Aqua Speed", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_star(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_star");
        editor.apply();
        Toast.makeText(this, "Aqua Star", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_strong(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_strong");
        editor.apply();
        Toast.makeText(this, "Aqua Strong", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_t(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_t");
        editor.apply();
        Toast.makeText(this, "Aqua T", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_trend(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_trend");
        editor.apply();
        Toast.makeText(this, "Aqua Trend", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_v(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_v");
        editor.apply();
        Toast.makeText(this, "Aqua V", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_wonder(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_wonder");
        editor.apply();
        Toast.makeText(this, "Aqua Wonder", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_x(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_x");
        editor.apply();
        Toast.makeText(this, "Aqua X", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_xtreme(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_xtreme");
        editor.apply();
        Toast.makeText(this, "Aqua Xtreme", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_y(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_y");
        editor.apply();
        Toast.makeText(this, "Aqua Y", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }

    public void ch_i_aqua_other(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "i_aqua_other");
        editor.apply();
        Toast.makeText(this, "Other Aqua Modles", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_i_aqua_p.this, model_specific_list.class);
        startActivity(i);
    }
}



