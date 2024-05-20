package com.rehansoft.asiacup2022uae;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.applovin.mediation.ads.MaxAdView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Team3 extends AppCompatActivity
{
    RecyclerView recview;
    FirebaseAnalytics analytics;
    private MaxAdView adView;
    team3adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team3);
        getSupportActionBar().setTitle("Sri Lanka Squad");
        adView= findViewById(R.id.adView);
        adView.loadAd();
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<team3model> options =
                new FirebaseRecyclerOptions.Builder<team3model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("asiacup/srisquad"), team3model.class)
                        .build();

        adapter=new team3adapter(options);
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