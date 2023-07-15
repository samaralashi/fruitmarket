package com.example.fruitmarket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fruitmarket.R;
import com.example.fruitmarket.model.Frutis;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {

    private Context context;
    private List<Frutis> allFrutis;

    public MainRecyclerAdapter(Context context, List<Frutis> allFrutis) {
        this.context = context;
        this.allFrutis = allFrutis;
    }
//mk.m
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.item_organic_fruits, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        Frutis frutis = allFrutis.get(position);
        Glide.with(context).load(frutis.getImage()).into(holder.ivFruits);
        holder.tvName.setText(frutis.getName());
        holder.tvPrice.setText(frutis.getPrice());
        holder.ratingBar.setRating(frutis.getRate());
    }

    @Override
    public int getItemCount() {
        return allFrutis.size();
    }

    public static final class MainViewHolder extends RecyclerView.ViewHolder{
        ImageView ivFruits;
        TextView tvName, tvPrice;
        RatingBar ratingBar;
        public MainViewHolder(@NonNull View itemView){
            super(itemView);

            ivFruits = itemView.findViewById(R.id.iv_fruits);
            tvName = itemView.findViewById(R.id.tv_product_name);
            tvPrice = itemView.findViewById(R.id.tv_product_price);
            ratingBar = itemView.findViewById(R.id.rating);

        }
    }
}
