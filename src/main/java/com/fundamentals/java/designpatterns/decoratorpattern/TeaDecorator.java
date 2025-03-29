package com.fundamentals.java.designpatterns.decoratorpattern;

/**
 *  Wrapper class
 */
public abstract class TeaDecorator implements Tea{

    private final Tea decoratorTea;

    public TeaDecorator(Tea decoratorTea){
        this.decoratorTea = decoratorTea;
    }

    @Override
    public double getPrice() {
        return decoratorTea.getPrice();
    }
    @Override
    public String getContents() {
        return decoratorTea.getContents();
    }
}
