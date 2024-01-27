package com.itvdn.junit.labs.ex_003;

public class Car {
    private String brand;
    private int horsePower;
    private int maxSpeed;

    public Car(String brand, int horsePower, int maxSpeed) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
