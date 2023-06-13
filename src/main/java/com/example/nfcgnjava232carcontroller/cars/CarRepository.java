package com.example.nfcgnjava232carcontroller.cars;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public List<Car> addCar(Car car) {
        this.cars.add(car);
        return this.cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
