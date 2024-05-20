package com.eurocup.uefaeuro2021;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;

public class Team23 extends AppCompatActivity
{
    RecyclerView recview;
    FirebaseAnalytics analytics;
    team1adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team23);

        getSupportActionBar().setTitle("Morocco Squad");
        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<team1model> options =
                new FirebaseRecyclerOptions.Builder<team1model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("worldcupp/team23"), team1model.class)
                        .build();

        adapter=new team1adapter(options);
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