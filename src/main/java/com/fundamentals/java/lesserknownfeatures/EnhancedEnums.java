package com.fundamentals.java.lesserknownfeatures;

public enum EnhancedEnums {

    //Java Enums are more than mere enumerated values.
    // They are full-fledged classes where you can add attributes, methods, and even implement interfaces.

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6);

    private final double mass;
    private final double radius;

    EnhancedEnums(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public void surfaceGravity() {
        // compute using mass and radius
    }
}
