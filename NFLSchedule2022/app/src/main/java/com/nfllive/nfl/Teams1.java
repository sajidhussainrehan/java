package com.nfllive.nfl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teams1 extends AppCompatActivity {
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams1);
        getSupportActionBar().setTitle("AFC Teams");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView=findViewById(R.id.team17);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team17.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team18);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team18.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team19);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team19.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team20);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team20.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team21);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team21.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team22);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team22.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team23);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team23.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team24);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team24.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team25);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team25.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team26);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team26.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team27);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team27.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team28);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team28.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team29);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team29.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team30);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team30.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team31);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team31.class);
                startActivity(intent);
            }
        });
        cardView=findViewById(R.id.team32);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teams1.this,Team32.class);
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