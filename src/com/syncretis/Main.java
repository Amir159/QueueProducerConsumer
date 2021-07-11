package com.syncretis;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        final int maxQueueLength = 10;
        MyQueue myQueue = new MyQueue(maxQueueLength, queue);

        Producer producer = new Producer(myQueue);
        Consumer consumer = new Consumer(myQueue);

        producer.start();
        consumer.start();

    }
}
