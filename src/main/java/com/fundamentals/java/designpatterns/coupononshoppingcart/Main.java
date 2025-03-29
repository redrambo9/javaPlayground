package com.fundamentals.java.designpatterns.coupononshoppingcart;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONIC);
        Product item2 = new Item2("SOFA", 2000, ProductType.FURNITURE);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println(cart.getTotalPrice());
    }
}
