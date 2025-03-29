package com.fundamentals.java.designpatterns.chainofresponsibility;



public class Client {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(null));

        logger.log(LogProcessor.INFO,"Info Message");
        logger.log(LogProcessor.ERROR, "Error Message");
        logger.log(LogProcessor.DEBUG, "Debug Message");
    }
}
