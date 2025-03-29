package com.fundamentals.java.designpatterns.decoratorpattern;

public class NormalTea implements Tea {
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getContents() {
        return "Tea";
    }
}
