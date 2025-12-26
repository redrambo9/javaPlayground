package com.fundamentals.java.designpatterns.bridgepattern;

public class Dog extends LivingThings {
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        //Breathe Through NOSE
        //Inhales O2 from Air
        //Exhale Co2
        breatheImplementor.breathe();
        System.out.println("Dog Breathing");
    }
}
