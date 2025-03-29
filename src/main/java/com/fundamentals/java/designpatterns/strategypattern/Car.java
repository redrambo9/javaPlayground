package com.fundamentals.java.designpatterns.strategypattern;

public class Car {

    private Strategy strategy;

    // Constructor Injection
    // passing the dependencies of a class through constructor
    public Car(Strategy strategy) {
        this.strategy = strategy;
    }

    public void accelerate() {
        strategy.accelerate();
    }

    public void brake() {
        strategy.brake();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
