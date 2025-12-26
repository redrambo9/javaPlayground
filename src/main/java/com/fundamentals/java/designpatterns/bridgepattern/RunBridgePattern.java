package com.fundamentals.java.designpatterns.bridgepattern;

public class RunBridgePattern {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreatheImplementation());
        fish.breatheProcess();
    }
}

