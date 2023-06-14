package com.example.nfcgnjava232carcontroller;


import com.example.nfcgnjava232carcontroller.cars.Car;
import com.example.nfcgnjava232carcontroller.cars.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class CarIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    CarService carService;


    @Test
    void expectCar_whenAddedCar() throws Exception {
        //GIVEN


        //WHEN
        mockMvc.perform(
                        MockMvcRequestBuilders.post("/api/cars")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("""
                                        {
                                            "brand": "Audi",
                                            "numberOfTires": 4,
                                            "hasMot": true
                                        }
                                        """)
                )


                //THEN
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].brand").value("Audi"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].numberOfTires").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].hasMot").value(true));
    }


    @Test
    void deleteCar() throws Exception {

        //GIVEN
        carService.addCarInService(new Car("VW", 4, true));
        List<Car> tempCarList = carService.getCars();
        Car carToDelete = tempCarList.get(0);
        String idToDelete = carToDelete.getId();

        //WHEN
        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/cars/delete").param("id", idToDelete)
        );

        //THEN
        Assertions.assertTrue(carService.getCars().isEmpty());
    }


}
