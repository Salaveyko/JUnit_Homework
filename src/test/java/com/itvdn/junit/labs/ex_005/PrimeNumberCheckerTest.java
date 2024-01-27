package com.itvdn.junit.labs.ex_005;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberCheckerTest {

    @ParameterizedTest
    @MethodSource
    void testPrimeNumberChecker(int inputValue, boolean resultValue) {
        PrimeNumberChecker numberChecker = new PrimeNumberChecker();

        System.out.println("Parameterized number " + inputValue);
        assertEquals(resultValue, numberChecker.validate(inputValue));
    }

    private static Stream<Arguments> testPrimeNumberChecker() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(6, false),
                Arguments.of(19, true),
                Arguments.of(23, true)
        );
    }
}