package com.itvdn.junit.labs.ex_006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestFactoryExample {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        List<Person> peoples = Arrays.asList(
                new Person("Tania", "Solovey", 31),
                new Person("Kristina", "Solovey", 20),
                new Person("Sofia", "Solovey", 18)
        );
        int minAge = 18;
        return peoples.stream()
                .map(person -> dynamicTest(person.toString(),
                        () -> Assertions.assertTrue(person.getAge() >= minAge)))
                .collect(toList());
    }
}
