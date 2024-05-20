package com.rehansoft.footballworldcup2022;
import static android.service.controls.ControlsProviderService.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Teams2 extends AppCompatActivity
{
    RecyclerView recview;
    myadapter1 adapter;
    FirebaseAnalytics analytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams2);

        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setTitle("Ecuador");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model1> options =
                new FirebaseRecyclerOptions.Builder<model1>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("footballlive/teams2"), model1.class)
                        .build();

        adapter=new myadapter1(options);
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