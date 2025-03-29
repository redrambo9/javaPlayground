package com.fundamentals.java.designpatterns.adapterpattern.client;

import com.fundamentals.java.designpatterns.adapterpattern.adaptee.WeightMachineForBabies;
import com.fundamentals.java.designpatterns.adapterpattern.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapterImpl weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
