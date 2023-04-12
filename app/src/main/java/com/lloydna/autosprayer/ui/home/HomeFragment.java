package com.lloydna.autosprayer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Discouraged;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.lloydna.autosprayer.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding obBinding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        obBinding = FragmentHomeBinding.inflate(inflater, container, false);

        TestingUtils.replaceView(obBinding.horseShoeHumidityIndicator.getRootView(), new HorseShoeView(this.getContext()));

        return obBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        obBinding = null;
    }



}

