package com.fundamentals.java.designpatterns.facadedesignpattern;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
