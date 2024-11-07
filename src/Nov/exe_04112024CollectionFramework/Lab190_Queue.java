package Nov.exe_04112024CollectionFramework;

import java.util.PriorityQueue;

public class Lab190_Queue {
    public static void main(String[] args) {

        // Added interface in Java 5
        // It is based on the fifo principle
        // PriorityQueue is one of the commonly used subclasses of queue interface
        // Priority queue doesnot allow null values

        PriorityQueue pq = new PriorityQueue();
        pq.offer("1"); // here offer is used incase of add
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek()); // means to see first element
        System.out.println(pq.poll()); // means to delete first element
    }
}
