package com.fixit.fixit;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewParentCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/5/17.
 */

public class NF_public extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    Context context = this.getContext();
    List<post> UserPostList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_nf_public, container, false);
        UserPostList = new ArrayList<>();
        fakepopulation();
        recyclerView = (RecyclerView) fragview.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(context);
        adapter = new post_recycler_adapter(UserPostList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        /*
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                View parentview = inflater.inflate(R.layout.fragment_newsfeed, container, false);
                final FloatingActionButton fab = (FloatingActionButton) parentview.findViewById(R.id.fab2);
                fab.hide();
                    if (dy > 0 ||dy<0 && fab.isShown())
                    {
                        fab.hide();
                    }
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                    ViewParentCompat.onNestedScroll(ViewParent pa);
                    final FloatingActionButton fab = (FloatingActionButton) parentview.findViewById(R.id.fab2);
                    fab.hide();
                    if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                        fab.show();
                    }
                    super.onScrollStateChanged(recyclerView, newState);
                }

        });
*/
        return fragview;
    }

    private void fakepopulation() {
        UserPostList.add(new post("1h","time","public", " Fixed","iPhone","", "works better than new","Martial Mathers","Santiago Salmeron","1.3"));
        UserPostList.add(new post("23h","time","public", " Replaced","Samsung Galaxy","screen", "Amazing Job :)","Bob Belcher","Rocio Suarez","2.5"));
        UserPostList.add(new post("3d","time","public", " Replaced","Lenovo yoga","battery", "Was done so quickly","Gene Belcher","Leticia Alfaro","5.0"));
        UserPostList.add(new post("10d","time","friends", " Replaced","HP Envy","keyboard", "<3","Louise Belcher","Ale Salmeron","4.5"));
        UserPostList.add(new post("13d","time","public", " Replaced","iPhone","home button", "Still cant belive how easy this was","Tina Belcher","Rudy Suarez","4.8"));
        UserPostList.add(new post("Apr 5","time","friends", " Diagnosed & repaired","Chromebook","", ":)","Jake Chizle","Roman Sualmarez","3.2"));
        UserPostList.add(new post("04/18/16","time","friends", " Fixed","Google Pixel","", "Not bad, but I have high standards ","Gabriel Maupome","Sarah Sualmarez","3.2"));
        UserPostList.add(new post("date","time","privacy", " transaction_info","device","parts", "status","fixer","Brooklyn Sualmarez","5.0"));
    }

}