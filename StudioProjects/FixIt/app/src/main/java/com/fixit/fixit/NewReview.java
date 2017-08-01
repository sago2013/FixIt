package com.fixit.fixit;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saintagrro on 7/11/17.
 */

public class NewReview extends Fragment {
    //private Boolean isDeviceSelected = false;
    //private Boolean isFixerSelected = false;
    private FirebaseAuth mAuth;
    private DatabaseReference postDB;
    private boolean isFabOpen = false;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Animation fab_open,fab_close,rotate_360bw,rotate_360f, fab_open2, fab_open3, fab_close2, fab_close3, fab_close4, fab_open4;
    private RecyclerView recyclerViewFixers;
    private RecyclerView recyclerViewDevices;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    List<fixer> FixersList;
    List<ADevice> DevicesList;


    public static NewReview newInstance() {
        return new NewReview();
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

        final View newComment = inflater.inflate(R.layout.dialog_new_post, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Review a Fixer");
         final EditText body = (EditText) newComment.findViewById(R.id.body);
         final Spinner  audience = (Spinner) newComment.findViewById(R.id.audience);
         final RatingBar rating = (RatingBar) newComment.findViewById(R.id.ratingBar);
         final Spinner fixType = (Spinner) newComment.findViewById(R.id.fix_type);
         final FloatingActionButton saveFab = (FloatingActionButton) newComment.findViewById(R.id.post);
         final FloatingActionButton cancelFab = (FloatingActionButton) newComment.findViewById(R.id.trash);
         ArrayAdapter<CharSequence> audienceAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.audienceList, android.R.layout.simple_spinner_item);
        // sets layout for active dropdown for spinnerTags
        audienceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting adaptor to spinnerTag
        audience.setAdapter(audienceAdapter);
        ArrayAdapter<CharSequence> fixTypeAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.fixTypeList, android.R.layout.simple_spinner_item);
        // sets layout for active dropdown for spinnerTags
        fixTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting adaptor to spinnerTag
        fixType.setAdapter(fixTypeAdapter);
        FixersList = new ArrayList<>();
        DevicesList = new ArrayList<>();
        generateFakePopulation();
        setupDeviceRecyclerView(newComment);
        setupFixerRecyclerView(newComment);



        saveFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mPrefs = getContext().getSharedPreferences("mystic_bag", 0);
                final String savedFixerName = mPrefs.getString("savedFixerName", "error");
                final String savedDeviceName = mPrefs.getString("savedDeviceName", "error");

                if (body.getText().length()>0){

                    if (audience.getSelectedItem().toString().length()>0){

                        if (fixType.getSelectedItem().toString().length()>0){

                            if(savedFixerName.length()>0 && (!(savedFixerName.equals("error")))){

                                if(savedDeviceName.length()>0 && (!(savedDeviceName.equals("error")))) {

                                    Toast.makeText(getContext(),"",Toast.LENGTH_SHORT).show();
                                    save_post(newComment);
                                    transitionback();
                                }
                                else {
                                    Toast.makeText(getContext(),"please select the device that was Fixed", Toast.LENGTH_LONG).show();
                                }
                            }
                            else{
                                Toast.makeText(getContext(),"please select a Fixer to review", Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(getContext(),"please select what kind of repair this was",Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(getContext(),"please select who will be able to see this review",Toast.LENGTH_LONG).show();

                    }
                }
                else{
                    Toast.makeText(getContext(),"please add a body to your review",Toast.LENGTH_LONG).show();
                }


            }
        });

        cancelFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag = new NewsFeed();

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frame_layout, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return newComment;
    }

    private void transitionback() {
        Fragment frag = new NewsFeed();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, frag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();

    }

    private void setupFixerRecyclerView(final View view) {
        recyclerViewFixers = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new fixer_recycler_adapter(FixersList);
        recyclerViewFixers.setLayoutManager(layoutManager);
        recyclerViewFixers.setAdapter(adapter);
    }

    private void save_post(View newComment) {
        String curUser = mAuth.getCurrentUser().getUid();

        final EditText body = (EditText) newComment.findViewById(R.id.body);
        final Spinner audience = (Spinner) newComment.findViewById(R.id.audience);
        final RatingBar rating = (RatingBar) newComment.findViewById(R.id.ratingBar);
        final Spinner fixType = (Spinner) newComment.findViewById(R.id.fix_type);
        SharedPreferences mPrefs = getContext().getSharedPreferences("mystic_bag", 0);
        final String savedFixerName = mPrefs.getString("savedFixerName", "error");
        final String savedDeviceName = mPrefs.getString("savedDeviceName", "error");
        final String savedUserName = mPrefs.getString("savedCurUserName", "error");
        final String savedPart = mPrefs.getString("savedPart","error");
        String savedFixType;


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String curDT = sdf.format(new Date());
        String key = postDB.child("Posts").push().getKey();
        String part;
        if(savedPart.equals("no part") || savedPart.equals("error")){
            part = "";
            savedFixType = fixType.getSelectedItem().toString();
        }else{
            part = savedPart;
            savedFixType = "Replaced";
        }
        //Todo:implement comments and like functionalities
        Post post = new Post(curDT, audience.getSelectedItem().toString(),savedFixType, body.getText().toString(),  savedFixerName,  savedUserName,  String.valueOf(rating.getRating()), savedDeviceName,part, curUser,"0", "comments");
        //("dateTime", "privacy", "transaction_info", "status",  "fixer",  "fixey",  "rating", "Device","part","userID","likes","likers", "comments");
        Map<String, Object> postValues = post.toMap();
        Map<String,Object> childUpdates = new HashMap<>();
        childUpdates.put("/Posts/"+key,postValues);
        childUpdates.put("/UserPosts/"+curUser+"/"+key,postValues);
        childUpdates.put("Reviews/"+savedFixerName+"/"+key,postValues);
        postDB.updateChildren(childUpdates);
    }

    private void generateFakePopulation() {
        String curUser = mAuth.getCurrentUser().getUid();
        //devices
        SharedPreferences mPrefs = getContext().getSharedPreferences("mystic_bag", 0);
        String savedDeviceName = mPrefs.getString("savedCurUserName", "error");
        savedDeviceName = savedDeviceName.substring(0,savedDeviceName.indexOf(" "));

        DevicesList.add(new ADevice(savedDeviceName+"'s " + "iPhone","iPhone 8 Plus","Apple","1","iOS", curUser,"","phone","2017-04-29","Fixed"));
        DevicesList.add(new ADevice(savedDeviceName+"'s " + "Pixel","Pixel","Google","2","Android", curUser,"Screen","phone","2017-08-10","Replaced"));
        DevicesList.add(new ADevice(savedDeviceName+"'s " + "Envy","Envy","HP","1","Windows 10", curUser,"","laptop","2017-05-17","Upgraded"));
        DevicesList.add(new ADevice(savedDeviceName+"'s " + "Nexus Tablet","Nexus 7","Asus","2","Android", curUser,"","tablet","2017-04-19","Diagnosed"));

        //Easy access key -->(name, model,  brand, fixitInteractionCount, OS, userId, parts,  device,  lastFixDate, FixType)


        //fixers
        FixersList.add(new fixer("person 1","persona@gmail.com",""));
        FixersList.add(new fixer("person 2","personb@hotmail.com",""));
        FixersList.add(new fixer("person 3","personc@ymail.com",""));
        FixersList.add(new fixer("person 4","persond@hotmail.com",""));
        FixersList.add(new fixer("person 5","persone@ymail.com",""));

    }
    private void setupDeviceRecyclerView(View view) {
        recyclerViewDevices = (RecyclerView) view.findViewById(R.id.recyclerView_devices);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new ADeviceRecyclerAdapter(DevicesList);
        recyclerViewDevices.setLayoutManager(layoutManager);
        recyclerViewDevices.setAdapter(adapter);

    }



}
