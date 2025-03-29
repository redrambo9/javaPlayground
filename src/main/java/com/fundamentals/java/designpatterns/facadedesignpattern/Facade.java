package com.fundamentals.java.designpatterns.facadedesignpattern;

public class Facade implements HotelKeeper {
    //this is hotelKeeper implementation
    @Override
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenu();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenu();
    }

    @Override
    public VegAndNonVegMenu getVegNonMenu() {
        VegAndNonVegRestaurant vegAndNonVegRestaurant = new VegAndNonVegRestaurant();
        return (VegAndNonVegMenu) vegAndNonVegRestaurant.getMenu();
    }

}
