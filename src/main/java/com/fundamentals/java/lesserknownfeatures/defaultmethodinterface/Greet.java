package com.fundamentals.java.lesserknownfeatures.defaultmethodinterface;

//Introduced in Java 8, this allows interfaces to provide a default implementation for methods,
// enabling API evolution. That is, developers can add new methods to interfaces
// with a default implementation without breaking existing implementations.
public interface Greet {

    //see I added default greetings
    //tomorrow if someone do not know the hello in French developer
    // can use default greetings without breaking implementation
    default void defaultGreeting() {
        System.out.println("Hello And Welcome");
    }

    void localLanguageGreetings();
}
