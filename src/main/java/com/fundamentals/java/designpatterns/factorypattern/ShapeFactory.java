package com.fundamentals.java.designpatterns.factorypattern;
//used when obj is created conditionally
// It is used when all the object creation and its business logic is required at one place
// see in getSquare, getCircle you have your logic how you want to create the object
// if tomorrow you want to change the logic of object creation you have to change the logic only here
class ShapeFactory {

    public ShapeFactory() {
    }

    public Square getSquare() {
        return new Square();
    }

    public Circle getCircle() {
        return new Circle();
    }

    public Rectangle getRectangle() {
        return new Rectangle();
    }
}
