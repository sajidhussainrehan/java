package com.rehansoft.cpllive;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.applovin.mediation.ads.MaxAdView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Team5 extends AppCompatActivity
{
    RecyclerView recview;
    team5adapter adapter;
    FirebaseAnalytics analytics;
    private MaxAdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team5);
        getSupportActionBar().setTitle("Guyana Amazon Squad");
        adView= findViewById(R.id.adView);
        adView.loadAd();
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<team5model> options =
                new FirebaseRecyclerOptions.Builder<team5model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("cpllive/guyana"), team5model.class)
                        .build();

        adapter=new team5adapter(options);
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