package com.itvdn.junit.labs.ex_001;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void getFactorial() {
        long actual = Factorial.getFactorial(5);
        long expected = 120;

        assertEquals(expected, actual);
    }
}