package mzaenalmustopa.javacollections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.offerLast("Topa");
        deque.offerLast("Zaenal");
        deque.offerLast("Muhamad");

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Muhamad");
        queue.offerLast("Zaenal");
        queue.offerLast("Mustopa");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
