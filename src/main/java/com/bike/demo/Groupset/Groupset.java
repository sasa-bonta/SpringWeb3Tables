package com.bike.demo.Groupset;

public class Groupset {
    private long id;
    private String brand;
    private int frontSpeeds;
    private String frontSpeedRange;
    private int rearSpeeds;
    private String rearSpeedRange;

    public Groupset(long id, String brand, int frontSpeeds, String frontSpeedRange, int rearSpeeds, String rearSpeedRange) {
        this.id = id;
        this.brand = brand;
        this.frontSpeeds = frontSpeeds;
        this.frontSpeedRange = frontSpeedRange;
        this.rearSpeeds = rearSpeeds;
        this.rearSpeedRange = rearSpeedRange;
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

    public int getFrontSpeeds() {
        return frontSpeeds;
    }

    public void setFrontSpeeds(int frontSpeeds) {
        this.frontSpeeds = frontSpeeds;
    }

    public String getFrontSpeedRange() {
        return frontSpeedRange;
    }

    public void setFrontSpeedRange(String frontSpeedRange) {
        this.frontSpeedRange = frontSpeedRange;
    }

    public int getRearSpeeds() {
        return rearSpeeds;
    }

    public void setRearSpeeds(int rearSpeeds) {
        this.rearSpeeds = rearSpeeds;
    }

    public String getRearSpeedRange() {
        return rearSpeedRange;
    }

    public void setRearSpeedRange(String rearSpeedRange) {
        this.rearSpeedRange = rearSpeedRange;
    }
}
