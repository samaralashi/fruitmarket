package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.fruitmarket.R;

public class VerifyActivity extends AppCompatActivity {
     Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        btn = findViewById(R.id.btn_verify);
        btn.setOnClickListener(view ->{
            startActivity(new Intent(this, MsgActivity.class));
        });
    }
}