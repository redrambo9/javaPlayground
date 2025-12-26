package com.fundamentals.java.multithreading.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Thread th1 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        });

        Thread th2 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        });
        Thread th3 = new Thread(() -> {
            sharedResource.consume(readWriteLock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
