package com.itvdn.junit.labs.ex_004.entity;

import com.itvdn.junit.labs.ex_004.entity.abstr.Animal;

public class Turtle extends Animal {
    private final static int SPEED_KM_HOUR = 1;

    public Turtle(String name, String color, int weight) {
        super(name, color, weight, SPEED_KM_HOUR);
    }

    @Override
    public String sayHello() {
        return "'ZzZzZ'";
    }
}
