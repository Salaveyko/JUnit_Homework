package com.itvdn.junit.labs.ex_006;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {

    @Test
    void testJava18Installed() {
        Assumptions.assumeTrue(System.getProperty("java.version").contains("18"));
        System.out.println("It`s OK");
    }

    @Test
    void testJava17Installed() {
        Assumptions.assumeTrue(System.getProperty("java.version").contains("17"));
        System.out.println("Need to update JAVA");
    }
}
