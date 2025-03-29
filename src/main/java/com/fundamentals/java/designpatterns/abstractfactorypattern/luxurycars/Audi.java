package com.fundamentals.java.designpatterns.abstractfactorypattern.luxurycars;

import com.fundamentals.java.designpatterns.abstractfactorypattern.Vehicle;

public class Audi implements Vehicle {
    @Override
    public String vehicleName() {
        return "AUDI...";
    }
}
