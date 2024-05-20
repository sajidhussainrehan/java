package com.rehansoft.asiacup2022uae;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    CardView cardView ;
FirebaseAnalytics analytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analytics = FirebaseAnalytics.getInstance(this);


        cardView=findViewById(R.id.livenow);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Live.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.news);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,News.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.fixtures);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Schedule.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.teams);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Teams.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.lineup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LineUp.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.standings);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,POINTS.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.predictions);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Predictions.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.polls);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Polls.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.channels);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Channels.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.kits);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Kits.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.winners);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Winners.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.stadiums);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Stadiums.class);
                startActivity(intent);
            }
        });
    }

}