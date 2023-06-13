package com.example.nfcgnjava232carcontroller.cars;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    @PostMapping
    public List<Car> addCar(@RequestBody Car car) {
        return this.carService.addCar(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return this.carService.getCars();
    }
}
