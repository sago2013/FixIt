package com.fixit.fixit;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/5/17.
 */

public class NF_public extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    List<Post> UserPostList;
    private FirebaseAuth mAuth;
    String TAG = "NF_public--";
   ProgressDialog mProgressBox;
    private FirebaseAuth.AuthStateListener mAuthListener;
    DatabaseReference PostDB;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_nf_public, container, false);
        mProgressBox = new ProgressDialog(getContext());
        UserPostList = new ArrayList<>();
        PostDB = FirebaseDatabase.getInstance().getReference("Posts");
        // this was used for testing before connecting the database -->fakepopulation();
        populate_PUBLIC_NewsFeed();
        recyclerView = (RecyclerView) fragview.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new post_recycler_adapter(UserPostList);
        recyclerView.setAdapter(adapter);
        return fragview;
    }

    public void populate_PUBLIC_NewsFeed() {
        Query allPosts = PostDB.orderByChild("privacy").equalTo("Public");
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


}