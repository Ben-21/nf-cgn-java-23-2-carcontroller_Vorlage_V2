package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {

    private CarRepository carRepository;



    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> addCar(Car car) {
        return this.carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return this.carRepository.getCars();
    }
}
