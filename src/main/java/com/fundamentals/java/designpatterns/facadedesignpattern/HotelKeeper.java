package com.fundamentals.java.designpatterns.facadedesignpattern;

public interface HotelKeeper {
    public VegMenu getVegMenu();

    public NonVegMenu getNonVegMenu();

    public VegAndNonVegMenu getVegNonMenu();
}
