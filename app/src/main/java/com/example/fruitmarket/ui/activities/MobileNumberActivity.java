package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.fruitmarket.R;

public class MobileNumberActivity extends AppCompatActivity {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(view -> {
            startActivity(new Intent(this, VerifyActivity.class));
        });
    }
}