package com.fundamentals.java.multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock reentrantLock) throws InterruptedException {
        try {
            reentrantLock.lock();
            long now = System.nanoTime();
            System.out.println(now + " - Lock Acquired By: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {

        } finally {
            System.out.println(System.nanoTime() + " - About to release: " + Thread.currentThread().getName());
            reentrantLock.unlock();
            System.out.println(System.nanoTime() + " - Lock Released By: " + Thread.currentThread().getName());
        }
    }
}
