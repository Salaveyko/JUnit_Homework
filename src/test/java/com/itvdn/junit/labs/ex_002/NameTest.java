package com.itvdn.junit.labs.ex_002;

import org.junit.*;

import static org.junit.Assert.*;

public class NameTest {
    private Name name;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void before() {
        System.out.println("Before");
        name = new Name("Alex");
    }

    @After
    public void after() {
        System.out.println("After");
        name = null;
    }

    @Test
    public void concatTest() {
        System.out.println("Concat test");

        String str = " Solovey";
        String actual = name.concat(str);
        String expected = "Alex Solovey";

        assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        System.out.println("Contains test");

        String str = "Ale";

        assertTrue(name.contains(str));
    }

    @Test
    public void isEmptyTest() {
        System.out.println("Is empty test");

        assertFalse(name.isEmpty());
    }

    @Test
    public void lastIndexOfTest() {
        System.out.println("Last index of test");

        char ch = 'A';
        int actual = name.lastIndexOf(ch);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        System.out.println("Get name test");

        String actual = name.getName();
        String expected = "Alex";

        assertEquals(expected, actual);
    }
}