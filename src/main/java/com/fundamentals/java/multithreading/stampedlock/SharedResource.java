package com.fundamentals.java.multithreading.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock stampedLock = new StampedLock();

    public void producer() {
        long stamp = stampedLock.readLock();
        try {
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception e) {

        } finally {
            stampedLock.unlockRead(stamp);
            System.out.println("Read Lock Released by: " + Thread.currentThread().getName());
        }
    }

    public void consume(){
        long stamp = stampedLock.writeLock();
        try {
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception e) {

        } finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Read Lock Released by: " + Thread.currentThread().getName());
        }
    }
}
