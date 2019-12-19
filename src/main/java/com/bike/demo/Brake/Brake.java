package com.bike.demo.Brake;

public class Brake {
    private long id;
    private String brand;
    private int quantityOfPistons;
    private int diameterOfRotor;

    public Brake(long id, String brand, int quantityOfPistons, int diameterOfRotor) {
        this.id = id;
        this.brand = brand;
        this.quantityOfPistons = quantityOfPistons;
        this.diameterOfRotor = diameterOfRotor;
    }

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

    public int getQuantityOfPistons() {
        return quantityOfPistons;
    }

    public void setQuantityOfPistons(int quantityOfPistons) {
        this.quantityOfPistons = quantityOfPistons;
    }

    public int getDiameterOfRotor() {
        return diameterOfRotor;
    }

    public void setDiameterOfRotor(int diameterOfRotor) {
        this.diameterOfRotor = diameterOfRotor;
    }
}
