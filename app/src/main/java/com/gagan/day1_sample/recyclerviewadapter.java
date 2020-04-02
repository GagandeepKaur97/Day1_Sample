package com.gagan.day1_sample;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.viewHolder> {
    private static final String TAG = "recyclerviewadapter";

    @NonNull
    @Override
    public recyclerviewadapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewadapter.viewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imagename;
        Constraints parentLayout;

        public viewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imagename = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent);
        }
    }
}