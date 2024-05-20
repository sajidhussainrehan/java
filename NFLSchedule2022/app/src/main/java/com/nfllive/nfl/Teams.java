package com.nfllive.nfl;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Teams extends AppCompatActivity
{
CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        getSupportActionBar().setTitle("NFC Teams");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView=findViewById(R.id.team1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team1.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team2.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team3.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team4.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team5.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team6.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team7.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team8.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team9.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team10.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team11);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team11.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team12);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team12.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team13);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team13.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team14);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team14.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team15);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team15.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team16);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team16.class);
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