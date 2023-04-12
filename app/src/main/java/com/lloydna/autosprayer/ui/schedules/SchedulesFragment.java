package com.lloydna.autosprayer.ui.schedules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.lloydna.autosprayer.databinding.FragmentSchedulesBinding;
import com.lloydna.autosprayer.engine.apis.SchedulesApi;

public class SchedulesFragment extends Fragment {

    private FragmentSchedulesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SchedulesViewModel schedulesViewModel =
                new ViewModelProvider(this).get(SchedulesViewModel.class);

        binding = FragmentSchedulesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.SchedulesListRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(),
                LinearLayoutManager.VERTICAL,false));

        binding.SchedulesListRecyclerView.setAdapter(new SchedulesAdapter(((SchedulesApi)SchedulesApi.getSchedulesApi()).getSchedules()));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}