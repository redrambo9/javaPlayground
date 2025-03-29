package com.fundamentals.java.designpatterns.factorypattern;

public class RunFactoryPattern {

    public static void main(String args[]) {

        ShapeFactory shapeFactory =new ShapeFactory();

        shapeFactory.getCircle().draw();

    }
}
