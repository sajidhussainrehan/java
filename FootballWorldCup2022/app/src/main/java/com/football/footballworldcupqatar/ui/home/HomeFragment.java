package com.football.footballworldcupqatar.ui.home;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.football.footballworldcupqatar.Channels;
import com.football.footballworldcupqatar.Fixtures;
import com.football.footballworldcupqatar.Kits;
import com.football.footballworldcupqatar.Lineup;
import com.football.footballworldcupqatar.Live;
import com.football.footballworldcupqatar.News;
import com.football.footballworldcupqatar.Polls;
import com.football.footballworldcupqatar.Predictions;
import com.football.footballworldcupqatar.R;
import com.football.footballworldcupqatar.Stadium;
import com.football.footballworldcupqatar.Standings;
import com.football.footballworldcupqatar.Stats;
import com.football.footballworldcupqatar.Teams;
import com.football.footballworldcupqatar.Winners;
import com.football.footballworldcupqatar.databinding.FragmentHomeBinding;


import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {
    CardView cardView ;

    private String EVENT_DATE_TIME = "2022-11-20 15:00:00";
    private String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private LinearLayout linear_layout_1, linear_layout_2;
    private TextView tv_days, tv_hour, tv_minute, tv_second;
    private Handler handler = new Handler();
    private Runnable runnable;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        linear_layout_1 =  root.findViewById(R.id.linear_layout_1);
        linear_layout_2 = root.findViewById(R.id.linear_layout_2);
        tv_days = root.findViewById(R.id.tv_days);
        tv_hour = root.findViewById(R.id.tv_hour);
        tv_minute = root.findViewById(R.id.tv_minute);
        tv_second = root.findViewById(R.id.tv_second);
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

        cardView=root.findViewById(R.id.livenow);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Live.class));
            }
        });

        cardView=root.findViewById(R.id.news);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), News.class));
            }
        });
        cardView=root.findViewById(R.id.schedule);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Fixtures.class));
            }
        });
        cardView=root.findViewById(R.id.squads);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Teams.class));
            }
        });


        cardView=root.findViewById(R.id.lineup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Lineup.class));
            }
        });
        cardView=root.findViewById(R.id.predictions);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Predictions.class));
            }
        });
        cardView=root.findViewById(R.id.kits);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Kits.class));
            }
        });

        cardView=root.findViewById(R.id.stadium);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Stadium.class));
            }
        });
        cardView=root.findViewById(R.id.winners);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Winners.class));
            }
        });
        cardView=root.findViewById(R.id.channels);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Channels.class));
            }
        });

        cardView=root.findViewById(R.id.standings);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Standings.class));
            }
        });
        cardView=root.findViewById(R.id.stats);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Stats.class));
            }
        });

        cardView=root.findViewById(R.id.polls);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Polls.class));
            }
        });


        return root;
    }





    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void onStop() {
        super.onStop();
        handler.removeCallbacks(runnable);
    }
    public void onDestroy(){
        super.onDestroy();
        binding=null;
    }
}