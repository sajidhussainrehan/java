package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Winners extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners);
        getSupportActionBar().setTitle("Winners");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}