package com.rehansoft.asiacup2022uae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.applovin.mediation.ads.MaxAdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Stadiums extends AppCompatActivity {
    FirebaseAnalytics analytics;
    private MaxAdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadiums);
        adView= findViewById(R.id.adView);
        adView.loadAd();
        analytics = FirebaseAnalytics.getInstance(this);
    }
}