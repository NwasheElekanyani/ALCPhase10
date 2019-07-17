package com.example.alcphase10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
public class ActivityB extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        getSupportActionBar().setTitle("ABOUT ALC");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        String url = "http://www.andela.com/alc";
        WebView web= (WebView) findViewById(R.id.web_view);
        web.loadUrl(url);


    }
}
