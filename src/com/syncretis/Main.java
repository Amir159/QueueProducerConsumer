package com.syncretis;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        final int maxQueueLength = 10;

        Producer producer = new Producer(maxQueueLength, queue);
        Consumer consumer = new Consumer(maxQueueLength, queue);

        producer.start();
        consumer.start();

    }
}
