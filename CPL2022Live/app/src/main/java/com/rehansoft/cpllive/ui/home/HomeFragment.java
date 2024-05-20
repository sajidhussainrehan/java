package com.rehansoft.cpllive.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.rehansoft.cpllive.Channels;
import com.rehansoft.cpllive.LineUp;
import com.rehansoft.cpllive.Live;
import com.rehansoft.cpllive.News;
import com.rehansoft.cpllive.Pionts;
import com.rehansoft.cpllive.Polls;
import com.rehansoft.cpllive.Prediction;
import com.rehansoft.cpllive.R;
import com.rehansoft.cpllive.Schedule;
import com.rehansoft.cpllive.Winners;
import com.rehansoft.cpllive.databinding.FragmentHomeBinding;
import com.rehansoft.cpllive.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {
CardView cardView;
    private FragmentHomeBinding binding;

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
        cardView=root.findViewById(R.id.fixtures);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Schedule.class));
            }
        });

        cardView=root.findViewById(R.id.teams);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_content_main,new GalleryFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        cardView=root.findViewById(R.id.lineup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LineUp.class));
            }
        });

        cardView=root.findViewById(R.id.predictions);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Prediction.class));
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
                startActivity(new Intent(getActivity(), Pionts.class));
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
}