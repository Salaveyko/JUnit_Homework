package com.itvdn.junit.labs.ex_006;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(strings = {"junit4", "junit5", "junit3"})
    void testContainsJunit(String example) {
        assertTrue(example.contains("junit"));
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = EnumSource.Mode.EXCLUDE, names = {"DAYS", "MINUTES"})
    void testEnum(TimeUnit timeUnit) {
        System.out.println(timeUnit);
        assertNotNull(timeUnit);
    }
}
