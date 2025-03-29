package com.fundamentals.java.designpatterns.facadedesignpattern;

public class VegAndNonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        VegAndNonVegMenu vegAndNonVegMenu = new VegAndNonVegMenu();
        return vegAndNonVegMenu;
    }
}
