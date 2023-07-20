package com.example.fruitmarket.model;

import java.io.Serializable;

public class Fruits implements Serializable {

    private int image;
    private String name;
    private String price;
    private String description;
    private float rate;
    private String nutrition;

    public Fruits(int image, String name, String price, float rate) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Fruits(int image, String name, String price, String description, String nutrition) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
        this.nutrition = nutrition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
