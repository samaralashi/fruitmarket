package com.example.fruitmarket.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fruitmarket.R;
import com.example.fruitmarket.adapter.MainRecyclerAdapter;
import com.example.fruitmarket.model.AllCategory;
import com.example.fruitmarket.model.Frutis;

import java.util.ArrayList;
import java.util.List;

public class FruitsActivity extends AppCompatActivity {

    RecyclerView recyclerFruits;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        List<Frutis> allFrutis = new ArrayList<>();
        allFrutis.add(new Frutis(R.drawable.image1, "Strawberry", "$ 300 Per/ kg", 2.0f));
        allFrutis.add(new Frutis(R.drawable.image2, "Grapes", "$ 120 Per/ kg", 4.5f));

        setRecyclerFruits(allFrutis);



    }

    private void setRecyclerFruits(List<Frutis> allFrutis){
        recyclerFruits = findViewById(R.id.recycler_fruits);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerFruits.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);


        mainRecyclerAdapter = new MainRecyclerAdapter(this, allFrutis);
        recyclerFruits.setAdapter(mainRecyclerAdapter);
    }
}
