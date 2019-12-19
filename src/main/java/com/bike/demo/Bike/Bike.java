package com.bike.demo.Bike;

public class Bike {
    private long id;
    private String brand;
    private String model;
    private float size;
    private float weight;
    private String material;

    //Constructor
    public Bike(long id, String brand, String model, float size, float weight, String material) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.weight = weight;
        this.material = material;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
