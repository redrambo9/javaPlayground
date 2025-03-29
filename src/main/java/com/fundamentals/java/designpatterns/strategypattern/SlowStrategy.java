package com.fundamentals.java.designpatterns.strategypattern;

public class SlowStrategy implements Strategy{
    @Override
    public void accelerate() {
        System.out.println("Slow Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Slow Brake");
    }
}
