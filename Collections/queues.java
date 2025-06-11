package Collections;

import java.util.*;

public class queues {
    public static void main(String[] args) {
        // (i) ArrayDeque --> FIFO;

        ArrayDeque<Integer> AD = new ArrayDeque<>();
        AD.offer(2);
        AD.offer(12);
        AD.offer(19);
        System.out.println(AD);
        System.out.println(AD.peek());
        System.out.println(AD.poll()); // Take-out the first enterd element;
        System.out.println(AD);

        System.out.println();

        // (iii) PriorityQueue; --> Min. Heap DS
        // peek gives the smallest element;
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        PQ.offer(1);
        PQ.offer(15);
        PQ.offer(11);
        PQ.offer(14);
        System.out.println(PQ);
        System.out.println(PQ.peek());
        System.out.println(PQ.poll());
        System.out.println(PQ.peek());

        while (PQ.isEmpty() == false) {
            System.out.println(PQ.peek());
            PQ.poll();
        }
    }
}
