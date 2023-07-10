package com.example.fruitmarket;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fruitmarket.adapter.BoardingAdapter;
import com.example.fruitmarket.ui.fragments.boarding.DeliveryArrivedFragment;
import com.example.fruitmarket.ui.fragments.boarding.DeliveryFragment;
import com.example.fruitmarket.ui.fragments.boarding.EShoppingFragment;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class BoardingActivity extends AppCompatActivity {

    TextView tvSkip;
    ViewPager2 pagerBoarding;
    Button btnNext;

    DotsIndicator dotsIndicator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding);

        pagerBoarding = findViewById(R.id.pager_barding);
        dotsIndicator = findViewById(R.id.dots_indicator);
        btnNext = findViewById(R.id.btn_next);
        tvSkip = findViewById(R.id.tv_skip);

        BoardingAdapter  boardingAdapter = new BoardingAdapter(this);
        boardingAdapter.addFragment(DeliveryArrivedFragment.getInstance());
        boardingAdapter.addFragment(DeliveryFragment.getInstance());
        boardingAdapter.addFragment(EShoppingFragment.getInstance());

        pagerBoarding.setAdapter(boardingAdapter);
        dotsIndicator.attachTo(pagerBoarding);

    }
}
