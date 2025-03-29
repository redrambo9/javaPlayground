package com.fundamentals.java.designpatterns.abstractfactorypattern.factories;

import com.fundamentals.java.designpatterns.abstractfactorypattern.VehicleType;

public class SuvFactory implements VehicleType {
    @Override
    public String vehicleType() {
        return "SUV...";
    }
}
