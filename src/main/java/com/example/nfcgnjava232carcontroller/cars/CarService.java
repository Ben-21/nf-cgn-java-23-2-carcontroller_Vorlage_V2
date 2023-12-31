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

            this.carRepository.addCarInRepo(car);

        return this.carRepository.getCars();
    }

    public List<Car> getCars() {
        return this.carRepository.getCars();
    }


    public List<Car> deleteCar(Car car){
        return this.carRepository.deleteCar(car);
    }

    public List<Car> deleteCar(String id){
        return this.carRepository.deleteCar(id);
    }
}
