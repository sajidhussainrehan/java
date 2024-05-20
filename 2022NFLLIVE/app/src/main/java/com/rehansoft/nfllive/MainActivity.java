package com.rehansoft.nfllive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Window window = getWindow();
        getSupportActionBar().hide();
       // window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
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
                Intent intent=new Intent(MainActivity.this,Results.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.standings);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Standings.class);
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

        cardView=findViewById(R.id.winners);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Winners.class);
                startActivity(intent);
            }
        });
    }
}