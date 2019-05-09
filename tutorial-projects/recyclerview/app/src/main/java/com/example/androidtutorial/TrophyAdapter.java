package com.example.androidtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrophyAdapter extends RecyclerView.Adapter<TrophyHolder> {
    private Context context;
    private ArrayList<Trophy> trophies;

    public TrophyAdapter(Context context, ArrayList<Trophy> trophies) {
        this.context = context;
        this.trophies = trophies;
    }

    @Override
    public int getItemCount() {
        return trophies.size();
    }

    @Override
    public TrophyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.trophies_item, parent, false);
        return new TrophyHolder(view);
    }

    @Override
    public void onBindViewHolder(TrophyHolder holder, int position) {
        Trophy trophy = trophies.get(position);
        holder.setDetails(trophy);
    }

}