package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {


    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public List<Car> addCar(@RequestBody Car car) {
        return this.carService.addCarInService(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return this.carService.getCars();
    }


    @PostMapping("/delete")
    public List<Car> deleteCar(@RequestParam String id) {

//        for (Car car: carService.getCars()) {
//            if(car.getId().equals(id)){
//                carService.deleteCar(car);
//                break;
//            }
//        }
        List<Car> carsToDelete = new ArrayList<>();
        for (Car car : carService.getCars()) {
            if (car.getId().equals(id)) {
                carsToDelete.add(car);
            }
        }
        this.carService.getCars().removeAll(carsToDelete);


        //this.carService.getCars().removeIf(car -> car.getId().equals(id));
        return carService.getCars();
    }


}
