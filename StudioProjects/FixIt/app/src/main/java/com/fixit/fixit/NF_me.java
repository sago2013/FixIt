package com.fixit.fixit;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

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
    String TAG = "NF_public--";
    ProgressDialog mProgressBox;
    DatabaseReference PostDB;
    List<Post> UserPostList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_nf_me, container, false);
        UserPostList = new ArrayList<>();
        PostDB = FirebaseDatabase.getInstance().getReference("Posts");
        mProgressBox = new ProgressDialog(getContext());
        populate_MY_NewsFeed();
        recyclerView = (RecyclerView) fragview.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(context);
        adapter = new post_recycler_adapter(UserPostList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return fragview;


    }

    public void populate_MY_NewsFeed() {
        SharedPreferences mPrefs = getContext().getSharedPreferences("mystic_bag", 0);
        final String curUser = mPrefs.getString("curUserID", "error");
        Query allPosts = PostDB.orderByChild("userID").equalTo(curUser);
        allPosts.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                mProgressBox.setTitle("Loading Posts");
                mProgressBox.setMessage("Almost Done......");
                mProgressBox.show();
                UserPostList.clear();
                for (DataSnapshot post : dataSnapshot.getChildren()) {
                    UserPostList.add(new Post(post.child("dateTime").getValue().toString(),
                            post.child("privacy").getValue().toString(),
                            post.child("transaction_info").getValue().toString(),
                            post.child("status").getValue().toString(),
                            post.child("fixer").getValue().toString(),
                            post.child("fixey").getValue().toString(),
                            post.child("rating").getValue().toString(),
                            post.child("device").getValue().toString(),
                            post.child("part").getValue().toString(),
                            post.child("userID").getValue().toString(),
                            post.child("likes").getValue().toString(),
                            post.child("comments").getValue().toString()));

                }
                mProgressBox.dismiss();
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
            }
        });

    }

    private void fakepopulation() {
        /*
        UserPostList.add(new Post("1d","time","private", " Diagnosed & reparied","Macbook","", "Im so glad my girlfriend recomended this amazing app","Linda Belcher","You","4.5"));
        UserPostList.add(new Post("date","time","privacy", " transaction_info","device","parts", "status","fixer","template","5.0"));
        */

    }
}