package com.syncretis;

import java.util.Queue;

public class MyQueue {
    private final int maxQueueLength;
    private Queue<Integer> queue;

    public MyQueue(int maxQueueLength, Queue<Integer> queue) {
        this.maxQueueLength = maxQueueLength;
        this.queue = queue;
    }

    public synchronized void put() throws InterruptedException {
        if (queue.size() < maxQueueLength) {
            queue.add(1);
        } else {
            System.out.println("Can't add!");
            notify();
            wait();
        }
        System.out.println("Current size = " + queue.size());
    }

    public synchronized void get() throws InterruptedException {

        if (!queue.isEmpty()) {
            queue.poll();
        } else {
            System.out.println("Can't poll!");
            notify();
            wait();
        }
        System.out.println("Current size = " + queue.size());
    }
}
