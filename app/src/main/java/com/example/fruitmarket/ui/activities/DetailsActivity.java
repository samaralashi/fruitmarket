package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fruitmarket.R;
import com.example.fruitmarket.model.Fruits;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Fruits selectedFruit = (Fruits) getIntent().getSerializableExtra("selectedFruit");

        // Now you can access the details of the selected fruit and display them in the UI
        // For example:
        ImageView imageView = findViewById(R.id.iv_fruits);
        TextView nameTextView = findViewById(R.id.fruit_name);
        TextView detailsTextView = findViewById(R.id.fruit_details);
        TextView nutritionTextView = findViewById(R.id.fruit_nutrition);
        TextView priceTextView = findViewById(R.id.fruit_price);

        // ... (other UI elements)

        imageView.setImageResource(selectedFruit.getImage());
        nameTextView.setText(selectedFruit.getName());
        detailsTextView.setText(selectedFruit.getDescription());
        nutritionTextView.setText(selectedFruit.getNutrition());
        priceTextView.setText(selectedFruit.getPrice());
    }
}