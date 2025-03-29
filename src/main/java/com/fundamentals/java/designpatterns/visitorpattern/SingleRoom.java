package com.fundamentals.java.designpatterns.visitorpattern;

public class SingleRoom implements RoomElement {
    public int roomPrice = 0;

    //when accept is invoked single dispatch
    @Override
    public void accept(RoomVisitor visitor) {
        //when visit is invoked double dispatched is invoked
        visitor.visit(this);
    }
}
