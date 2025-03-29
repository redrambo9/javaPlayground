package com.fundamentals.java.lesserknownfeatures.defaultmethodinterface;

public class RunGreetings {

    public static void main(String[] args) {
        NewLanguage newLanguage = new NewLanguage();
        //if we know newlanguage we can call this
        newLanguage.localLanguageGreetings();
        //else
        newLanguage.defaultGreeting();

        //for spain also we can do
        SpainGreeting spainGreeting = new SpainGreeting();
        spainGreeting.localLanguageGreetings();
        //we haven't overridden default in spainGreeting impl so it will ise the default implementation
        spainGreeting.defaultGreeting();
        //This helps us in a way as old interfaces like List were enhanced with new methods without disturbing old codebases.
    }
}
