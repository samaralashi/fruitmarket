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
import com.example.fruitmarket.model.Fruits;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {

    private Context context;
    private List<Fruits> allFruits;
    private OnItemClickListener onItemClickListener; // Item click listener


    public MainRecyclerAdapter(Context context, List<Fruits> allFruits) {
        this.context = context;
        this.allFruits = allFruits;
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    //mk.m
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.item_organic_fruits, parent, false), onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        Fruits fruits = allFruits.get(position);
        Glide.with(context).load(fruits.getImage()).into(holder.ivFruits);
        holder.tvName.setText(fruits.getName());
        holder.tvPrice.setText(fruits.getPrice());
        holder.ratingBar.setRating(fruits.getRate());
    }

    @Override
    public int getItemCount() {
        return allFruits.size();
    }

    public static final class MainViewHolder extends RecyclerView.ViewHolder{
        ImageView ivFruits;
        TextView tvName, tvPrice;
        RatingBar ratingBar;
        OnItemClickListener onItemClickListener;
        public MainViewHolder(@NonNull View itemView, OnItemClickListener listener){
            super(itemView);

            onItemClickListener = listener;
            ivFruits = itemView.findViewById(R.id.iv_fruits);
            tvName = itemView.findViewById(R.id.tv_product_name);
            tvPrice = itemView.findViewById(R.id.tv_product_price);
            ratingBar = itemView.findViewById(R.id.rating);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }
}
