package com.producer.consumer.problem;

public class JoinThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread1 Calling some method");
        });
        t1.start();
        //observe diff output at console by uncommenting below code
//        try {
//            t1.join();
//        } catch (Exception e) {
//
//        }
        System.out.println("Main Thread finishing it's work");
    }
}
