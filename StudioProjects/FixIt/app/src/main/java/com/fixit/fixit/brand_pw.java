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

public class brand_pw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_pw);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab_help = (FloatingActionButton) findViewById(R.id.fab_help);
        fab_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.title_activity_brand_pw, Snackbar.LENGTH_INDEFINITE)
                        .setAction("More Help", new MoreHelp()).show();
            }
        });


        //collapsingToolbar.setTitle(getString(R.string.title_activity_brand_pw));
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
                    collapsingToolbarLayout.setTitle("What Brand is Your Windows Phone?");
                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });
        collapsingToolbarLayout.setTitle(" ");

        loadBackdrop();

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

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_win1).into(imageView);
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

    public void ch_celkon_pw(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Celkon");
        editor.putString("model_spec", "celkon_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Celkon ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_iball_pw(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "iBall");
        editor.putString("model_spec", "iball_pw");
        editor.apply();
        Toast.makeText(this, "Brand: iBall ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_huawei(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Huawei");
        editor.putString("model_spec", "huaw_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Huawei ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_karbonn_pw(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Karbonn");
        editor.putString("model_spec", "karbonn_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Karbonn", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_lava_pw(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Lava");
        editor.putString("model_spec", "lava_pw");
        editor.apply();
        Toast.makeText(this, "Brand: Lava", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pw.this,model_specific_list.class);
        startActivity(i);
    }
}
