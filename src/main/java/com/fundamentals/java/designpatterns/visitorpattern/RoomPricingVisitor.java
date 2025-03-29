package com.fundamentals.java.designpatterns.visitorpattern;

//Room pricing is one operation
public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Price Computation for Single Room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Price Computation for Double Room");
        doubleRoom.roomPrice = 3000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Price Computation for Deluxe Room");
        deluxeRoom.roomPrice = 5000;
    }
}
