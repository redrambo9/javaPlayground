package com.fundamentals.java.designpatterns.singleton;

//Lazy Initialization
//Instance is created on demand
public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (lazyInitialization == null) {
            return new LazyInitialization();
        }
        return lazyInitialization;
    }
}
//problem with this is when 2 or more threads will try to getInstance
// then both the threads will find the object as null and create multiple objects
// which will violate our singleton purpose