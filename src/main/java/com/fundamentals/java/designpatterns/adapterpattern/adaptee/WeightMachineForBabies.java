package com.fundamentals.java.designpatterns.adapterpattern.adaptee;

import com.fundamentals.java.designpatterns.adapterpattern.adaptee.WeightMachine;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        return 34;
    }
}
