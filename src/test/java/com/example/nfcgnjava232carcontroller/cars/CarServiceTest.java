package com.example.nfcgnjava232carcontroller.cars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarServiceTest {

    CarRepository carRepository = mock(CarRepository.class);
    CarService carService = new CarService(carRepository);
    @Test
    void addCar_thenReturnListWithOneCar() {
        //Given
        Car theCar = new Car("BMW",4,true);
        List<Car> expectedCars = new ArrayList<>(List.of(theCar));

        //When
        when(carRepository.getCars()).thenReturn(expectedCars);
        List<Car> actual = carService.addCarInService(theCar);

        //Then
        assertEquals(expectedCars,actual);
        verify(carRepository).addCarInRepo(any());
    }

    @Test
    void getCars_thenReturnEmptyCarList() {

        //Given
        List<Car> expectedList = new ArrayList<>();

        //When
        when(carRepository.getCars()).thenReturn(expectedList);
        List<Car> actual = carService.getCars();

        //Then
        assertEquals(expectedList, actual);
        verify(carRepository).getCars();

    }
}