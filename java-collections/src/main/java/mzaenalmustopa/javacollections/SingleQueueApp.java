package mzaenalmustopa.javacollections;

import mzaenalmustopa.javacollections.collections.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.offer("Muhamad"));
        System.out.println(queue.offer("Zaenal"));
        System.out.println(queue.offer("Mustopa"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
