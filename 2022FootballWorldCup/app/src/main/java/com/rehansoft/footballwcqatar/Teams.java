package com.rehansoft.footballwcqatar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teams extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        getSupportActionBar().setTitle("Teams");
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

        cardView=findViewById(R.id.team17);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team17.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team18);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team18.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team19);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team19.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team20);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team20.class);
                startActivity(intent);
            }
        });


        cardView=findViewById(R.id.team21);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team21.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team22);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team22.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team23);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team23.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team24);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team24.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team25);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team25.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team26);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team26.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team27);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team27.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team28);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team28.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team29);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team29.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team30);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team30.class);
                startActivity(intent);
            }
        });


        cardView=findViewById(R.id.team31);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team31.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team32);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams.this,Team32.class);
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