package com.fundamentals.java.designpatterns.builderpattern.implementation;

import com.fundamentals.java.designpatterns.builderpattern.interfaces.Appender;

public class ConsoleAppender implements Appender {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
