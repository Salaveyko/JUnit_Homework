package com.itvdn.junit.labs.ex_002;

/**
 * Create a testing class and cover Name.class with tests.
 * You should additionally use @BeforeClass, @AfterClass, @Before, and @After annotations.
 */
public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String concat(String str) {
        return name + str;
    }

    public boolean contains(String str) {
        return name.contains(str);
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }

    public int lastIndexOf(char ch) {
        return name.lastIndexOf(ch);
    }
}
