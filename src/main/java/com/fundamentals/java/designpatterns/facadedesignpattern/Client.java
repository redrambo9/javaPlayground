package com.fundamentals.java.designpatterns.facadedesignpattern;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new Facade();

        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        VegAndNonVegMenu vegAndNonVegMenu = keeper.getVegNonMenu();
        System.out.println(vegMenu.getFood());
        System.out.println(nonVegMenu.getFood());
        System.out.println(vegAndNonVegMenu.getFood());
    }
}
