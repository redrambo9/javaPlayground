package com.fundamentals.java.designpatterns.strategypattern;

public class FastStrategy implements Strategy{

    @Override
    public void accelerate(){
        System.out.println("Fast Acceleration");
    }
    @Override
    public void brake(){
        System.out.println("Fast Brake");
    }
}
