package com.aap.data.update;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView year;
    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.movie_name);
        year = itemView.findViewById(R.id.movie_year);
    }

}
