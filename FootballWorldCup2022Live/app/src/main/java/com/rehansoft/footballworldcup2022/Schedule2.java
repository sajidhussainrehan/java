package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Schedule2 extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule2);
        getSupportActionBar().setTitle("Team Wise Schedule");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView=findViewById(R.id.team1s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams1.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team2s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams2.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team3s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams3.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team4s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams4.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team5s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams5.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team6s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams6.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team7s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams7.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team8s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams8.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team9s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams9.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team10s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams10.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team11s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams11.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team12s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams12.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team13s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams13.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team14s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams14.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team15s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams15.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team16s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams16.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team17s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams17.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team18s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams18.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team19s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams19.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team20s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams20.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team21s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams21.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team22s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams22.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team23s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams23.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team24s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams24.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team25s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams25.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team26s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams26.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team27s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams27.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team28s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams28.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team29s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams29.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team30s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams30.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team31s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams31.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.team32s);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Schedule2.this,Teams32.class);
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