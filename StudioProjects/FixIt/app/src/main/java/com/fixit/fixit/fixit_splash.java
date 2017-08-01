package com.fixit.fixit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class fixit_splash extends AppCompatActivity {
    private int SPLASH_LENGHT = 400;
   private Animation spinR, spinL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixit_splash);
        ImageView splash = (ImageView) findViewById(R.id.splash);
        spinR  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate360bw);
        splash.startAnimation(spinR);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {


            Intent i = new Intent(fixit_splash.this, login.class);
            startActivity(i);

            //close this activity
            finish();

        }
    }, SPLASH_LENGHT);
}

}
