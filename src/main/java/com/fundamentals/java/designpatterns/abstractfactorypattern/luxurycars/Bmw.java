package com.fundamentals.java.designpatterns.abstractfactorypattern.luxurycars;

import com.fundamentals.java.designpatterns.abstractfactorypattern.Vehicle;

public class Bmw implements Vehicle {
    @Override
    public String vehicleName() {
        return "BMW...";
    }
}
