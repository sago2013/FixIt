package com.fixit.fixit;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by saintagrro on 6/13/17.
 */

public class AccountCreation extends AppCompatActivity {

    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseAuth mAuth;
    private static final String TAG = "Login";
     Context mcontext;

    //xml fields
    private TextView email_r;
    private TextView name_r;
    private TextView password_r;
    private View mProgressView;
    private DatabaseReference mDatabase;
    ProgressDialog mPD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_creation);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        email_r = (TextView) findViewById(R.id.email);
        name_r = (TextView) findViewById(R.id.fullname);
        password_r = (TextView) findViewById(R.id.password);
        mcontext = this.getApplicationContext();

        Button create_account_btn = (Button) findViewById(R.id.create_account_btn);
        create_account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email_r.length()==0||name_r.length()==0||password_r.length()==0){
                    Toast.makeText(mcontext, "Please enter an Email and Password",Toast.LENGTH_SHORT).show();
                }else{
                    attempt_account_creation();
                }
            }
        });

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Intent intent = new Intent(AccountCreation.this, MainActivity.class);
                    startActivity(intent);
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
            }

        };
        mPD = new ProgressDialog(this);


    }

    private void attempt_account_creation() {
        mPD.setTitle("Creating Account");
        mPD.setMessage("Almost Done");
        mPD.show();
         final String email = email_r.getText().toString();
         final String password = password_r.getText().toString();
         final String name =  name_r.getText().toString();
         mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
                addNewUser(name, email,password);
                mPD.dismiss();
                // If sign in fails, display a message to the user. If sign in succeeds
                // the auth state listener will be notified and logic to handle the
                // signed in user can be handled in the listener.
                if (!task.isSuccessful()) {
                    mPD.dismiss();
                    Toast.makeText(AccountCreation.this, "Authorization Creation Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void addNewUser(String name, String email, String passwordm) {
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        User new_user = new User(name," "," ","0.0",email);
                        //(String name, String phone, String profPicURL, String bio, String rating)
        mDatabase.child("Users").child(userId).setValue(new_user);
    }


    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }

    public void gotologin(View view) {
        Intent intent = new Intent(AccountCreation.this, login.class);
        startActivity(intent);
    }
}
