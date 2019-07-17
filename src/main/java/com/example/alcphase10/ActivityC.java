package com.example.alcphase10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class ActivityC extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        getSupportActionBar().setTitle("MY PROFILE");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);




    }
}
