package com.fundamentals.java.designpatterns.nullobjectpattern;

// A null object returns NULL return type
//No need to put if check for checking null
//Null object reflects do nothing or default behavior
public class RunNullObjectPattern {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("suv");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println(vehicle.getVehicleCapacity());
    }
}
