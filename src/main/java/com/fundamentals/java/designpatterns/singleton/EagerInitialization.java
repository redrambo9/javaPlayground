package com.fundamentals.java.designpatterns.singleton;

//Eager Initialization
//the object will be created while the class is being loaded, i.e. early initialization
public class EagerInitialization {
    private static EagerInitialization eagerInitialization = new EagerInitialization();

    //no once can call constructor/create obj outside this class
    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }
}
//Client side code
// EagerInitialization eagerInitialization = EagerInitialization.getInstance();
