package com.itvdn.junit.labs.ex_003;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class CarShopTest {
    private static List<Car> cars;
    private CarShop carShop;

    @BeforeClass
    public static void beforeClass() {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", 400, 300));
        cars.add(new Car("BMW", 450, 320));
        cars.add(new Car("Mazda", 250, 280));
    }

    @AfterClass
    public static void afterAll() {
        cars = null;
    }

    @Before
    public void beforeEach() {
        carShop = new CarShop(cars);
    }

    @Test
    public void assertEqualsTest() {
        List<Car> actual = carShop.get();
        List<Car> expected = cars;

        assertEquals(expected, actual);
    }

    @Test
    public void assertArrayTest() {
        char[] expected = {'B', 'M', 'W'};
        char[] actual = carShop.get(1).getBrand().toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void assertTrueTest() {
        assertTrue(!carShop.isEmpty());
    }

    @Test
    public void assertFalseTest() {
        assertFalse(carShop.hasBrand("Porsche"));
    }

    @Test
    public void assertNotNullTest() {
        assertNotNull(carShop.get("Mercedes"));
    }

    @Test
    public void assertNullTest() {
        assertNull(carShop.get("Porsche"));
    }

    @Test
    public void assertSameTest() {
        Car expected = cars.get(1);
        Car actual = carShop.get("BMW");

        assertSame(expected, actual);
    }

    @Test
    public void assertFailTest() {
        try {
            carShop.get(-1);
            fail("Exception not thrown");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("There is no element with index -1", e.getMessage());
        }
    }

    @Test
    public void assertThat_hasItemsTest() {
        Car expected = cars.get(0);
        List<Car> actual = carShop.get();

        assertThat(actual, hasItems(expected));
    }

    @Test
    public void assertThat_notTest() {
        String actual = carShop.get(0).getBrand();
        String expected = cars.get(1).getBrand();

        assertThat(actual, not(expected));
    }

    @Test
    public void assertThat_sameInstanceTest() {
        assertThat(carShop.get(0), instanceOf(Car.class));
    }
}