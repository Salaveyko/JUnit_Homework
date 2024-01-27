package com.itvdn.junit.labs.ex_005;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ModuleTest {
    @Test
    @Tag("fast")
    void testAccount() {
        System.out.println("Fast Acc Test");
    }

    @Test
    @Tag("fast")
    @Tag("slow")
    void addAccountToDb() {
        System.out.println("Fast and Slow add Acc");
    }
}
