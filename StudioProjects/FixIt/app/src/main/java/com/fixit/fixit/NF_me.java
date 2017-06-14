package com.fixit.fixit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/5/17.
 */

public class NF_me extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    Context context = this.getContext();

    List<post> UserPostList;

    private RecyclerView.Adapter organicAdapter;
    Button toggleme;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_nf_me, container, false);
        UserPostList = new ArrayList<>();
        fakepopulation();
        recyclerView = (RecyclerView) fragview.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(context);
        adapter = new post_recycler_adapter(UserPostList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return fragview;

/*

        organicAdapter = new RecyclerAdapter(UserNotesList);
        greenManager = new LinearLayoutManager(this);
        squareManager = new GridLayoutManager(this, 3);
        greenView.setLayoutManager(greenManager);
        greenView.setHasFixedSize(true);
        greenView.setAdapter(organicAdapter);
        */
    }

    private void fakepopulation() {
        UserPostList.add(new post("1d","time","private", " Diagnosed & reparied","Macbook","", "Im so glad my girlfriend recomended this amazing app","Linda Belcher","You","4.5"));
        UserPostList.add(new post("date","time","privacy", " transaction_info","device","parts", "status","fixer","template","5.0"));
    }
}