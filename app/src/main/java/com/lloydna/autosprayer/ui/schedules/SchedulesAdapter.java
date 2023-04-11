package com.lloydna.autosprayer.ui.schedules;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lloydna.autosprayer.databinding.SchedulesAdapterBinding;

public class SchedulesAdapter extends RecyclerView.Adapter<SchedulesAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SchedulesAdapterBinding binding = SchedulesAdapterBinding.inflate(inflater);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.setMargins(0,0,0,10);

        binding.getRoot().setLayoutParams(params);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private SchedulesAdapterBinding obBinding;

        public ViewHolder(SchedulesAdapterBinding arBinding){
            super(arBinding.getRoot());
            obBinding = arBinding;
        }

    }



}
