package com.fundamentals.java.designpatterns.builderpattern.implementation;

import com.fundamentals.java.designpatterns.builderpattern.interfaces.Appender;
import com.fundamentals.java.designpatterns.builderpattern.interfaces.Logger;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LoggerBuilder {
    private List<Appender> appenders = new ArrayList<>();

    public LoggerBuilder withConsoleAppender() {
        appenders.add(AppenderFactory.getConsoleAppender());
        return this;
    }

    public LoggerBuilder withFileAppender(Path path, String fileName) {
        appenders.add(AppenderFactory.getFileAppender(path, fileName));
        return this;
    }

    public Logger build() {
        // if you do like this new LoggerImpl(appenders)
        // you are passing reference of appenderList
        // hence changes done by resetBuilderData will also be reflected
        // by doing new LoggerImpl(new ArrayList<>(appenders))
        // we are creating a copy then sending it  to constructor
        Logger logger = new LoggerImpl(new ArrayList<>(appenders));
        resetBuilderData();
        return logger;
    }

    private void resetBuilderData() {
        appenders.clear();
    }
}
