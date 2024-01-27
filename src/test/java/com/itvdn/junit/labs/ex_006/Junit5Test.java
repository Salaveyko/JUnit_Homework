package com.itvdn.junit.labs.ex_006;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

@DisplayName("Override class name")
public class Junit5Test {

    @RepeatedTest(value = 3, name = LONG_DISPLAY_NAME)
    void repeatedTest(RepetitionInfo info, TestInfo testInfo) {
        System.out.println(info.getCurrentRepetition() + " " + testInfo.getDisplayName());
    }

    @Test
    void assertTrueWithLambda() {
        List<String> arrList = Arrays.asList("What's up", "Junit");
        assertFalse(arrList::isEmpty);
        assertTrue(arrList.contains("Junit"));
    }

    @Test
    void groupAssertions() {
        String firstNameExpected = "Alex";
        String lastNameExpected = "Solovey";
        Person person = new Person(firstNameExpected, lastNameExpected);
        assertAll(
                () -> assertEquals(firstNameExpected, person.getFirstName()),
                () -> assertEquals(lastNameExpected, person.getLastName())
        );
    }

    @Test
    void baseAssertions() {
        String expStr = "qwerty";
        int expInt = 3;
        Person person = new Person(expStr, expStr, expInt);

        assertEquals(expStr, person.getFirstName());
        assertEquals(expStr, person.getLastName(), "The last name is Ok.");
        assertEquals(expInt, person.getAge(), () -> "Lazy evaluation message. Age - Ok.");
    }

    @Test
    @DisplayName("Test print")
    void firstTest() {
        System.out.println("@DisplayName test. Don`t pay attention :)");
    }
}
