package com.fundamentals.java.designpatterns.bridgepattern;

public class Fish extends LivingThings {
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        //Breathe Through GILLS
        //Absorbs O2 from water
        //Release Co2
        breatheImplementor.breathe();
        System.out.println("Fish Breathing");
    }
}
