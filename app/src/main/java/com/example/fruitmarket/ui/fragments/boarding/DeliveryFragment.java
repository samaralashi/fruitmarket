package com.example.fruitmarket.ui.fragments.boarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fruitmarket.R;

public class DeliveryFragment extends Fragment {

    private static DeliveryFragment instance;
    public static DeliveryFragment getInstance(){
        return  instance == null ? new DeliveryFragment() : instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivery, container, false);
    }
}