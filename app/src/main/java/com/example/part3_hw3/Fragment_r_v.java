package com.example.part3_hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.part3_hw3.databinding.FragmentRVBinding;

import java.sql.Array;
import java.util.ArrayList;

public class Fragment_r_v extends Fragment {

    FragmentRVBinding binding;
    WallpaperAdapter adapter;
    private ArrayList<String> wallpaperList = new ArrayList<>();
    private ArrayList<String> imageList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRVBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new WallpaperAdapter(wallpaperList, imageList);
        binding.rvView.setAdapter(adapter);
    }

    private void loadData() {
        wallpaperList.add("https://i.pinimg.com/236x/64/08/5a/64085a4d1a12d8f07c609d250c8aaa40.jpg");
    }
}