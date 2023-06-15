package com.example.nfcgnjava232carcontroller.cars;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Data
public class Car {

    private String id;
    private  String brand;
    private  int numberOfTires;
    private  boolean hasMot;



    public Car(String brand, int numberOfTires, boolean hasMot) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString().substring(0,4);

        this.brand = brand;
        this.numberOfTires = numberOfTires;
        this.hasMot = hasMot;
    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public int getNumberOfTires() {
//        return numberOfTires;
//    }
//
//    public boolean isHasMot() {
//        return hasMot;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setNumberOfTires(int numberOfTires) {
//        this.numberOfTires = numberOfTires;
//    }
//
//    public void setHasMot(boolean hasMot) {
//        this.hasMot = hasMot;
//    }
}
