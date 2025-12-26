package com.fundamentals.java.multithreading.producerconsumer;

public class ProducerConsumer {
    public static void main(String[] args) {

        SharedResource sharedBuffer = new SharedResource(3);
        //producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    sharedBuffer.produce(i);
                }
            } catch (Exception e) {

            }
        });

        //consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    sharedBuffer.consume();
                }
            } catch (Exception e) {

            }
        });

        //start the threads
        producerThread.start();
        consumerThread.start();
    }


}
