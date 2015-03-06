package com.example.carissas.sbcsstudentclassschedule;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SplashActivity extends ActionBarActivity {

    //Splash screen timer
    private static int splashTimeOut = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        //http://developer.android.com/guide/topics/ui/actionbar.html
        //Hide action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            /*
             *Showing splash screen with a timer. This will be useful when
             * show casing the company's logo.
             */

            @Override
            public void run() {
                //This method will be executed once the timer is over
                //Start the application's main activity
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);

                //Close this activity
                finish();
            }
        }, splashTimeOut);

    }//Closes onCreate method

}//Closes SplashActivity class
