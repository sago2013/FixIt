package com.fixit.fixit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class model_specific_list extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<model_spec> specs;
    private Context context;

    //Getting the info to set up the scrollbar
    private String model_title = "";
    private String model_header = "";
    private int resID = R.mipmap.ic_apple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_specific_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String id = mPrefs.getString("model_spec", "error");
        final String os = mPrefs.getString("os", "error");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(model_specific_list.this,MainActivity.class);
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
                    Intent i = new Intent(model_specific_list.this, brand_pw.class);
                    startActivity(i);
                }
                else if(os.equals("android")){
                    Intent i = new Intent(model_specific_list.this, brand_pp.class);
                    //Intent i = new Intent(model_specific_list.this, model_lava_p.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(model_specific_list.this, brand_p.class);
                    startActivity(i);
                }
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        specs = new ArrayList<>();






        populate(id);
        setSupportActionBar(toolbar);
        // specify an adapter (see also next example)
        mAdapter = new mode__specific_adapter(specs, context);
        mRecyclerView.setAdapter(mAdapter);

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
                    collapsingToolbarLayout.setTitle(model_title);
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

        Glide.with(this).load(resID).into(imageView);
    }

    private void populate(String id) {
        Context context = this.getApplicationContext();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        String prespec = getString(R.string.pre_spec);
        String postspec = getString(R.string.post_spec);
        String prespec2 = getString(R.string.pre_spec1);

        if (id.equals("honor")) {
            toolbar.setTitle(prespec + " Huawei Honor "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_honor);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
            model_title = " ";

        }
        if (id.equals("huaw_y")) {
            toolbar.setTitle(prespec + " Huawei Y "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_y);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_u")) {
            toolbar.setTitle(prespec + " Huawei U "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_u);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nexus")) {
            toolbar.setTitle(prespec + " Huawei Nexus "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_nexus);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_g")) {
            toolbar.setTitle(prespec + " Huawei G "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_g);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_p")) {
            toolbar.setTitle(prespec + " Huawei P "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_p);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nova")) {
            toolbar.setTitle(prespec + " Huawei Nova "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_nova);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_m")) {
            toolbar.setTitle(prespec + " Huawei M "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_m);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_mate")) {
            toolbar.setTitle(prespec + " Huawei Mate "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_mate);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ideos")) {
            toolbar.setTitle(prespec + " Huawei Ideos "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_ideos);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_enjoy")) {
            toolbar.setTitle(prespec + " Huawei Enjoy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_enjoy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ascend")) {
            toolbar.setTitle(prespec + " Huawei Ascend "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.huaw_ascend);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_r")) {
            toolbar.setTitle(prespec + " Oppo R "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_r);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_a")) {
            toolbar.setTitle(prespec + " Oppo A "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_a);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_mirror")) {
            toolbar.setTitle(prespec + " Oppo Mirror "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_mirror);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_joy")) {
            toolbar.setTitle(prespec + " Oppo Joy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_joy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_find")) {
            toolbar.setTitle(prespec + " Oppo Find "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_find);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("opppo_n")) {
            toolbar.setTitle(prespec + " Oppo N "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_n);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_neo")) {
            toolbar.setTitle(prespec + " Oppo Neo "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_neo);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_f")) {
            toolbar.setTitle(prespec + " Oppo F "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.oppo_f);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_primo")) {
            toolbar.setTitle(prespec + " Samsung Primo "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_primo);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_mpower")) {
            toolbar.setTitle(prespec + " Samsung Mpower "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_mpower);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_metro")) {
            toolbar.setTitle(prespec + " Samsung Metro "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_metro);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_E2")) {
            toolbar.setTitle(prespec + " Samsung E1 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sam_E1);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_hero")) {
            toolbar.setTitle(prespec + " Samsung Hero "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_hero);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_guru")) {
            toolbar.setTitle(prespec + " Samsung Guru "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_guru);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_galaxy")) {
            toolbar.setTitle(prespec + " Samsung Galaxy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_galaxy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_rex")) {
            toolbar.setTitle(prespec + " Samsung Rex "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_rex);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_champ")) {
            toolbar.setTitle(prespec + " Samsung Champ "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.sam_champ);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_z")) {

            toolbar.setTitle(prespec + " Samsung Z "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sam_z);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_B2")) {

            toolbar.setTitle(prespec + " Samsung B2 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sam_B2);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_w")) {

            toolbar.setTitle(prespec + " Samsung W "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sam_w);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_wave")) {

            toolbar.setTitle(prespec + " Samsung Wave "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sam_wave);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_x")) {

            toolbar.setTitle(prespec + " Nokia X "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.nokia_x);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_asha")) {

            toolbar.setTitle(prespec + " Nokia Asha "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.nokia_asha);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_other")) {

            toolbar.setTitle(prespec2 + " Nokia "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.nokia_other);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_c")) {
            toolbar.setTitle(prespec + " Nokia C "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.nokia_c);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_e")) {
            toolbar.setTitle(prespec + " Nokia E "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.nokia_e);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_lumina")) {
            toolbar.setTitle(prespec + " Nokia Lumia "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.nokia_lumina);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("micro_lumia_dual")) {
            toolbar.setTitle(prespec + " MicroSoft Lumia Dual SIM "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.micro_lumia_dual);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("micro_lumia")) {
            toolbar.setTitle(prespec + " Microsoft Lumia "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.micro_lumia);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_x")) {
            toolbar.setTitle(prespec + " Moto X "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("moto_z")) {
            toolbar.setTitle(prespec + " Moto Z "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_z);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_razr")) {
            toolbar.setTitle(prespec + " Motorola Razr "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_razr);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_g")) {
            toolbar.setTitle(prespec + " Moto G "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_defy")) {
            toolbar.setTitle(prespec + " Motorola Defy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_defy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_e")) {
            toolbar.setTitle(prespec + " Moto E "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_e);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_ex")) {
            toolbar.setTitle(prespec + " Motorola Ex "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_ex);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_droid")) {
            toolbar.setTitle(prespec + " Motorola Droid "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.moto_droid);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_10")) {
            toolbar.setTitle(prespec + " HTC 10 "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.htc_10);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_bfly")) {
            toolbar.setTitle(prespec + " HTC Butterfly "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.htc_bfly);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_desire")) {
            toolbar.setTitle(prespec + " HTC Desire "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.htc_desire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_one")) {
            toolbar.setTitle(prespec + " HTC One "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.htc_one);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_u")) {
            toolbar.setTitle(prespec + " HTC U "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.htc_u);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("xia_mi")) {
            toolbar.setTitle(prespec + " Xiaomi Mi "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.xia_mi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("xia_redmi")) {
            toolbar.setTitle(prespec + " Xiaomi Redmi "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.xia_redmi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("zte_axon")) {
            toolbar.setTitle(prespec + " ZTE Axon "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_axon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_blade")) {
            toolbar.setTitle(prespec + " ZTE Blade "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_blade);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_grand")) {
            toolbar.setTitle(prespec + " ZTE Grand "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_grand);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_kis")) {
            toolbar.setTitle(prespec + " ZTE Kis "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_kis);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_nubia")) {
            toolbar.setTitle(prespec + " ZTE Nubia "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_nubia);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_open")) {

            toolbar.setTitle(prespec + " ZTE Open "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.zte_open);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_star")) {
            toolbar.setTitle(prespec + " ZTE Star "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_star);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_v")) {
            toolbar.setTitle(prespec + " ZTE Star "+postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_v")) {
            toolbar.setTitle(prespec + " ZTE V "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_zmax")) {
            toolbar.setTitle(prespec + " ZTE Zmax "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.zte_zmax);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_a")) {
            toolbar.setTitle(prespec + " Alcatel A "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_flash")) {
            toolbar.setTitle(prespec + " Alcatel Flash "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_flash);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_fire")) {
            toolbar.setTitle(prespec + " Alcatel Fire "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_fire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("tcl_hero")) {
            toolbar.setTitle(prespec + " Alcatel Hero "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_hero);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_idol")) {
            toolbar.setTitle(prespec + " Alcatel Idol "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_idol);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_pixi")) {
            toolbar.setTitle(prespec + " Alcatel Pixi "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_pixi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_pop")) {
            toolbar.setTitle(prespec + " Alcatel Pop "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_pop);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot")) {
            toolbar.setTitle(prespec + " Alcatel One Touch "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_cookie")) {
            toolbar.setTitle(prespec + " LG Cookie "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_cookie);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_e")) {
            toolbar.setTitle(prespec + " LG E "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_e);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_f")) {
            toolbar.setTitle(prespec + " LG F "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_f);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_g")) {
            toolbar.setTitle(prespec + " LG G "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_isai")) {
            toolbar.setTitle(prespec + " LG isai "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_isai);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_joy")) {
            toolbar.setTitle(prespec + " LG Joy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_joy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_k")) {
            toolbar.setTitle(prespec + " LG K "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_k);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_l")) {
            toolbar.setTitle(prespec + " LG L "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_l);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_leon")) {
            toolbar.setTitle(prespec + " LG Leon "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_leon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_lucid")) {
            toolbar.setTitle(prespec + " LG Lucid "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_lucid);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_magna")) {
            toolbar.setTitle(prespec + " LG Magna "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_magna);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_nexus")) {
            toolbar.setTitle(prespec + " LG Nexus "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_nexus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_optimus")) {
            toolbar.setTitle(prespec + " LG Optimus "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_optimus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_spirit")) {
            toolbar.setTitle(prespec + " LG Spirit "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_spirit);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_stylus")) {
            toolbar.setTitle(prespec + " LG Stylus "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_stylus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_t")) {
            toolbar.setTitle(prespec + " LG T "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_t);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_v")) {
            toolbar.setTitle(prespec + " LG V "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_wine")) {
            toolbar.setTitle(prespec + " LG Wine "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_wine);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_x")) {
            toolbar.setTitle(prespec + " LG X "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lg_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_s")) {
            toolbar.setTitle(prespec + " Lenovo S"+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_s);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("lenovo_a")) {
            toolbar.setTitle(prespec + " Lenovo A "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_k")) {
            toolbar.setTitle(prespec + " Lenovo K "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_k);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_p")) {
            toolbar.setTitle(prespec + " Lenovo P "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_phab")) {
            toolbar.setTitle(prespec + " Lenovo Phab "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_phab);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_vibe")) {
            toolbar.setTitle(prespec + " Lenovo Vibe "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_vibe);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_zuk")) {
            toolbar.setTitle(prespec + " Lenovo Zuk "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.lenovo_zuk);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_fire")) {
            toolbar.setTitle(prespec + " One Touch Fire "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_fire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_hero")) {
            toolbar.setTitle(prespec + " One Touch Hero "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_hero);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_pop")) {
            toolbar.setTitle(prespec + " One Touch Pop "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_pop);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_star")) {
            toolbar.setTitle(prespec + " One Touch Pop Star "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_star);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_pixi")) {
            toolbar.setTitle(prespec + " One Touch Pixi "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_pixi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_idol")) {
            toolbar.setTitle(prespec + " One Touch Idol "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.tcl_ot_idol);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("apple")) {

            String[] title = context.getResources().getStringArray(R.array.apple_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            //setting up the collapsable toolbar
            model_title = prespec2 + " Iphone?";
            model_header = "Apple Models";
            resID = R.mipmap.ic_apple;
        }
        if (id.equals("acer_e")) {

            String[] title = context.getResources().getStringArray(R.array.acer_e);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Acer Liquid E "+ postspec;
            model_header = "Liquid E Models";
            resID = R.mipmap.ic_acer;
        }

        if (id.equals("acer_jade")) {

            String[] title = context.getResources().getStringArray(R.array.acer_jade);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Acer Liquid Jade "+ postspec;
            model_header = "Liquid Jade Models";
            resID = R.mipmap.ic_acer;
        }
        if (id.equals("acer_s")) {

            String[] title = context.getResources().getStringArray(R.array.acer_s);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Acer Liquid S "+ postspec;
            model_header = "Liquid S Models";
            resID = R.mipmap.ic_acer;
        }

        if (id.equals("acer_z")) {

            String[] title = context.getResources().getStringArray(R.array.acer_z);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Acer Liquid Z "+ postspec;
            model_header = "Liquid Z Models";
            resID = R.mipmap.ic_acer;
        }
        if (id.equals("acer_zest")) {

            String[] title = context.getResources().getStringArray(R.array.acer_zest);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Acer Liquid Zest "+ postspec;
            model_header = "Liquid Zest Models";
            resID = R.mipmap.ic_acer;
        }
        if (id.equals("adcom_p")) {
            toolbar.setTitle(prespec2 + " Adcom "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.adcom_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_pw")) {
            toolbar.setTitle(prespec2 + " Archos Windows "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.archos_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec2 + " Archos Windows "+ postspec;
            model_header = "Windows Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_graph")) {
            toolbar.setTitle(prespec + " Archos Graphite "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.archos_graph);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Graph "+ postspec;
            model_header = "Graph Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_diamond")) {

            String[] title = context.getResources().getStringArray(R.array.archos_diamond);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Diamond "+ postspec;
            model_header = "Diamond Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_xenon")) {

            String[] title = context.getResources().getStringArray(R.array.archos_xenon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Xenon "+ postspec;
            model_header = "Xenon Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_platinum")) {


            String[] title = context.getResources().getStringArray(R.array.archos_platinum);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Platinum "+ postspec;
            model_header = "Platinum Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_helium")) {

            String[] title = context.getResources().getStringArray(R.array.archos_helium);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Helium "+ postspec;
            model_header = "Helium Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("archos_oxygen")) {

            String[] title = context.getResources().getStringArray(R.array.archos_oxygen);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec + " Archos Oxygen "+ postspec;
            model_header = "Oxygen Models";
            resID = R.mipmap.ic_archos;
        }
        if (id.equals("bb_pa")) {
            String[] title = context.getResources().getStringArray(R.array.bb_pa);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec2 + " BlackBerry Android "+ postspec;
            model_header = "BlackBerry Models";
            resID = R.mipmap.ic_blackberry;
        }if (id.equals("bb_pb")) {
            String[] title = context.getResources().getStringArray(R.array.bb_pb);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            //setting up the collapsable toolbar
            model_title = prespec2 + " BlackBerry "+ postspec;
            model_header = "BlackBerry Models";
            resID = R.mipmap.ic_bb3;
        }
        if (id.equals("blu_life")) {
            toolbar.setTitle(prespec + " Blu Life "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.blu_life);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("blu_vivo")) {
            toolbar.setTitle(prespec + " Blu Vivo "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.blu_vivo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_energy")) {
            toolbar.setTitle(prespec + " Blu Energy "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.blu_energy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_pure")) {
            toolbar.setTitle(prespec + " Blu Pure "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.blu_pure);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_pw")) {
            toolbar.setTitle(prespec2 + " Blu Windows "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.blu_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("celkon_signature")) {
            toolbar.setTitle(prespec + " Celkon Signature "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_signature);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("celkon_rahman")) {
            toolbar.setTitle(prespec + " Celkon RahmanIshq "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_rahman);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("celkon_campus")) {
            toolbar.setTitle(prespec + " Celkon Campus "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_campus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("celkon_millennia")) {
            toolbar.setTitle(prespec + " Celkon Millennia "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_millennia);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("celkon_millennium")) {
            toolbar.setTitle(prespec + " Celkon Millennium "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_millennium);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("celkon_pw")) {
            toolbar.setTitle(prespec2 + " Celkon Windows "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.celkon_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("coolpad_note")) {
            toolbar.setTitle(prespec + " Coolpad Note "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.coolpad_note);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("coolpad_cool")) {
            toolbar.setTitle(prespec + " Coolpad Cool "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.coolpad_cool);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("coolpad_dazen")) {
            toolbar.setTitle(prespec + " Coolpad Dazen "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.coolpad_dazen);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("coolpad_mega")) {
            toolbar.setTitle(prespec + " Coolpad Mega "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.coolpad_mega);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("datawind_p")) {
            toolbar.setTitle(prespec2 + " Datawind "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.datawind_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("fly_p")) {

            String[] title = context.getResources().getStringArray(R.array.fly_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            model_title = prespec2 + " Fly "+ postspec;
            model_header = "Fly Models";
            resID = R.mipmap.ic_fly;
        }
        if (id.equals("gionee_a")) {
            toolbar.setTitle(prespec + " Gionee A "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("gionee_ctrl")) {
            toolbar.setTitle(prespec + " Gionee Ctrl "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_ctrl);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("gionee_elife")) {
            toolbar.setTitle(prespec + " Gionee Elife "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_elife);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_f")) {
            toolbar.setTitle(prespec + " Gionee F "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_f);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_gpad")) {
            toolbar.setTitle(prespec + " Gionee Gpad "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_gpad);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_l")) {
            toolbar.setTitle(prespec + " Gionee L "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_l);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("gionee_s")) {
            toolbar.setTitle(prespec + " Gionee S "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_s);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("gionee_m")) {
            toolbar.setTitle(prespec + " Gionee M "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_m);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_marathon")) {
            toolbar.setTitle(prespec + " Gionee Marathon "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_marathon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_p")) {
            toolbar.setTitle(prespec + " Gionee P "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("gionee_pioneer")) {
            toolbar.setTitle(prespec + " Gionee Pioneer "+ postspec);

            String[] title = context.getResources().getStringArray(R.array.gionee_pioneer);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("andi_3")) {
            toolbar.setTitle(prespec + " iBall Andi 3 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.andi_3);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("andi_4")) {
            toolbar.setTitle(prespec + " iBall Andi 4 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.andi_4);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("andi_5")) {
            toolbar.setTitle(prespec + " iBall Andi 5 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.andi_5);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("andi_uddaan")) {
            toolbar.setTitle(prespec + " iBerry Andi Uddaan "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.andi_uddaan);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_a")) {
            toolbar.setTitle(prespec + " iBall Aasaan "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_Aasaan2);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_aura")) {
            toolbar.setTitle(prespec + " iBall Aura "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_aura);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_cobalt")) {
            toolbar.setTitle(prespec + " iBall Cobalt "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_cobalt);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_fab")) {
            toolbar.setTitle(prespec + " iBall Fab "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_fab);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_glam")) {
            toolbar.setTitle(prespec + " iBall Glam "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_glam);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_i")) {
            toolbar.setTitle(prespec + " iBall i "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_i);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_vibe")) {
            toolbar.setTitle(prespec + " iBall Vibe "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_vibe);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_vogue")) {
            toolbar.setTitle(prespec + " iBall Vogue "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_vogue);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iball_pw")) {
            toolbar.setTitle(prespec2 + " iBall Windows "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iball_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_pw")) {
            toolbar.setTitle(prespec2 + " Huawei Windows "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.huaw_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("idea_p")) {
            toolbar.setTitle(prespec2 + " Idea "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.idea_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("iberry_p")) {
            toolbar.setTitle(prespec2 + " iberry "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.iberry_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("infocus_p")) {
            toolbar.setTitle(prespec2 + " InFocus "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.infocus_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("intex_turbo")) {
            toolbar.setTitle(prespec2 + " Intex Turbo "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.intex_turbo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("intex_neo")) {
            toolbar.setTitle(prespec2 + " Intex Neo "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.intex_neo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }



        if (id.equals("i_aqua_3g")) {
            toolbar.setTitle(prespec2 + " Intex Aqua 3G "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_3g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_4")) {
            toolbar.setTitle(prespec2 + " Intex Aqua 4 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_4);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_4g")) {
            toolbar.setTitle(prespec2 + " Intex Aqua 4G "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_4g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_5")) {
            toolbar.setTitle(prespec2 + " Intex Aqua 5 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_5);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_a")) {
            toolbar.setTitle(prespec2 + " Intex Aqua A "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_a2);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_ace")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Ace "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_ace);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_air")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Air "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_air);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_curve")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Curve "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_curve);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_craze")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Craze "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_craze);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_desire")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Desire "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_desire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_dream")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Dream "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_dream);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_eco")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Eco "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_eco);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_hd")) {
            toolbar.setTitle(prespec2 + " Intex Aqua HD "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_hd);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_i")) {
            toolbar.setTitle(prespec2 + " Intex Aqua i "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_i);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_lions")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Lions "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_lions);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_life")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Life "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_life);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("i_aqua_marvel")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Marvel "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_marvel);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("i_aqua_n")) {
            toolbar.setTitle(prespec2 + " Intex Aqua N "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_n);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_power")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Power "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_power);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_q")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Q "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_q);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_raze")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Raze "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_raze);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_s")) {
            toolbar.setTitle(prespec2 + " Intex Aqua S "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_s);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_sense")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Sense "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_sense);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_speed")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Speed "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_speed);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_star")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Star "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_star);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_strong")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Strong "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_strong);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_t")) {
            toolbar.setTitle(prespec2 + " Intex Aqua T "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_t);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_trend")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Trend "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_trend);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_v")) {
            toolbar.setTitle(prespec2 + " Intex Aqua V "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_wonder")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Wonder "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_wonder);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_xtreme")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Xtreme "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_xtreme);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_x")) {
            toolbar.setTitle(prespec2 + " Intex Aqua X "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_y")) {
            toolbar.setTitle(prespec2 + " Intex Aqua Y "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_y);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_aqua_other")) {
            toolbar.setTitle(prespec2 + " Intex Aqua "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_aqua_other);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_3g")) {
            toolbar.setTitle(prespec2 + " Intex Cloud 3G "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_3g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_4g")) {
            toolbar.setTitle(prespec2 + " Intex Cloud 4G "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_4g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_m")) {
            toolbar.setTitle(prespec2 + " Intex Cloud M "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_m);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_n")) {
            toolbar.setTitle(prespec2 + " Intex Cloud N "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_n);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_q")) {
            toolbar.setTitle(prespec2 + " Intex Cloud Q"+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_q);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_string")) {
            toolbar.setTitle(prespec2 + " Intex Cloud String "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_string);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_x")) {
            toolbar.setTitle(prespec2 + " Intex Cloud X "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_y")) {
            toolbar.setTitle(prespec2 + " Intex Cloud Y "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_y);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("i_cloud_other")) {
            toolbar.setTitle(prespec2 + " Intex Cloud "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.i_cloud_other);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_quattro")) {
            String[] title = context.getResources().getStringArray(R.array.karbonn_quattro);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("karbonn_alfa")) {
            toolbar.setTitle(prespec2 + " Karbonn Alfa "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_alfa);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_opium")) {
            toolbar.setTitle(prespec2 + " Karbonn Opium "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_opium);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_legend")) {
            toolbar.setTitle(prespec2 + " Karbonn Legend "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_legend);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_titanium")) {
            toolbar.setTitle(prespec2 + " Karbonn Titanium "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_titanium);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_smart")) {
            toolbar.setTitle(prespec2 + " Karbonn Smart "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_smart);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("karbonn_a")) {
            toolbar.setTitle(prespec2 + " Karbonn A "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_pw")) {
            toolbar.setTitle(prespec2 + " Karbonn Windows "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_aura")) {
            toolbar.setTitle(prespec2 + " Karbonn Aura "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_aura);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("karbonn_k")) {
            toolbar.setTitle(prespec2 + " Karbonn K "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.karbonn_k);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("lava_3g")) {
            toolbar.setTitle(prespec2 + " Lava 3G "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.lava_3g);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }

            if (id.equals("lava_a")) {
                toolbar.setTitle(prespec + " Lava A "+ postspec);
                String[] title = context.getResources().getStringArray(R.array.lava_a);
                int i = 0;
                int length;
                for (length = title.length; length > i; i++) {
                    specs.add(new model_spec(title[i]));
                }
            }
                if (id.equals("lava_arc")) {
                    toolbar.setTitle(prespec + " Lava Arc "+ postspec);
                    String[] title = context.getResources().getStringArray(R.array.lava_arc);
                    int i = 0;
                    int length;
                    for (length = title.length; length > i; i++) {
                        specs.add(new model_spec(title[i]));
                    }
                }
                    if (id.equals("lava_b")) {
                        toolbar.setTitle(prespec + " Lava B "+ postspec);
                        String[] title = context.getResources().getStringArray(R.array.lava_b);
                        int i = 0;
                        int length;
                        for (length = title.length; length > i; i++) {
                            specs.add(new model_spec(title[i]));
                        }
                    }
                        if (id.equals("lava_c")) {
                            toolbar.setTitle(prespec + " Lava C "+ postspec);
                            String[] title = context.getResources().getStringArray(R.array.lava_c);
                            int i = 0;
                            int length;
                            for (length =title.length; length >i; i++){
                                specs.add(new model_spec(title[i]));
                            }
                        }

        if (id.equals("lava_discover")) {
            toolbar.setTitle(prespec + " Lava Discover "+ postspec);
                                String[] title = context.getResources().getStringArray(R.array.lava_discover);
                                int i = 0;
                                int length;
                                for (length =title.length; length >i; i++){
                                    specs.add(new model_spec(title[i]));
                                }
        }

        if (id.equals("lava_flair")) {
            toolbar.setTitle(prespec + " Lava Flair "+ postspec);
                                    String[] title = context.getResources().getStringArray(R.array.lava_flair);
                                    int i = 0;
                                    int length;
                                    for (length =title.length; length >i; i++){
                                        specs.add(new model_spec(title[i]));
                                    }
        }

        if (id.equals("lava_kkt")) {
            toolbar.setTitle(prespec + " Lava KKT "+ postspec);
                                        String[] title = context.getResources().getStringArray(R.array.lava_kkt);
                                        int i = 0;
                                        int length;
                                        for (length =title.length; length >i; i++){
                                            specs.add(new model_spec(title[i]));
                                        }
        }

        if (id.equals("lava_m")) {
            toolbar.setTitle(prespec + " Lava M "+ postspec);
                                            String[] title = context.getResources().getStringArray(R.array.lava_m);
                                            int i = 0;
                                            int length;
                                            for (length =title.length; length >i; i++){
                                                specs.add(new model_spec(title[i]));
                                            }
        }

        if (id.equals("lava_p")) {
            toolbar.setTitle(prespec + " Lava P "+ postspec);
                                                String[] title = context.getResources().getStringArray(R.array.lava_p);
                                                int i = 0;
                                                int length;
                                                for (length =title.length; length >i; i++){
                                                    specs.add(new model_spec(title[i]));
                                                }
        }

        if (id.equals("lava_pixel")) {
            toolbar.setTitle(prespec + " Lava Pixel "+ postspec);
                                                    String[] title = context.getResources().getStringArray(R.array.lava_pixel);
                                                    int i = 0;
                                                    int length;
                                                    for (length =title.length; length >i; i++){
                                                        specs.add(new model_spec(title[i]));
                                                    }
        }


        if (id.equals("lava_v")) {
            toolbar.setTitle(prespec + " Lava V "+ postspec);
                                                        String[] title = context.getResources().getStringArray(R.array.lava_v);
                                                        int i = 0;
                                                        int length;
                                                        for (length =title.length; length >i; i++){
                                                            specs.add(new model_spec(title[i]));
                                                        }
        }

        if (id.equals("lava_x")) {
            toolbar.setTitle(prespec + " Lava X "+ postspec);
                                                            String[] title = context.getResources().getStringArray(R.array.lava_x);
                                                            int i = 0;
                                                            int length;
                                                            for (length =title.length; length >i; i++){
                                                                specs.add(new model_spec(title[i]));
                                                            }
        }

        if (id.equals("lava_z")) {
            toolbar.setTitle(prespec + " Lava Z "+ postspec);
                                                                String[] title = context.getResources().getStringArray(R.array.lava_z);
                                                                int i = 0;
                                                                int length;
                                                                for (length =title.length; length >i; i++){
                                                                    specs.add(new model_spec(title[i]));
                                                                }
        }

        if (id.equals("lava_pw")) {
            toolbar.setTitle(prespec2 + " Lava Windows "+ postspec);
                                                                    String[] title = context.getResources().getStringArray(R.array.lava_pw);
                                                                    int i = 0;
                                                                    int length;
                                                                    for (length =title.length; length >i; i++){
                                                                        specs.add(new model_spec(title[i]));
                                                                    }
        }


        if (id.equals("l_iris_3_99")) {
            toolbar.setTitle(prespec + " Iris 300 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_300_399);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_4_99")) {
            toolbar.setTitle(prespec + " Iris 400 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_400_499);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_5_99")) {
            toolbar.setTitle(prespec + " Iris 500 "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_500_599);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_alfa")) {
            toolbar.setTitle(prespec + " Iris Alfa "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_alfa);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_atom")) {
            toolbar.setTitle(prespec + " Iris Atom "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_atom);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("l_iris_fuel")) {
            toolbar.setTitle(prespec + " Iris Fuel "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_fuel);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_n")) {
            toolbar.setTitle(prespec + " Iris N "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_n);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_pro")) {
            toolbar.setTitle(prespec + " Iris Pro "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_pro);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("l_iris_x")) {
            toolbar.setTitle(prespec + " Iris X "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.l_iris_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("leeco_p")) {
            toolbar.setTitle(prespec2 + " LeEco "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.leeco_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("obi_p")) {
            toolbar.setTitle(prespec2 + " Obi "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.obi_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("mts_p")) {
            toolbar.setTitle(prespec2 + " MTS "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.mts_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("maxx_p")) {
            toolbar.setTitle(prespec2 + " Maxx Mobile "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.maxx_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("philips_p")) {
            toolbar.setTitle(prespec2 + " Philips "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.philips_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("rbells_p")) {
            toolbar.setTitle(prespec2 + " Ringing Bells  "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.rbells_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("wickedleak_p")) {
            toolbar.setTitle(prespec2 + " WickedLeak "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.wickedleak_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("yu_p")) {
            toolbar.setTitle(prespec2 + " Yu "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.yu_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zen_p")) {
            toolbar.setTitle(prespec2 + " Zen "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.zen_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }


        if (id.equals("zopo_p")) {
            toolbar.setTitle(prespec2 + " Zopo "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.zopo_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("kyocera_p")) {
            toolbar.setTitle(prespec2 + " Kyocera "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.kyocera_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sharp_p")) {
            toolbar.setTitle(prespec2 + " Sharp "+ postspec);
            String[] title = context.getResources().getStringArray(R.array.sharp_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }






    }

}

