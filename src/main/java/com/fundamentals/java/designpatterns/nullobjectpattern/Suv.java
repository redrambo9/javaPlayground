package com.fundamentals.java.designpatterns.nullobjectpattern;

public class Suv implements Vehicle {
    private static final String suvSeatingCapacity = "7";

    @Override
    public String getVehicleCapacity() {
        return suvSeatingCapacity;
    }
}
