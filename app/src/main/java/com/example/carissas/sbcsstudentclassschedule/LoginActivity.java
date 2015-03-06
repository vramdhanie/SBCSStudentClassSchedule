package com.example.carissas.sbcsstudentclassschedule;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //http://developer.android.com/guide/topics/ui/actionbar.html
        //Hide action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }//Closes onCreate method

    //After registering user, call this method
    public void regUser(View view){
        Intent i = new Intent(LoginActivity.this, ScheduleActivity.class);
        startActivity(i);
    }//Closes regUser method

}//Closes LoginActivity class
