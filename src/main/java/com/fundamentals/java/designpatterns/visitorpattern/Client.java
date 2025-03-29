package com.fundamentals.java.designpatterns.visitorpattern;

public class Client {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        //performing operations on the objects
        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoom.accept(pricingVisitorObj);
        System.out.println(((SingleRoom) singleRoom).roomPrice);

        doubleRoom.accept(pricingVisitorObj);
        System.out.println(((DoubleRoom) doubleRoom).roomPrice);

        deluxeRoom.accept(pricingVisitorObj);
        System.out.println(((DeluxeRoom) deluxeRoom).roomPrice);

        //performing another operation
        RoomMaintenanceVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);

        doubleRoom.accept(roomMaintenanceVisitor);

        deluxeRoom.accept(roomMaintenanceVisitor);
    }
}
