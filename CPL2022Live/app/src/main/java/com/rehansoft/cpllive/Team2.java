package com.rehansoft.cpllive;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.applovin.mediation.ads.MaxAdView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Team2 extends AppCompatActivity
{
    RecyclerView recview;
    FirebaseAnalytics analytics;
    team2adapter adapter;
    private MaxAdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
        getSupportActionBar().setTitle("Saint Lucia Squad");
        adView= findViewById(R.id.adView);
        adView.loadAd();
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<team2model> options =
                new FirebaseRecyclerOptions.Builder<team2model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("cpllive/saintlucia"), team2model.class)
                        .build();

        adapter=new team2adapter(options);
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