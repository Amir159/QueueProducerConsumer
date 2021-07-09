package com.syncretis;

import java.util.Queue;

public class Producer extends Thread {
    final int maxQueueLength;
    Queue<Integer> queue;

    public Producer(int maxQueueLength, Queue<Integer> queue) {
        this.maxQueueLength = maxQueueLength;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (queue.size() < maxQueueLength) {
                queue.add(1);
            } else {
                System.out.println("Can't add!");
            }
            System.out.println("Current size = " + queue.size());
        }
    }
}