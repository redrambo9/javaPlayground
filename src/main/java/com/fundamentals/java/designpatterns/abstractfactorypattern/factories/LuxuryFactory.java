package com.fundamentals.java.designpatterns.abstractfactorypattern.factories;

import com.fundamentals.java.designpatterns.abstractfactorypattern.VehicleType;

public class LuxuryFactory implements VehicleType {
    @Override
    public String vehicleType() {
        return "Luxury...";
    }
}
