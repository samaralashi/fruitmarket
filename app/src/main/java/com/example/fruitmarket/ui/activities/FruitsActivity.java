package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.fruitmarket.R;
import com.example.fruitmarket.adapter.MainRecyclerAdapter;
import com.example.fruitmarket.model.Fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitsActivity extends AppCompatActivity {

    RecyclerView recyclerFruits;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        List<Fruits> allFruits = new ArrayList<>();
        allFruits.add(new Fruits(R.drawable.image1, "Strawberry", "$ 300 Per/ kg", 2.0f));
        allFruits.add(new Fruits(R.drawable.image7, "Grapes", "$ 120 Per/ kg", 4.5f));
        allFruits.add(new Fruits(R.drawable.orange, "Oranges", "$ 120 Per/ kg", 4.5f));
        setRecyclerFruits(allFruits);

        /////////////////////////////////////////////////////

        List<Fruits> allMixedFruits = new ArrayList<>();
        allMixedFruits.add(new Fruits(R.drawable.image4, "Strawberry", "$ 300 Per/ kg", 2.0f));
        allMixedFruits.add(new Fruits(R.drawable.image2, "Grapes", "$ 160 Per/ kg", 4.5f));
        allMixedFruits.add(new Fruits(R.drawable.image6, "Grapes", "$ 120 Per/ kg", 4.5f));
        setRecyclerFruitsMixed(allMixedFruits);

        ////////////////////////////////////////////////

        List<Fruits> allStoneFruits = new ArrayList<>();
        allStoneFruits.add(new Fruits(R.drawable.image8, "Strawberry", "$ 300 Per/ kg", 2.0f));
        allStoneFruits.add(new Fruits(R.drawable.image9, "Grapes", "$ 120 Per/ kg", 4.5f));
        allStoneFruits.add(new Fruits(R.drawable.image10, "Grapes", "$ 120 Per/ kg", 4.5f));
        setRecyclerStoneFruits(allStoneFruits);

        ///////////////////////////////////////////

        List<Fruits> allMelonFruits = new ArrayList<>();
        allMelonFruits.add(new Fruits(R.drawable.image11, "Strawberry", "$ 300 Per/ kg", 2.0f));
        allMelonFruits.add(new Fruits(R.drawable.image12, "Grapes", "$ 120 Per/ kg", 4.5f));
        allMelonFruits.add(new Fruits(R.drawable.image13, "Grapes", "$ 120 Per/ kg", 4.5f));
        setRecyclerMelonFruits(allMelonFruits);

    }

    private void setRecyclerFruits(List<Fruits> allFruits) {
        recyclerFruits = findViewById(R.id.recycler_fruits);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerFruits.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allFruits);
        recyclerFruits.setAdapter(mainRecyclerAdapter);

        mainRecyclerAdapter.setOnItemClickListener(position -> {
            Fruits selectedFruit = allFruits.get(position);

            Intent intent = new Intent(FruitsActivity.this, DetailsActivity.class);
            intent.putExtra("selectedFruit", selectedFruit);
            startActivity(intent);
        });
    }

    private void setRecyclerFruitsMixed(List<Fruits> allMixedFruits) {
        recyclerFruits = findViewById(R.id.recycler_fruits2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerFruits.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allMixedFruits);
        recyclerFruits.setAdapter(mainRecyclerAdapter);

        mainRecyclerAdapter.setOnItemClickListener(position -> {
            Fruits selectedFruit = allMixedFruits.get(position);

            Intent intent = new Intent(FruitsActivity.this, DetailsActivity.class);
            intent.putExtra("selectedFruit", selectedFruit);
            startActivity(intent);
        });
    }

    private void setRecyclerStoneFruits(List<Fruits> allStoneFruits) {
        recyclerFruits = findViewById(R.id.recycler_fruits3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerFruits.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allStoneFruits);
        recyclerFruits.setAdapter(mainRecyclerAdapter);

        mainRecyclerAdapter.setOnItemClickListener(position -> {
            Fruits selectedFruit = allStoneFruits.get(position);

            Intent intent = new Intent(FruitsActivity.this, DetailsActivity.class);
            intent.putExtra("selectedFruit", selectedFruit);
            startActivity(intent);
        });
    }

    private void setRecyclerMelonFruits(List<Fruits> allMelonFruits) {
        recyclerFruits = findViewById(R.id.recycler_fruits4);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerFruits.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allMelonFruits);
        recyclerFruits.setAdapter(mainRecyclerAdapter);

        mainRecyclerAdapter.setOnItemClickListener(position -> {
            Fruits selectedFruit = allMelonFruits.get(position);

            Intent intent = new Intent(FruitsActivity.this, DetailsActivity.class);
            intent.putExtra("selectedFruit", selectedFruit);
            startActivity(intent);
        });
    }

}
