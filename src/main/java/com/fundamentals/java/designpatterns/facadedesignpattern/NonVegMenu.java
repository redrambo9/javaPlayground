package com.fundamentals.java.designpatterns.facadedesignpattern;

public class NonVegMenu implements Menu {
    @Override
    public String getFood() {
        return "NonVeg";
    }
}
