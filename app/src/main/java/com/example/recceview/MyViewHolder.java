package com.example.recceview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView text_name;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        text_name = itemView.findViewById(R.id.text_name);

    }
}
