package com.itvdn.junit.labs.ex_005;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("slow")
public class IntegrationTest {
    @Test
    void accountIntegration() {
        System.out.println("Slow Acc Integration");
    }

    @Test
    void dbIntegration() {
        System.out.println("Slow DB Integration");
    }
}
