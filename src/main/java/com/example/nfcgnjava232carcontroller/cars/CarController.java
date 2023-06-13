package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.web.bind.annotation.*;

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
}
