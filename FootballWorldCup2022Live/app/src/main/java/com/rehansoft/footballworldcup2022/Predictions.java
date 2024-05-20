package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Predictions extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictions);
        getSupportActionBar().setTitle("Predictions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView=findViewById(R.id.lineuppre);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Predictions.this,Lineup2.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.matpredicted);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Predictions.this,Prediction1.class);
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