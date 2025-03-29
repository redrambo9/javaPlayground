package com.fundamentals.java.designpatterns.strategypattern;
//Strategy design pattern is a behavioral pattern that allows you to
// define a family of interchangeable algorithms and encapsulate them within separate classes.
// This pattern enables the algorithms to vary independently from clients that use them,
// promoting flexibility and easy maintenance.
public class RunStrategyPattern {
    public static void main(String[] args) {
        Car car = new Car(new FastStrategy());
        car.accelerate();
        car.brake();

        car.setStrategy(new SlowStrategy());
        car.accelerate();
        car.brake();
    }
}
