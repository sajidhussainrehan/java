package com.rehansoft.cpllive.ui.gallery;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.rehansoft.cpllive.Channels;
import com.rehansoft.cpllive.R;
import com.rehansoft.cpllive.Team1;
import com.rehansoft.cpllive.Team2;
import com.rehansoft.cpllive.Team3;
import com.rehansoft.cpllive.Team4;
import com.rehansoft.cpllive.Team5;
import com.rehansoft.cpllive.Team6;
import com.rehansoft.cpllive.databinding.FragmentGalleryBinding;


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
        });cardView=root.findViewById(R.id.team4);
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
        return root;
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}