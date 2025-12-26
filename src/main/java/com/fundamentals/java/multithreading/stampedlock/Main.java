package com.fundamentals.java.multithreading.stampedlock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread th1 = new Thread(() -> {
            sharedResource.producer();
        });
        Thread th2 = new Thread(() -> {
            sharedResource.producer();
        });
        Thread th3 = new Thread(() -> {
            sharedResource.consume();
        });
        th1.start();
        th2.start();
        th3.start();
    }
}
