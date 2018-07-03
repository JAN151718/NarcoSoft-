package com.example.jagma.login_screen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main_task_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task_page);
        SharedPreferences pref=getSharedPreferences("ActivityPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor edt =pref.edit();
        edt.putBoolean("activity_executed",true);
        edt.apply();
    }


    public void ChangeAccts(View view){
        SharedPreferences pref=getSharedPreferences("ActivityPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor edt =pref.edit();
        edt.putBoolean("activity_executed",false);
        edt.apply();
        Intent intent = new Intent(this,Splash_activity.class);
        startActivity(intent);
        finish();
    }

    public void PreventionActivity(View view){
        Intent i=new Intent(this,Prevention_Activity.class);
        startActivity(i);
    }
}
