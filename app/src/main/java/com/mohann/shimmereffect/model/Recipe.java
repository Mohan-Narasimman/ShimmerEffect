package com.mohann.shimmereffect.model;

public class Recipe {
    private int id;
    private String name;
    private String description;
    private double price;
    private String thumbnail;
    private String chef;
    private String timestamp;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getChef() {
        return chef;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Recipe() {
    }
}
