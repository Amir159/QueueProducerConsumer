package com.syncretis;

import java.util.Queue;

public class Producer extends Thread {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myQueue.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}