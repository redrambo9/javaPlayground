package com.producer.consumer.problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.bufferSize = bufferSize;
        this.sharedBuffer = new LinkedList<>();
    }

    public synchronized void produce(int item) throws Exception {
        //if buffer is full, wait for consumer to consume item
        //here we are not using if condition to avoid spurious wakeup
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("Buffer is Full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced " + item);
        //notify the consumer that there are items to consume now
        notify();
    }

    public synchronized int consume() throws Exception {
        //buffer is empty, wait for producer to produce items
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is Empty, Consumer is waiting for Producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed " + item);
        notify();
        return item;
    }
}
