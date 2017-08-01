package com.fixit.fixit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/5/17.
 */

public class NF_friends extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    Context context = this.getContext();
    List<Post> UserPostList;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View fragview= inflater.inflate(R.layout.fragment_nf_friends, container, false);
        UserPostList = new ArrayList<>();
        // this was used for testing before connecting the database --> fakepopulation();
        recyclerView = (RecyclerView) fragview.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(context);
        adapter = new post_recycler_adapter(UserPostList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener(){
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy){
                if(dy>0){
                    fragview.requestLayout();
                }
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        return fragview;
    }


    private void fakepopulation() {
        /*
        UserPostList.add(new Post("10d","time","friends", " Replaced","HP Envy","keyboard", "<3","Louise Belcher","Ale Salmeron","4.5"));
        UserPostList.add(new Post("Apr 5","time","friends", " Diagnosed & repaired","Chromebook","", ":)","Jake Chizle","Roman Sualmarez","3.2"));
        UserPostList.add(new Post("04/18/16","time","friends", " Fixed","Google Pixel","", "Not bad, but I have high standards ","Gabriel Maupome","Sarah Sualmarez","3.2"));
        UserPostList.add(new Post("date","time","privacy", " transaction_info","device","parts", "status","fixer","Template","5.0"));
        */

    }


}