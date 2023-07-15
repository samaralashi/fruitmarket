package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.fruitmarket.BoardingActivity;
import com.example.fruitmarket.R;
import com.example.fruitmarket.SplashActivity;

public class MsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MsgActivity.this, VerifyMobileNumberActivity.class));
                    }
                }, 2000);
    }
}