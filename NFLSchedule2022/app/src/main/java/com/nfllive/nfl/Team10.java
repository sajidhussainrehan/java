package com.nfllive.nfl;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Team10 extends AppCompatActivity implements MaxAdListener
{
    RecyclerView recview;
    myadapterteam10 adapter;
    private MaxInterstitialAd interstitialAd;
    private MaxAdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team10);
        AppLovinSdk.getInstance( Team10.this ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( Team10.this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                loadads();
            }
        } );
        getSupportActionBar().setTitle("New Orleans Saints");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        adView= findViewById(R.id.adView);
        adView.loadAd();
        FirebaseRecyclerOptions<modelteam10> options =
                new FirebaseRecyclerOptions.Builder<modelteam10>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("nflschedule/team10"), modelteam10.class)
                        .build();

        adapter=new myadapterteam10(options);
        recview.setAdapter(adapter);

    }

    private void loadads() {
        interstitialAd = new MaxInterstitialAd( "7fed54904167e4a4", this );
        interstitialAd.setListener( this );

        // Load the first ad
        interstitialAd.loadAd();



        if ( interstitialAd.isReady() )
        {
            interstitialAd.showAd();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onAdLoaded(MaxAd ad) {

    }

    @Override
    public void onAdDisplayed(MaxAd ad) {

    }

    @Override
    public void onAdHidden(MaxAd ad) {

    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {

    }
}