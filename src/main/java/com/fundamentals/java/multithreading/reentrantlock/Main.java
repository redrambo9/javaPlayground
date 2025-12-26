package com.fundamentals.java.multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        SharedResource sharedResource1 = new SharedResource();
        Thread thread1 = new Thread(() -> {
            try {
                sharedResource1.producer(reentrantLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        //thread2 is of diff obj sharedResource2
        SharedResource sharedResource2 = new SharedResource();
        Thread thread2 = new Thread(() -> {
            try {
                sharedResource2.producer(reentrantLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        Thread.sleep(50);
        thread2.start();
    }
}
