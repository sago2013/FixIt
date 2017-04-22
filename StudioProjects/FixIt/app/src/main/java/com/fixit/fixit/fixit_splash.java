package com.fixit.fixit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class fixit_splash extends AppCompatActivity {
    private int SPLASH_LENGHT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixit_splash);

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
