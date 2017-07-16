package com.example.recyclerview0;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



class SimpleViewHolder extends RecyclerView.ViewHolder {

    private TextView tvRow;

    public SimpleViewHolder(View itemView) {
        super(itemView);

        tvRow = itemView.findViewById(R.id.tv_row);
    }

    public void bindData(String data) {
        tvRow.setText(data);
    }
}
