package com.fundamentals.java.designpatterns.bridgepattern;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        //Breathe Through Leaves
        //Inhales Co2
        //Exhale oxygen through Photosynthesis
        breatheImplementor.breathe();
        System.out.println("Tree Breathing");
    }
}
