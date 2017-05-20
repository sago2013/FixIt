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

public class brand_pp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_pp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_pp.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(brand_pp.this,brand_p.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }

    public void ch_google(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "google");
        editor.apply();
        Toast.makeText(this, "Brand: Google ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_google_p.class);
        startActivity(i);
    }

    public void ch_htc(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "htc");
        editor.apply();
        Toast.makeText(this, "Brand: HTC ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_htc_p.class);
        startActivity(i);

    }

    public void ch_samsung(View view) {
            SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString("brand", "samsung");
            editor.apply();
            Toast.makeText(this, "Brand: Samsung ", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(brand_pp.this,model_samsung_p.class);
            startActivity(i);
        }

    public void ch_lg(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "lg");
        editor.apply();
        Toast.makeText(this, "Brand: LG ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_lg_p.class);
        startActivity(i);
    }

    public void ch_microsoft(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "microsoft");
        editor.apply();
        Toast.makeText(this, "Brand: Microsoft ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_microsoft_p.class);
        startActivity(i);

    }

    public void ch_nokia(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "nokia");
        editor.apply();
        Toast.makeText(this, "Brand: Nokia ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_nokia_p.class);
        startActivity(i);
    }
    public void ch_oppo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "oppo");
        editor.apply();
        Toast.makeText(this, "Brand: Oppo ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_oppo_p.class);
        startActivity(i);
    }

    public void ch_zte(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "zte");
        editor.apply();
        Toast.makeText(this, "Brand: ZTE ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_zte_p.class);
        startActivity(i);

    }

    public void ch_xiomi(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "xiaomi");
        editor.apply();
        Toast.makeText(this, "Brand: Xaimoi ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_xiaomi_p.class);
        startActivity(i);
    }
    public void ch_motolenovo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "motorola");
        editor.apply();
        Toast.makeText(this, "Brand: Motorola(lenovo) ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_motolenovo_p.class);
        startActivity(i);
    }
    public void ch_huawei(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "huawei");
        editor.apply();
        Toast.makeText(this, "Brand: Huawei ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_huawei_p.class);
        startActivity(i);
    }
    public void ch_tcl(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "tcl");
        editor.apply();
        Toast.makeText(this, "Brand: TCL ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_tcl_p.class);
        startActivity(i);
    }


    public void ch_lenovo_p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Lenovo");
        editor.apply();
        Toast.makeText(this, "Brand: Lenovo ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_lenovo_p.class);
        startActivity(i);
    }
    public void ch_acer(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "acer");
        editor.apply();
        Toast.makeText(this, "Brand: Acer ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_acer_p.class);
        startActivity(i);
    }

    public void ch_adcom(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "adcom");
        editor.putString("model_spec", "adcom_p");
        editor.apply();
        Toast.makeText(this, "Brand: Adcom ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_archos(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "archos");
        editor.apply();
        Toast.makeText(this, "Brand: Archos ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_archos_p.class);
        startActivity(i);

    }
    public void ch_bb_pa(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "BlackBerry");
        editor.putString("model_spec", "bb_pa");
        editor.apply();
        Toast.makeText(this, "Brand: BlackBerry", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_blu(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Blu");
        editor.apply();
        Toast.makeText(this, "Brand: Blu", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_blu_p.class);
        startActivity(i);

    }

}
