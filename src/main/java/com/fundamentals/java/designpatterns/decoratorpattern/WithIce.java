package com.fundamentals.java.designpatterns.decoratorpattern;

public class WithIce extends TeaDecorator {
    public WithIce(Tea decoratorTea) {
        super(decoratorTea);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.2;
    }
    @Override
    public String getContents() {
        return super.getContents() + "WithIce";
    }
}
