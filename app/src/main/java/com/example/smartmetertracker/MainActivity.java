package com.example.smartmetertracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //send
    public void envoyer (View view){
        Intent intent= new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
