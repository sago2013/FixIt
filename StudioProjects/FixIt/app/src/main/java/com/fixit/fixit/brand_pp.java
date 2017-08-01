package com.fixit.fixit;

import android.content.Context;
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

public class brand_pp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_pp);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab_help = (FloatingActionButton) findViewById(R.id.fab_help);
        fab_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.title_activity_brand_pp, Snackbar.LENGTH_INDEFINITE)
                        .setAction("Still Confused?", new MoreHelp()).show();
            }
        });


        //collapsingToolbar.setTitle(getString(R.string.title_activity_brand_pp));

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
                    collapsingToolbarLayout.setTitle("What Brand is Your Android Phone?");
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

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(R.mipmap.ic_android).into(imageView);
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

    public void ch_celkon(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Celkon");
        editor.apply();
        Toast.makeText(this, "Brand: Celkon", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_celkon_p.class);
        startActivity(i);
    }

    public void ch_coolpad(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Coolpad");
        editor.apply();
        Toast.makeText(this, "Brand: Coolpad", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_coolpad_p.class);
        startActivity(i);
    }

    public void ch_datawind(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Datawind");
        editor.putString("model_spec", "datawind_p");
        editor.apply();
        Toast.makeText(this, "Brand: Datawind", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_fly(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Fly");
        editor.putString("model_spec", "fly_p");
        editor.apply();
        Toast.makeText(this, "Brand: Fly", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_gionee(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Gionee");
        editor.apply();
        Toast.makeText(this, "Brand: Gionee", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_gionee_p.class);
        startActivity(i);
    }

    public void ch_iball(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "iball");
        editor.apply();
        Toast.makeText(this, "Brand: iball", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_iball_p.class);
        startActivity(i);
    }

    public void ch_iberry(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "iberry");
        editor.putString("model_spec", "iberry_p");
        editor.apply();
        Toast.makeText(this, "Brand: iberry", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_idea(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Idea");
        editor.putString("model_spec", "idea_p");
        editor.apply();
        Toast.makeText(this, "Brand: Idea", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_infocus_p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "InFocus");
        editor.putString("model_spec", "infocus_p");
        editor.apply();
        Toast.makeText(this, "Brand: InFocus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }

    public void ch_intex_p(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Intex");
        editor.apply();
        Toast.makeText(this, "Brand: Intex", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_intex_p.class);
        startActivity(i);

    }

    public void ch_karbonn(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Karbonn");
        editor.apply();
        Toast.makeText(this, "Brand: Karbonn", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_karbonn_p.class);
        startActivity(i);
    }

    public void ch_kyocera(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Kyocera");
        editor.putString("model_spec", "kyocera_p");
        editor.apply();
        Toast.makeText(this, "Brand: Kyocera", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_zopo(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Zopo");
        editor.putString("model_spec", "zopo_p");
        editor.apply();
        Toast.makeText(this, "Brand: Zopo", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_obi(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Obi");
        editor.putString("model_spec", "obi_p");
        editor.apply();
        Toast.makeText(this, "Brand: Obi", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_mts(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "MTS");
        editor.putString("model_spec", "mts_p");
        editor.apply();
        Toast.makeText(this, "Brand: MTS", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_max(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Maxx Mobile");
        editor.putString("model_spec", "maxx_p");
        editor.apply();
        Toast.makeText(this, "Brand: Maxx Mobile ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_philips(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Philips");
        editor.putString("model_spec", "philips_p");
        editor.apply();
        Toast.makeText(this, "Brand: Philips", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_ringingbells(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Ringing Bells");
        editor.putString("model_spec", "rbells_p");
        editor.apply();
        Toast.makeText(this, "Brand: Ringing Bells", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_wickedleak(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Wickedleak");
        editor.putString("model_spec", "wickedleak_p");
        editor.apply();
        Toast.makeText(this, "Brand: Wickedleak ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_yu(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Yu");
        editor.putString("model_spec", "yu_p");
        editor.apply();
        Toast.makeText(this, "Brand: Yu ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }
    public void ch_zen(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Zen");
        editor.putString("model_spec", "zen_p");
        editor.apply();
        Toast.makeText(this, "Brand: Zen", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_sharp(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Sharp");
        editor.putString("model_spec", "sharp_p");
        editor.apply();
        Toast.makeText(this, "Brand: Sharp", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);

    }
    public void ch_lava(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Lava");
        editor.apply();
        Toast.makeText(this, "Brand: Lava", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_lava_p.class);
        startActivity(i);
    }

    public void ch_leeco(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "LeEco");
        editor.putString("model_spec", "leeco_p");
        editor.apply();
        Toast.makeText(this, "Brand: LeEco", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_specific_list.class);
        startActivity(i);
    }



/*
    public void ch_asus(View view) {
        SharedPreferences mPrefs = getApplicationContext().getSharedPreferences("table",0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("brand", "Asus");
        editor.apply();
        Toast.makeText(this, "Brand: Asus", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(brand_pp.this,model_asus_p.class);
        startActivity(i);
    }
*/
}
