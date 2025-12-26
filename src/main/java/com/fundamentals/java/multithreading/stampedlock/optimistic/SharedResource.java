package com.fundamentals.java.multithreading.stampedlock.optimistic;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    int a = 10;
    StampedLock stampedLock = new StampedLock();

    public void producer() {
        long stamp = stampedLock.tryOptimisticRead();
        try {
            System.out.println("Taken Optimistic Read");
            a = 11;
            Thread.sleep(6000);
            if (stampedLock.validate(stamp)) {
                System.out.println("Updated a value Successfully");
            } else {
                System.out.println("Rollback a value");
                a = 10;
            }
        } catch (Exception e) {

        }
    }

    public void consume() {
        long stamp = stampedLock.writeLock();
        System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
        try {
            System.out.println("performing work");
            a = 9;
        } finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Write Lock Released by: " + Thread.currentThread().getName());
        }
    }
}

