package com.fundamentals.java.designpatterns.facadedesignpattern;

public class NonVegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}