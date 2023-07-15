package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.tv.PesRequest;
import android.os.Bundle;
import android.widget.Button;

import com.example.fruitmarket.R;

public class PersonalInformationActivity extends AppCompatActivity {

    Button btnVerifyInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_inforamtion);

        btnVerifyInformation = findViewById(R.id.btn_verify_information);
        btnVerifyInformation.setOnClickListener(view -> {
            startActivity(new Intent(PersonalInformationActivity.this, FruitsActivity.class));
        });
    }
}