package com.itvdn.junit.labs.ex_006;

/**
 * 1. Create a Person class. Write a Junit5Test which contains:
 * a) Basic assertion with different parameters.
 * b) A test with @DisplayName.
 * c) A repeating test.
 * d) Group assertions.
 * e) Lambda assertion.
 * 2. Create an AssumptionTest that checks the installed version of the jdk.
 * 3. Crate a ParametrizedTest that contains:
 * a) A parametrized test that checks if the input string contains a certain substring.
 * b) A parametrized test with an Enum source. Exclude some values.
 * 4. Create Nested test classes, run them.
 * 5. Create TestFactory class, run it.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
