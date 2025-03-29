package com.fundamentals.java.designpatterns.singleton;

public class DoubleLocking {
    private static DoubleLocking doubleLocking;

    private DoubleLocking() {

    }
    public static DoubleLocking getInstance() {
        if (doubleLocking == null) {//check 1
            synchronized (DoubleLocking.class) {
                if (doubleLocking == null) {//check 2
                    doubleLocking = new DoubleLocking();
                }
            }
        }
        return doubleLocking;
    }
    //this double locking also  has issues related to memory
    // every thread has it's own cache and then a common shared memory
    //so each thread will look into it's cache about the null check not in shared memory because sync up
    // of cache memory of each thread did not happen
    //hence we use the word volatile after static while defining the object
    // so thread will not check cache,directly check from memory
    //private static volatile DoubleLocking doubleLocking
}
