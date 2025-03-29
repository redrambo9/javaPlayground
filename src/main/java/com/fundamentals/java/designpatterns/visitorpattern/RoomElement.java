package com.fundamentals.java.designpatterns.visitorpattern;

//any object on which you have to add operation
//and you have to take out operation from this object
//that object can be marked as element
public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
