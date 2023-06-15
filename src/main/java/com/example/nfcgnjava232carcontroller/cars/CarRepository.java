package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarRepository {

    private List<Car> cars;
    private CarService carService;

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

    public List<Car> deleteCar(String id){
        List<Car> carsToDelete = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getId().equals(id)) {
                carsToDelete.add(car);
            }
        }
        this.cars.removeAll(carsToDelete);
        //this.carService.getCars().removeIf(car -> car.getId().equals(id));

        return this.cars;
    }



    public List<Car> getCars() {
        return this.cars;
    }
}
