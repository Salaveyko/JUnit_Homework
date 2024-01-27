package com.itvdn.junit.labs.ex_003;

import java.util.ArrayList;
import java.util.List;

/**
 * Inspect the Assertions and its methods. Cover CarShop.class with thees methods.
 * Read about Hamcrest. Use a couple of its methods.
 */
public class CarShop {
    private List<Car> cars;

    public CarShop() {
        cars = new ArrayList<>();
    }

    public CarShop(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> get() {
        return cars;
    }

    public Car get(String brand) {
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                return car;
            }
        }
        return null;
    }

    public Car get(int index) {
        try {
            return cars.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("There is no element with index " + index);
        }
    }

    public boolean isEmpty() {
        return cars.isEmpty();
    }

    public boolean hasBrand(String brand) {
        for (var c : cars) {
            if (c.getBrand().equals(brand)) return true;
        }
        return false;
    }

    public void clearAll() {
        cars.clear();
    }
}
