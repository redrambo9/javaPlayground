package com.fundamentals.java.designpatterns.builderpattern;

import com.fundamentals.java.designpatterns.builderpattern.implementation.LoggerBuilder;
import com.fundamentals.java.designpatterns.builderpattern.interfaces.Logger;

import java.nio.file.Path;
import java.nio.file.Paths;

//Builder is used to create complex object in smaller steps
public class Main {

    static final String LOG_FILE = "LogFile";
    static final String CURRENT_WORKING_DIR = System.getProperty("user.dir");

    public static void main(String[] args) {
//        Logger logger = new LoggerBuilder()
//                .withConsoleAppender()
//                .build();
//
//        logger.i("Hello from personal Logger");


        Logger logger1 = new LoggerBuilder()
                .withFileAppender(Paths.get(CURRENT_WORKING_DIR), LOG_FILE)
                .withConsoleAppender()
                .build();
        logger1.i("Hello from Personal Logger");
    }
}