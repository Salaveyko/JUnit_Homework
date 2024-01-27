package com.itvdn.junit.labs.ex_004;

import com.itvdn.junit.labs.ex_004.entity.abstr.Animal;
import com.itvdn.junit.labs.ex_004.entity.Horse;
import com.itvdn.junit.labs.ex_004.entity.Tiger;
import com.itvdn.junit.labs.ex_004.entity.Turtle;

/**
 * Create tests for @Rule rules.
 * Create custom rule.
 * Create your own Runner and run it with @RunWith.
 */
public class Main {
    public static void main(String[] args) {
        Animal horse = new Horse("Ponita", "Black", 300);
        Animal tiger = new Tiger("Sherkhan", "Orange in black", 250);
        Animal turtle = new Turtle("Leonardo", "Green", 150);

        runAnimal(horse);
        runAnimal(tiger);
        runAnimal(turtle);
    }

    private static void runAnimal(Animal animal) {
        float runBuf;

        System.out.println(animal + " and run...");
        runBuf = animal.run100meters();
        System.out.println(animal.getName() + " finishes in " + runBuf + " sec");
    }
}
