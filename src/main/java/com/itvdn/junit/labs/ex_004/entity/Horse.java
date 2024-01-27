package com.itvdn.junit.labs.ex_004.entity;

import com.itvdn.junit.labs.ex_004.entity.abstr.Animal;

public class Horse extends Animal {
    private final static int SPEED_KM_HOUR = 88;

    public Horse(String name, String color, int weight) {
        super(name, color, weight, SPEED_KM_HOUR);
    }

    @Override
    public String sayHello() {
        return "'Igo-go'";
    }
}
