package com.football.footballworldcupqatar.ui.gallery;

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

import com.football.footballworldcupqatar.Live;
import com.football.footballworldcupqatar.R;
import com.football.footballworldcupqatar.Team1;
import com.football.footballworldcupqatar.Team10;
import com.football.footballworldcupqatar.Team11;
import com.football.footballworldcupqatar.Team12;
import com.football.footballworldcupqatar.Team13;
import com.football.footballworldcupqatar.Team14;
import com.football.footballworldcupqatar.Team15;
import com.football.footballworldcupqatar.Team16;
import com.football.footballworldcupqatar.Team17;
import com.football.footballworldcupqatar.Team18;
import com.football.footballworldcupqatar.Team19;
import com.football.footballworldcupqatar.Team2;
import com.football.footballworldcupqatar.Team20;
import com.football.footballworldcupqatar.Team21;
import com.football.footballworldcupqatar.Team22;
import com.football.footballworldcupqatar.Team23;
import com.football.footballworldcupqatar.Team24;
import com.football.footballworldcupqatar.Team25;
import com.football.footballworldcupqatar.Team26;
import com.football.footballworldcupqatar.Team27;
import com.football.footballworldcupqatar.Team28;
import com.football.footballworldcupqatar.Team29;
import com.football.footballworldcupqatar.Team3;
import com.football.footballworldcupqatar.Team30;
import com.football.footballworldcupqatar.Team31;
import com.football.footballworldcupqatar.Team32;
import com.football.footballworldcupqatar.Team4;
import com.football.footballworldcupqatar.Team5;
import com.football.footballworldcupqatar.Team6;
import com.football.footballworldcupqatar.Team7;
import com.football.footballworldcupqatar.Team8;
import com.football.footballworldcupqatar.Team9;
import com.football.footballworldcupqatar.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
CardView cardView;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        cardView=root.findViewById(R.id.team1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team1.class));
            }
        });

        cardView=root.findViewById(R.id.team2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team2.class));
            }
        });
        cardView=root.findViewById(R.id.team3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team3.class));
            }
        });
        cardView=root.findViewById(R.id.team4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team4.class));
            }
        });
        cardView=root.findViewById(R.id.team5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team5.class));
            }
        });
        cardView=root.findViewById(R.id.team6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team6.class));
            }
        });
        cardView=root.findViewById(R.id.team7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team7.class));
            }
        });
        cardView=root.findViewById(R.id.team8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team8.class));
            }
        });
        cardView=root.findViewById(R.id.team9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team9.class));
            }
        });
        cardView=root.findViewById(R.id.team10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team10.class));
            }
        });
        cardView=root.findViewById(R.id.team11);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team11.class));
            }
        });
        cardView=root.findViewById(R.id.team12);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team12.class));
            }
        });
        cardView=root.findViewById(R.id.team13);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team13.class));
            }
        });
        cardView=root.findViewById(R.id.team14);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team14.class));
            }
        });
        cardView=root.findViewById(R.id.team15);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team15.class));
            }
        });
        cardView=root.findViewById(R.id.team16);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team16.class));
            }
        });
        cardView=root.findViewById(R.id.team17);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team17.class));
            }
        });
        cardView=root.findViewById(R.id.team18);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team18.class));
            }
        });
        cardView=root.findViewById(R.id.team19);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team19.class));
            }
        });
        cardView=root.findViewById(R.id.team20);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team20.class));
            }
        });
        cardView=root.findViewById(R.id.team21);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team21.class));
            }
        });
        cardView=root.findViewById(R.id.team22);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team22.class));
            }
        });
        cardView=root.findViewById(R.id.team23);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team23.class));
            }
        });
        cardView=root.findViewById(R.id.team24);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team24.class));
            }
        });
        cardView=root.findViewById(R.id.team25);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team25.class));
            }
        });
        cardView=root.findViewById(R.id.team26);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team26.class));
            }
        });
        cardView=root.findViewById(R.id.team27);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team27.class));
            }
        });
        cardView=root.findViewById(R.id.team28);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team28.class));
            }
        });
        cardView=root.findViewById(R.id.team29);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team29.class));
            }
        });
        cardView=root.findViewById(R.id.team30);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team30.class));
            }
        });
        cardView=root.findViewById(R.id.team31);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team31.class));
            }
        });
        cardView=root.findViewById(R.id.team32);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Team32.class));
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