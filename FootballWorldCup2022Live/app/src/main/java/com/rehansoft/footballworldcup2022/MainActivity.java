package com.rehansoft.footballworldcup2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView cardView;
    private String EVENT_DATE_TIME = "2022-11-20 21:00:00";
    private String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private LinearLayout linear_layout_1, linear_layout_2;
    private TextView tv_days, tv_hour, tv_minute, tv_second;
    private Handler handler = new Handler();
    private Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear_layout_2 = findViewById(R.id.linear_layout_2);
        tv_days = findViewById(R.id.tv_days);
        tv_hour = findViewById(R.id.tv_hour);
        tv_minute = findViewById(R.id.tv_minute);
        tv_second = findViewById(R.id.tv_second);
        runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    handler.postDelayed(this, 1000);
                    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                    Date event_date = dateFormat.parse(EVENT_DATE_TIME);
                    Date current_date = new Date();
                    if (!current_date.after(event_date)) {
                        long diff = event_date.getTime() - current_date.getTime();
                        long Days = diff / (24 * 60 * 60 * 1000);
                        long Hours = diff / (60 * 60 * 1000) % 24;
                        long Minutes = diff / (60 * 1000) % 60;
                        long Seconds = diff / 1000 % 60;
                        //
                        tv_days.setText(String.format("%02d", Days));
                        tv_hour.setText(String.format("%02d", Hours));
                        tv_minute.setText(String.format("%02d", Minutes));
                        tv_second.setText(String.format("%02d", Seconds));
                    } else {
                        linear_layout_2.setVisibility(View.GONE);
                        handler.removeCallbacks(runnable);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);

        cardView=findViewById(R.id.news);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,News.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.live);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Live.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.schedule);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Schedule.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.teams);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Teams.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.lineup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Lineup.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.kits);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Kits.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.stadiums);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Stadium.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.groups);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Groups.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.winners);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Winners.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.channels);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Channels.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.prediction);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Predictions.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.standings);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Standings.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.stats);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Stats.class);
                startActivity(intent);
            }
        });
/*
        cardView=findViewById(R.id.polls);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Polls.class);
                startActivity(intent);
            }
        });

 */

        cardView=findViewById(R.id.result);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Results.class);
                startActivity(intent);
            }
        });

        cardView=findViewById(R.id.tickets);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.viagogo.com/ww/Sports-Tickets/Soccer/World-Cup-Tickets?AffiliateID=49&adposition=&PCID=PSROWGOOSPOFOOTB17618A28C&AdID=603852534680&MetroRegionID=&psc=%2c&ps=cy-1847%7cmr-0&ps_p=0&ps_c=16569151339&ps_ag=133193782543&ps_tg=kwd-1677760652121&ps_ad=603852534680&ps_adp=%2c&ps_fi=%2c&ps_li=2634&ps_lp=9075148&ps_n=g&ps_d=c&gclid=CjwKCAjw-rOaBhA9EiwAUkLV4napi053ENi1UY91JbhB0bscO3rIg91Y_QpXCo9WSZiAlT3XcU7rFBoCkOsQAvD_BwE";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent uri =builder.build();
                uri.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

        cardView=findViewById(R.id.shortvideo);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShortVideo.class);
                startActivity(intent);
            }
        });



    }
}