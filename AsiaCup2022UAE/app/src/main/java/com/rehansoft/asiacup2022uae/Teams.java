package com.rehansoft.asiacup2022uae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Teams extends AppCompatActivity {
CardView cardView;
    FirebaseAnalytics analytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        getSupportActionBar().setTitle("Teams & Squad");
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cardView=findViewById(R.id.team1);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team1.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team2.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team3.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team4.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team5.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team6.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}