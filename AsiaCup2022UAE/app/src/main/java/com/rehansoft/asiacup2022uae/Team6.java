package com.rehansoft.asiacup2022uae;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.applovin.mediation.ads.MaxAdView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Team6 extends AppCompatActivity
{
    RecyclerView recview;
    team6adapter adapter;
    private MaxAdView adView;
    FirebaseAnalytics analytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team6);
        getSupportActionBar().setTitle("Hong Kong Squad");
        adView= findViewById(R.id.adView);
        adView.loadAd();
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<team6model> options =
                new FirebaseRecyclerOptions.Builder<team6model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("asiacup/sixsquad"), team6model.class)
                        .build();

        adapter=new team6adapter(options);
        recview.setAdapter(adapter);

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
}