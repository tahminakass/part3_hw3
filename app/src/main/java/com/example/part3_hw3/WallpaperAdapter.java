package com.example.part3_hw3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.part3_hw3.databinding.WallpaperItemBinding;

import java.util.ArrayList;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperViewHolder> {

    private ArrayList<String> wallpaperList;
    private ArrayList<String> imageList;

    public WallpaperAdapter(ArrayList<String> wallpaperList, ArrayList<String> imageList) {
        this.wallpaperList = wallpaperList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WallpaperViewHolder(WallpaperItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperViewHolder holder, int position) {
        holder.onBind(wallpaperList.get(position), imageList.get(position));

    }

    @Override
    public int getItemCount() {
        return wallpaperList.size();
    }
}
