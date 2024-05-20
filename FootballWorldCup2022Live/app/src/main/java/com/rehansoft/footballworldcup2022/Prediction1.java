package com.rehansoft.footballworldcup2022;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Prediction1 extends AppCompatActivity
{
    RecyclerView recview;
    myadapter4 adapter;
    FirebaseAnalytics analytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction1);

        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setTitle("Match Prediction");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model4> options =
                new FirebaseRecyclerOptions.Builder<model4>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("footballlive/matchpre"), model4.class)
                        .build();

        adapter=new myadapter4(options);
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