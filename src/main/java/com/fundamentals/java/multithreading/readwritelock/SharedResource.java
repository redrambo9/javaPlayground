package com.fundamentals.java.multithreading.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReadWriteLock readWriteLock) {
        try {
            readWriteLock.readLock().lock();
            System.out.println("Read Lock  Acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(8000);
        } catch (Exception e) {

        } finally {
            readWriteLock.readLock().unlock();
            System.out.println("Read Lock released by:" + Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock readWriteLock) {
        try {
            readWriteLock.writeLock().lock();
            System.out.println("Write Lock  Acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(8000);
        } catch (Exception e) {

        } finally {
            readWriteLock.writeLock().unlock();
            System.out.println("Write Lock released by:" + Thread.currentThread().getName());
        }
    }
}
