package com.nfllive.nfl;
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

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        if(!ApplovinAds.interstitialAd.isReady()){
            ApplovinAds.createInterstitialAd(this);
        }
        cardView=findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Live1.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Live1.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.card2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Teams.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Schedule.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.card4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Live1.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.card5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,livenfl.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.card6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Predictions.class);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });
      /*  button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,livenfl.class);
                startActivity(intent);
                ApplovinAds.showInterstitial();
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ApplovinAds.showInterstitial();
            }
        });*/
            }
}
