package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarRepository {

    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public List<Car> addCarInRepo(Car car) {
        this.cars.add(car);
        return this.cars;
    }

    public List<Car> deleteCar(Car car){
        this.cars.remove(car);
        return this.cars;
    }



    public List<Car> getCars() {
        return this.cars;
    }
}
