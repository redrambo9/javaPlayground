package com.fundamentals.java.lesserknownfeatures;

//An instance initializer is a code block that is executed when an instance of a class is created.
// It runs every time a constructor is called, even before the constructor code.
// They’re useful when you have multiple constructors and want to share
// some logic between them without calling a separate method.
public class InstanceInitializer {
    static {
        System.out.println("Instance Initializer Block");
    }

    InstanceInitializer() {
        System.out.println("Constructor called");
    }
}
