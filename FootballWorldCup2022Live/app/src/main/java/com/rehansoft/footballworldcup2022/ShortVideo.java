package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShortVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_video);
        getSupportActionBar().setTitle("Short Video");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}