package com.example.fruitmarket.model;

public class Frutis {

    private int image;
    private String name;
    private String price;

    private float rate;

    public Frutis(int image, String name, String price, float rate) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.rate = rate;
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
