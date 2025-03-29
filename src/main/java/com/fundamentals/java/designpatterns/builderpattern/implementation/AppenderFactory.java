package com.fundamentals.java.designpatterns.builderpattern.implementation;

import com.fundamentals.java.designpatterns.builderpattern.interfaces.Appender;

import java.nio.file.Path;

public class AppenderFactory {
    private AppenderFactory() {

    }

    static Appender getConsoleAppender() {
        return new ConsoleAppender();
    }

    static Appender getFileAppender(Path path, String fileName) {
        return new FileAppender(path, fileName);
    }
}
