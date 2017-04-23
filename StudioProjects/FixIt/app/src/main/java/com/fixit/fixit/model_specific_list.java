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
                Intent i = new Intent(model_specific_list.this,model_nokia_p.class);
                startActivity(i);
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

        SharedPreferences mPrefs = getSharedPreferences("table", 0);
        final String id = mPrefs.getString("model_spec", "error");
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
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
            }
        if (id.equals("huaw_y")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_y);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_u")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_u);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nexus")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_nexus);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_g")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_g);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_p")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_p);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_nova")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_nova);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_m")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_m);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_mate")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_mate);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ideos")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_ideos);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_enjoy")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_enjoy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("huaw_ascend")) {
            String[] title = context.getResources().getStringArray(R.array.huaw_ascend);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_r")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_r);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_a")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_a);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_mirror")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_mirror);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_joy")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_joy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_find")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_find);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("opppo_n")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_n);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_neo")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_neo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("oppo_f")) {
            String[] title = context.getResources().getStringArray(R.array.oppo_f);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_primo")) {
            String[] title = context.getResources().getStringArray(R.array.sam_primo);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_mpower")) {
            String[] title = context.getResources().getStringArray(R.array.sam_mpower);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_metro")) {
            String[] title = context.getResources().getStringArray(R.array.sam_metro);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_E2")) {
            String[] title = context.getResources().getStringArray(R.array.sam_E2);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_hero")) {
            String[] title = context.getResources().getStringArray(R.array.sam_hero);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_guru")) {
            String[] title = context.getResources().getStringArray(R.array.sam_guru);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_galaxy")) {
            String[] title = context.getResources().getStringArray(R.array.sam_galaxy);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_rex")) {
            String[] title = context.getResources().getStringArray(R.array.sam_rex);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_champ")) {
            String[] title = context.getResources().getStringArray(R.array.sam_champ);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_z")) {
            String[] title = context.getResources().getStringArray(R.array.sam_z);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_B2")) {
            String[] title = context.getResources().getStringArray(R.array.sam_B2);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_w")) {
            String[] title = context.getResources().getStringArray(R.array.sam_w);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }
        if (id.equals("sam_wave")) {
            String[] title = context.getResources().getStringArray(R.array.sam_wave);
            int i = 0;
            int length;
            for (length =title.length; length >i; i++){
                specs.add(new model_spec(title[i]));
            }
        }


        }



}

