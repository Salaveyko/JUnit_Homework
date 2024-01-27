package com.itvdn.junit.labs.ex_004.entity.abstr;

import java.util.Date;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int weight;
    protected float speedMeterPerSecond;

    public Animal() {
    }

    public Animal(String name, String color, int weight, int speedKmPerHour) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.speedMeterPerSecond = speedKmPerHour * 1000F / 3600F;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float run100meters() {
        Date start = new Date();

        try {
            Thread.sleep((long) (100000 / speedMeterPerSecond));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date finish = new Date();
        float time = finish.getTime() - start.getTime();

        return time / 1000;
    }

    public abstract String sayHello();

    @Override
    public String toString() {
        return this.color + ' ' + this.getClass().getSimpleName()
                + ' ' + this.name + " say " + sayHello();
    }
}
