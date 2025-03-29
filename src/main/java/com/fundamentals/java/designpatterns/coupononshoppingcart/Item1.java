package com.fundamentals.java.designpatterns.coupononshoppingcart;

public class Item1 extends Product {

    Item1(String name, double originalPrice, ProductType type) {
        super(name, originalPrice, type);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
