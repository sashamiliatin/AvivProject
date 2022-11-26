package com.example.avivproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView heroName, heroInfo;
    public ImageView heroImage;
    public CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        heroName = itemView.findViewById(R.id.heroName);
        heroInfo = itemView.findViewById(R.id.heroInfo);
        heroImage = itemView.findViewById(R.id.heroImage);
        cardView = itemView.findViewById(R.id.main_container);
    }
}
