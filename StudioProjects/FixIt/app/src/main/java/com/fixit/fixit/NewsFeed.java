package com.fixit.fixit;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Point;
import android.media.Rating;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.signature.ObjectKey;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saintagrro on 6/5/17.
 */

public class NewsFeed extends Fragment {
    private FragmentTabHost mTabHost;
    private FirebaseAuth mAuth;
    private DatabaseReference postDB;
    private boolean isFabOpen = false;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Animation fab_open,fab_close,rotate_360bw,rotate_360f, fab_open2, fab_open3, fab_close2, fab_close3, fab_close4, fab_open4;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    List<fixer> FixersList;




    public static NewsFeed newInstance() {
        return new NewsFeed();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        mAuth = FirebaseAuth.getInstance();
        postDB = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fixit-sandbox.firebaseio.com/");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newsfeed, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("NewsFeed");
        // Setting ViewPager for each Tabs
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.result_tabs);
        tabs.setupWithViewPager(viewPager);
        final FloatingActionButton newCommentFab = (FloatingActionButton) view.findViewById(R.id.fab2);
        //fab animations, and functionalities
        fab_open = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open);
        fab_open2 =  AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open2);
        fab_open3 = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open3);
        fab_open4 = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open4);
        fab_close = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close);
        fab_close2 = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close2);
        fab_close3 = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close3);
        fab_close4 = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_close4);
        rotate_360bw = AnimationUtils.loadAnimation(this.getContext(),R.anim.rotate360bw);
        rotate_360f = AnimationUtils.loadAnimation(this.getContext(),R.anim.rotate_360);
        //rotate_bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bouce);
        final FloatingActionButton fab_review = (FloatingActionButton) view.findViewById(R.id.fab_review);
        final FloatingActionButton fab_sad = (FloatingActionButton) view.findViewById(R.id.fab_sad);
        final FloatingActionButton fab_thank = (FloatingActionButton) view.findViewById(R.id.fab_thank);
        final TextView review_tv = (TextView) view.findViewById(R.id.review_tv);
        final TextView sad_tv = (TextView) view.findViewById(R.id.sad_tv);
        final TextView thank_tv = (TextView) view.findViewById(R.id.thank_tv);


        newCommentFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFabOpen) {

                    newCommentFab.setImageDrawable(getResources().getDrawable(R.drawable.ic_remove_white_24dp));
                    newCommentFab.startAnimation(rotate_360f);




                    //tv animation
                    thank_tv.startAnimation(fab_open3);
                    sad_tv.startAnimation(fab_open2);
                    review_tv.startAnimation(fab_open);


                    //fab animation
                    fab_thank.startAnimation(fab_open3);
                    fab_sad.startAnimation(fab_open2);
                    fab_review.startAnimation(fab_open);
                    fab_sad.setClickable(true);
                    fab_review.setClickable(true);
                    fab_thank.setClickable(true);
                    isFabOpen = true;
                    Log.d("Fab Animation", "open");
                }
                else{
                    newCommentFab.setImageDrawable(getResources().getDrawable(R.drawable.ic_comment_white_24dp));
                    newCommentFab.startAnimation(rotate_360bw);


                    //tv animation
                    thank_tv.startAnimation(fab_close);
                    sad_tv.startAnimation(fab_close2);
                    review_tv.startAnimation(fab_close3);


                    //fab animation
                    fab_thank.startAnimation(fab_close);
                    fab_sad.startAnimation(fab_close2);
                    fab_review.startAnimation(fab_close3);
                    fab_thank.setClickable(false);
                    fab_sad.setClickable(false);
                    fab_review.setClickable(false);
                    isFabOpen = false;
                    Log.d("Fab Animation:", "close");

                }



            }
        });
        fab_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addReview();
            }
        });
        fab_sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:implement functionality
                //addcomment();
            }
        });
        fab_thank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:implement functionality
                //addcomment();
            }
        });




        return view;
    }

    private void addReview() {
        Fragment frag = new NewReview();

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, frag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }







    // Add Fragments to Tabs
    private void setupViewPager(ViewPager viewPager) {

        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new NF_me(), "ME");
        adapter.addFragment(new NF_friends(), "FRIENDS");
        adapter.addFragment(new NF_public(), "PUBLIC");
        viewPager.setAdapter(adapter);
    }



    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
}


