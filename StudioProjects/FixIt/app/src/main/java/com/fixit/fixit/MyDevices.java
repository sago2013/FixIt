package com.fixit.fixit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saintagrro on 6/5/17.
 */

public class MyDevices extends Fragment {
    private Boolean isFabOpen = false;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward, fab_open2, fab_open3, fab_close2, fab_close3, fab_close4, fab_open4;
    public static MyDevices newInstance() {
        return new MyDevices();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mydevices, container, false);
        // Setting ViewPager for each Tabs
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.result_tabs);
        tabs.setupWithViewPager(viewPager);

        //fab animations, and functionalities
        fab_open = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open);
        fab_open2 =  AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open2);
        fab_open3 = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open3);
        fab_open4 = AnimationUtils.loadAnimation(this.getContext(), R.anim.fab_open4);
        fab_close = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close);
        fab_close2 = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close2);
        fab_close3 = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close3);
        fab_close4 = AnimationUtils.loadAnimation(this.getContext(),R.anim.fab_close4);
        rotate_forward = AnimationUtils.loadAnimation(this.getContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(this.getContext(),R.anim.rotate_backward);
        //rotate_bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bouce);
        final FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        final FloatingActionButton fab_phone = (FloatingActionButton) view.findViewById(R.id.fab_phone);
        final FloatingActionButton fab_desktop = (FloatingActionButton) view.findViewById(R.id.fab_desktop);
        final FloatingActionButton fab_tablet = (FloatingActionButton) view.findViewById(R.id.fab_tablet);
        final FloatingActionButton fab_laptop = (FloatingActionButton) view.findViewById(R.id.fab_laptop);
        final TextView tablet_tv = (TextView) view.findViewById(R.id.tablet_tv);
        final TextView phone_tv = (TextView) view.findViewById(R.id.phone_tv);
        final TextView desktop_tv = (TextView) view.findViewById(R.id.desktop_tv);
        final TextView laptop_tv = (TextView) view.findViewById(R.id.laptop_tv);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isFabOpen){

                    // X  to Plus animation
                    fab.startAnimation(rotate_backward);

                    //tv animation
                    tablet_tv.startAnimation(fab_close);
                    desktop_tv.startAnimation(fab_close2);
                    laptop_tv.startAnimation(fab_close3);
                    phone_tv.startAnimation(fab_close4);

                    //fab animation
                    fab_tablet.startAnimation(fab_close);
                    fab_desktop.startAnimation(fab_close2);
                    fab_laptop.startAnimation(fab_close3);
                    fab_phone.startAnimation(fab_close4);
                    fab_tablet.setClickable(false);
                    fab_desktop.setClickable(false);
                    fab_phone.setClickable(false);
                    fab_laptop.setClickable(false);
                    isFabOpen = false;
                    Log.d("Fab Animation:", "close");

                } else {
                    // Plus to X animation
                    fab.startAnimation(rotate_forward);

                    //tv animation
                    phone_tv.startAnimation(fab_open);
                    laptop_tv.startAnimation(fab_open);
                    desktop_tv.startAnimation(fab_open);
                    tablet_tv.startAnimation(fab_open);


                    //fab animation
                    fab_phone.startAnimation(fab_open);
                    fab_laptop.startAnimation(fab_open);
                    fab_desktop.startAnimation(fab_open);
                    fab_tablet.startAnimation(fab_open);
                    fab_tablet.setClickable(true);
                    fab_laptop.setClickable(true);
                    fab_desktop.setClickable(true);
                    fab_phone.setClickable(true);
                    isFabOpen = true;
                    Log.d("Fab Animation","open");

                }
            }
        });

        fab_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), brand_c.class);
                startActivity(i);
            }
        });

        fab_tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), brand_c.class);
                startActivity(i);
            }
        });

        fab_desktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fixed_feed.class);
                startActivity(i);
            }
        });

        fab_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), brand_p.class);
                startActivity(i);
            }
        });


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {

        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new md_phone(), "Phone");
        adapter.addFragment(new md_computer(), "Computer");
        adapter.addFragment(new md_other(), "Other");
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
    public void animateFAB(){


    }
}

