package com.fundamentals.java.designpatterns.singleton;

public class Client {
    //Usage of enum singleton
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setValue(4);
        System.out.println(enumSingleton.getValue());
    }
}
