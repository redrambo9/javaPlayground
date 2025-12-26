package com.fundamentals.java.multithreading.semaphorelock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    boolean isAvailable = false;
    Semaphore semaphore = new Semaphore(2);

    public void producer() {
        try {
            semaphore.acquire();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {

        } finally {
            semaphore.release();
            System.out.println("Lock Released by:" + Thread.currentThread().getName());
        }
    }
}
