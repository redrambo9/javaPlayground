package com.fundamentals.java.designpatterns.facadedesignpattern;

public class VegAndNonVegMenu implements Menu{
    @Override
    public String getFood() {
        return "VegAndNonVeg";
    }
}
