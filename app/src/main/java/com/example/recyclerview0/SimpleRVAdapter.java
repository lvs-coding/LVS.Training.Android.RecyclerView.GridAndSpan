package com.example.recyclerview0;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by laurent on 7/16/17.
 */


public class SimpleRVAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    String[] data = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_main_row,parent,false);

        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.bindData(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
