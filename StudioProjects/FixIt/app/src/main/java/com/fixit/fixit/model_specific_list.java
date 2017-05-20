package com.fixit.fixit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_specific_list);
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
                else if(os.equals("bb")){
                    Intent i = new Intent(model_specific_list.this, brand_p.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(model_specific_list.this, brand_pp.class);
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





        // specify an adapter (see also next example)
        mAdapter = new mode__specific_adapter(specs, context);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void populate(String id) {
        Context context = this.getApplicationContext();
        if (id.equals("honor")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_honor);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_y")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_y);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_u")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_u);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nexus")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_nexus);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_g")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_g);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_p")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_p);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nova")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_nova);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_m")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_m);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_mate")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_mate);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ideos")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_ideos);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_enjoy")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_enjoy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ascend")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_ascend);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_r")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_r);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_a")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_a);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_mirror")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_mirror);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_joy")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_joy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_find")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_find);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("opppo_n")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_n);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_neo")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_neo);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_f")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_f);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_primo")) {
            String[] title = context.getResources().getStringArray(R.array.sam_primo);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_mpower")) {
            String[] title = context.getResources().getStringArray(R.array.sam_mpower);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_metro")) {
            String[] title = context.getResources().getStringArray(R.array.sam_metro);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_E2")) {
            String[] title = context.getResources().getStringArray(R.array.sam_E2);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_hero")) {
            String[] title = context.getResources().getStringArray(R.array.sam_hero);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_guru")) {
            String[] title = context.getResources().getStringArray(R.array.sam_guru);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_galaxy")) {
            String[] title = context.getResources().getStringArray(R.array.sam_galaxy);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_rex")) {
            String[] title = context.getResources().getStringArray(R.array.sam_rex);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_champ")) {
            String[] title = context.getResources().getStringArray(R.array.sam_champ);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_z")) {
            String[] title = context.getResources().getStringArray(R.array.sam_z);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_B2")) {
            String[] title = context.getResources().getStringArray(R.array.sam_B2);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_w")) {
            String[] title = context.getResources().getStringArray(R.array.sam_w);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_wave")) {
            String[] title = context.getResources().getStringArray(R.array.sam_wave);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_x")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_x);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_asha")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_asha);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_other")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_other);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_c")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_c);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_e")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_e);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("nokia_lumina")) {
            String[] title = context.getResources().getStringArray(R.array.nokia_lumina);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("micro_lumia_dual")) {
            String[] title = context.getResources().getStringArray(R.array.micro_lumia_dual);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("micro_lumia")) {
            String[] title = context.getResources().getStringArray(R.array.micro_lumia);
            int i = 0;
            int length;
            for (length = title.length; length > i; i++) {
                specs.add(new model_spec(title[i]));
            }
        }




        if (id.equals("moto_x")) {
            String[] title = context.getResources().getStringArray(R.array.moto_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

                if (id.equals("moto_z")) {
        String[] title = context.getResources().getStringArray(R.array.moto_z);
        int i = 0;
        int length;
        for (length =title.length; length >i; i++){
            specs.add(new model_spec(title[i]));
        }
    }
                if (id.equals("moto_razr")) {
        String[] title = context.getResources().getStringArray(R.array.moto_razr);
        int i = 0;
        int length;
        for (length =title.length; length >i; i++){
            specs.add(new model_spec(title[i]));
        }
    }
                        if (id.equals("moto_g")) {
        String[] title = context.getResources().getStringArray(R.array.moto_g);
        int i = 0;
        int length;
        for (length =title.length; length >i; i++){
            specs.add(new model_spec(title[i]));
        }
    }
                        if (id.equals("moto_defy")) {
        String[] title = context.getResources().getStringArray(R.array.moto_defy);
        int i = 0;
        int length;
        for (length =title.length; length >i; i++){
            specs.add(new model_spec(title[i]));
        }
    }
                        if (id.equals("moto_e")) {
                            String[] title = context.getResources().getStringArray(R.array.moto_e);
                            int i = 0;
                            int length;
                            for (length = title.length; length > i; i++) {
                                specs.add(new model_spec(title[i]));
                            }
                        }
        if (id.equals("moto_ex")) {
            String[] title = context.getResources().getStringArray(R.array.moto_ex);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("moto_droid")) {
            String[] title = context.getResources().getStringArray(R.array.moto_droid);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_10")) {
            String[] title = context.getResources().getStringArray(R.array.htc_10);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_bfly")) {
            String[] title = context.getResources().getStringArray(R.array.htc_bfly);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_desire")) {
            String[] title = context.getResources().getStringArray(R.array.htc_desire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_one")) {
            String[] title = context.getResources().getStringArray(R.array.htc_one);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("htc_u")) {
            String[] title = context.getResources().getStringArray(R.array.htc_u);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("xia_mi")) {
            String[] title = context.getResources().getStringArray(R.array.xia_mi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("xia_redmi")) {
            String[] title = context.getResources().getStringArray(R.array.xia_redmi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("zte_axon")) {
            String[] title = context.getResources().getStringArray(R.array.zte_axon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_blade")) {
            String[] title = context.getResources().getStringArray(R.array.zte_blade);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_grand")) {
            String[] title = context.getResources().getStringArray(R.array.zte_grand);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_kis")) {
            String[] title = context.getResources().getStringArray(R.array.zte_kis);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_nubia")) {
            String[] title = context.getResources().getStringArray(R.array.zte_nubia);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_open")) {
            String[] title = context.getResources().getStringArray(R.array.zte_open);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_star")) {
            String[] title = context.getResources().getStringArray(R.array.zte_star);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_v")) {
            String[] title = context.getResources().getStringArray(R.array.zte_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_v")) {
            String[] title = context.getResources().getStringArray(R.array.zte_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("zte_zmax")) {
            String[] title = context.getResources().getStringArray(R.array.zte_zmax);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_a")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_flash")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_flash);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_fire")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_fire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("tcl_hero")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_hero);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_idol")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_idol);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_pixi")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_pixi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_pop")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_pop);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_cookie")) {
            String[] title = context.getResources().getStringArray(R.array.lg_cookie);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_e")) {
            String[] title = context.getResources().getStringArray(R.array.lg_e);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_f")) {
            String[] title = context.getResources().getStringArray(R.array.lg_f);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_g")) {
            String[] title = context.getResources().getStringArray(R.array.lg_g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_isai")) {
            String[] title = context.getResources().getStringArray(R.array.lg_isai);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_joy")) {
            String[] title = context.getResources().getStringArray(R.array.lg_joy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_k")) {
            String[] title = context.getResources().getStringArray(R.array.lg_k);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_l")) {
            String[] title = context.getResources().getStringArray(R.array.lg_l);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_leon")) {
            String[] title = context.getResources().getStringArray(R.array.lg_leon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_lucid")) {
            String[] title = context.getResources().getStringArray(R.array.lg_lucid);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_magna")) {
            String[] title = context.getResources().getStringArray(R.array.lg_magna);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_nexus")) {
            String[] title = context.getResources().getStringArray(R.array.lg_nexus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_optimus")) {
            String[] title = context.getResources().getStringArray(R.array.lg_optimus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_spirit")) {
            String[] title = context.getResources().getStringArray(R.array.lg_spirit);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_stylus")) {
            String[] title = context.getResources().getStringArray(R.array.lg_stylus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_t")) {
            String[] title = context.getResources().getStringArray(R.array.lg_t);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_v")) {
            String[] title = context.getResources().getStringArray(R.array.lg_v);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_wine")) {
            String[] title = context.getResources().getStringArray(R.array.lg_wine);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lg_x")) {
            String[] title = context.getResources().getStringArray(R.array.lg_x);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("lenovo_a")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_k")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_k);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_p")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_phab")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_phab);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_vibe")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_vibe);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("lenovo_zuk")) {
            String[] title = context.getResources().getStringArray(R.array.lenovo_zuk);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_fire")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot_fire);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_hero")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot_hero);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_pop")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot_pop);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_star")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot_star);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_pixi")) {
            String[] title = context.getResources().getStringArray(R.array.tcl_ot_pixi);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("tcl_ot_idol")) {
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
        }
        if (id.equals("acer_e")) {
            String[] title = context.getResources().getStringArray(R.array.acer_e);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("acer_jade")) {
            String[] title = context.getResources().getStringArray(R.array.acer_jade);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("acer_s")) {
            String[] title = context.getResources().getStringArray(R.array.acer_s);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("acer_z")) {
            String[] title = context.getResources().getStringArray(R.array.acer_z);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("acer_zest")) {
            String[] title = context.getResources().getStringArray(R.array.acer_zest);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("adcom_p")) {
            String[] title = context.getResources().getStringArray(R.array.adcom_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_pw")) {
            String[] title = context.getResources().getStringArray(R.array.archos_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_graph")) {
            String[] title = context.getResources().getStringArray(R.array.archos_graph);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_diamond")) {
            String[] title = context.getResources().getStringArray(R.array.archos_diamond);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_xenon")) {
            String[] title = context.getResources().getStringArray(R.array.archos_xenon);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_platinum")) {
            String[] title = context.getResources().getStringArray(R.array.archos_platinum);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_helium")) {
            String[] title = context.getResources().getStringArray(R.array.archos_helium);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("archos_oxygen")) {
            String[] title = context.getResources().getStringArray(R.array.archos_oxygen);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("bb_pa")) {
            String[] title = context.getResources().getStringArray(R.array.bb_pa);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }if (id.equals("bb_pb")) {
            String[] title = context.getResources().getStringArray(R.array.bb_pb);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_life")) {
            String[] title = context.getResources().getStringArray(R.array.blu_life);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }

        if (id.equals("blu_vivo")) {
            String[] title = context.getResources().getStringArray(R.array.blu_vivo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_energy")) {
            String[] title = context.getResources().getStringArray(R.array.blu_energy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_pure")) {
            String[] title = context.getResources().getStringArray(R.array.blu_pure);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("blu_pw")) {
            String[] title = context.getResources().getStringArray(R.array.blu_pw);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }


    }


    }

