package com.lloydna.autosprayer.ui.schedules;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lloydna.autosprayer.databinding.SchedulesAdapterBinding;
import com.lloydna.autosprayer.engine.schedules.Schedule;

import java.util.List;

public class SchedulesAdapter extends RecyclerView.Adapter<SchedulesAdapter.ViewHolder> {
    private List<Schedule> schedules;

    public SchedulesAdapter(List<Schedule> schedules){
        super();
        this.schedules = schedules;
    }
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
        holder.obBinding.SchedulesAdapterName.setText(schedules.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return schedules.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private SchedulesAdapterBinding obBinding;

        public ViewHolder(SchedulesAdapterBinding arBinding){
            super(arBinding.getRoot());
            obBinding = arBinding;
        }

    }



}
