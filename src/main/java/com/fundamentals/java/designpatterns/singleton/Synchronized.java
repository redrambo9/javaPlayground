package com.fundamentals.java.designpatterns.singleton;

public class Synchronized {

    private static Synchronized synchronizedMethod;

    private Synchronized() {

    }

    // synchronized put a lock so only one thread will go at a time
    synchronized public static Synchronized getInstance() {
        if (synchronizedMethod == null) {
            synchronizedMethod = new Synchronized();
        }
        return synchronizedMethod;
    }
    //problem with this approach is if there are 100000 threads
    //then you have to put and release lock for every thread and locking is very expensive
    //Double locking solve this problem
}
