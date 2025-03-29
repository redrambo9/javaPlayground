package com.fundamentals.java.designpatterns.builderpattern.implementation;

import com.fundamentals.java.designpatterns.builderpattern.interfaces.Appender;
import com.fundamentals.java.designpatterns.builderpattern.interfaces.Logger;

import java.util.List;

public class LoggerImpl implements Logger {

    private final List<Appender> appenders;

    public LoggerImpl(List<Appender> appenders) {
        this.appenders = appenders;
    }

    private void log(String message) {
        for (Appender appender : appenders) {
            appender.log(message);
        }
    }

    @Override
    public void i(String message) {
        this.log(message);
    }

    @Override
    public void e(String message) {
        this.log(message);
    }

    @Override
    public void w(String message) {
        this.log(message);
    }

    @Override
    public void d(String message) {
        this.log(message);
    }

    @Override
    public void t(String message) {
        this.log(message);
    }
}
