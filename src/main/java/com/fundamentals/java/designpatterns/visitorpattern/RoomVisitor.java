package com.fundamentals.java.designpatterns.visitorpattern;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoom);

    public void visit(DoubleRoom doubleRoom);

    public void visit(DeluxeRoom deluxeRoom);
}
