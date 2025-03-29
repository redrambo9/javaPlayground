package com.fundamentals.java.designpatterns.nullobjectpattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String vehicleType) {
        if ("Suv".equalsIgnoreCase(vehicleType))
            return new Suv();
        return new NullVehicle();
    }
}
