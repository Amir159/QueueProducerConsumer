package com.syncretis;

import java.util.Queue;

public class Consumer extends Thread {
    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myQueue.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
