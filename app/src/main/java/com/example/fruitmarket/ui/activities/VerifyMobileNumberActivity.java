package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.fruitmarket.R;

public class VerifyMobileNumberActivity extends AppCompatActivity {

    Button btnVerifyPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_mobile_number);

        btnVerifyPhone = findViewById(R.id.btn_verify_phone);
        btnVerifyPhone.setOnClickListener(view -> {
            startActivity(new Intent(VerifyMobileNumberActivity.this, PersonalInformationActivity.class));
        });

    }
}