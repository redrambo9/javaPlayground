package com.fundamentals.java.lesserknownfeatures.defaultmethodinterface;

public class SpainGreeting implements Greet {
    @Override
    public void localLanguageGreetings() {
        System.out.println("Hola y bienvenido");
    }
    //if you want to override default also you can
    // else while using you can use default implementation
}
