package com.rehansoft.nationsleague.ui.home;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.rehansoft.nationsleague.Channels;
import com.rehansoft.nationsleague.Livenow;
import com.rehansoft.nationsleague.News;
import com.rehansoft.nationsleague.Predictions;
import com.rehansoft.nationsleague.R;
import com.rehansoft.nationsleague.Schedule;
import com.rehansoft.nationsleague.Squads;
import com.rehansoft.nationsleague.Standings;
import com.rehansoft.nationsleague.Stats;
import com.rehansoft.nationsleague.databinding.FragmentHomeBinding;
public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
CardView cardView ;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        cardView=root.findViewById(R.id.livenow);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Livenow.class));
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
                startActivity(new Intent(getActivity(), Schedule.class));
            }
        });

        cardView=root.findViewById(R.id.squads);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Squads.class));
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

        cardView=root.findViewById(R.id.predictions);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Predictions.class));
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}