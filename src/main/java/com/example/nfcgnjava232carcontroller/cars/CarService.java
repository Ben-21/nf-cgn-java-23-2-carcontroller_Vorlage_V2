package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {

    private CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> addCarInService(Car car) {
        if(car.getBrand().equals("BMW")){
            this.carRepository.addCarInRepo(car);
        }
        return this.carRepository.getCars();
    }

    public List<Car> getCars() {
        return this.carRepository.getCars();
    }
}
