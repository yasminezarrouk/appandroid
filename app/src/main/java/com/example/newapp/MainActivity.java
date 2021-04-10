package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button managerefuges =(Button) findViewById(R.id.managerefuges);
        Button managelinks =(Button) findViewById(R.id.managelinks);
        Button settingsbtn =(Button) findViewById(R.id.settingsbtn);
        Button senddata =(Button) findViewById(R.id.senddata);
        managerefuges.setOnClickListener(this);
        managelinks.setOnClickListener(this);
        senddata.setOnClickListener(this);
        settingsbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.managerefuges:
                Intent firstintent = new Intent(getApplicationContext(),Managinglinksactivity.class);
                startActivity(firstintent);;
            case R.id.managelinks:
                Intent secondintent = new Intent(getApplicationContext(),Managinglinksactivity.class);
                startActivity(secondintent);
            case R.id.settingsbtn:
                Intent thirdintent = new Intent(getApplicationContext(),SendData.class);
                startActivity(thirdintent);
            case R.id.senddata:
                Intent fourthintent = new Intent(getApplicationContext(),SettingsActivity.class);
                startActivity(fourthintent);
        }
    }
}
