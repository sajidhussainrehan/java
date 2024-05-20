package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lineup extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineup);

        getSupportActionBar().setTitle("Lineup");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cardView=findViewById(R.id.confirmed);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Lineup.this,Lineup1.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.predicted);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Lineup.this,Lineup2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}