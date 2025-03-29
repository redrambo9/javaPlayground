package com.fundamentals.java.designpatterns.visitorpattern;
//RoomMaintenance is one operation
public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Maintenance going on for Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintenance going on for Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Maintenance going on for Deluxe Room");
    }
}
