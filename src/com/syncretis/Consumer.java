package com.syncretis;

import sun.awt.windows.ThemeReader;

import java.util.Queue;

public class Consumer extends Thread {
    final int maxQueueLength;
    Queue<Integer> queue;

    public Consumer(int maxQueueLength, Queue<Integer> queue) {
        this.maxQueueLength = maxQueueLength;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (!queue.isEmpty()) {
                queue.poll();
            } else {
                System.out.println("Can't poll!");
            }
            System.out.println("Current size = " + queue.size());
        }
    }
}
