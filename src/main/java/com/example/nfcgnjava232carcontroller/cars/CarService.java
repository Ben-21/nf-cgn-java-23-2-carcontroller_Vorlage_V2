package com.example.nfcgnjava232carcontroller.cars;

import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService() {
        this.carRepository = new CarRepository();
    }

    public List<Car> addCar(Car car) {
        return this.carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return this.carRepository.getCars();
    }
}
