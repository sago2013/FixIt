package com.fixit.fixit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class model_huawei_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_huawei_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_huawei_p.this,MainActivity.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        FloatingActionButton fab_return = (FloatingActionButton) findViewById(R.id.fab_return);
        fab_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_huawei_p.this,brand_pp.class);
                startActivity(i);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.setTitle("What Model is Your Huawei Phone?");
                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });
        collapsingToolbarLayout.setTitle(" ");

        loadBackdrop();
    }
    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_huawei).into(imageView);
    }


    public void ch_honorp(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "honor");
        editor.apply();
        Toast.makeText(this, "honor", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_ascend(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_ascend");
        editor.apply();
        Toast.makeText(this, "huaw_ascend", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_y(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_y");
        editor.apply();
        Toast.makeText(this, "y", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_nexus(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_nexus");
        editor.apply();
        Toast.makeText(this, "nexus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_g(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_g");
        editor.apply();
        Toast.makeText(this, "g", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_u(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_u");
        editor.apply();
        Toast.makeText(this, "u", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_p(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_p");
        editor.apply();
        Toast.makeText(this, "p", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_m(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_m");
        editor.apply();
        Toast.makeText(this, "m", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_mate(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_mate");
        editor.apply();
        Toast.makeText(this, "mate", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_nova(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_nova");
        editor.apply();
        Toast.makeText(this, "huaw_nova", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_ideos(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model_spec", "huaw_ideos");
        editor.apply();
        Toast.makeText(this, "huaw_ideos", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(model_huawei_p.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_snapto(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Snapto");
        editor.apply();
        Toast.makeText(this, "Snapto", Toast.LENGTH_SHORT).show();

    }
    public void ch_b1(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "B199");
        editor.apply();
        Toast.makeText(this, "B199", Toast.LENGTH_SHORT).show();
    }
    public void ch_c1(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "C199S");
        editor.apply();
        Toast.makeText(this, "C199S", Toast.LENGTH_SHORT).show();
    }
    public void ch_maimang(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Maimang 5");
        editor.apply();
        Toast.makeText(this, "Maimang 5", Toast.LENGTH_SHORT).show();
    }
    public void ch_sonic(View view){
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("model", "Sonic U8650");
        editor.apply();
        Toast.makeText(this, "Sonic U8650", Toast.LENGTH_SHORT).show();
    }
}
