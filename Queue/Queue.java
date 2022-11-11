package com.mycompany.queue;

public class Queue {

    public static void main(String[] args) {
        ADTQueue<Integer> queue = new ADTQueue();
        queue.enqueue(5);
        queue.transversal();
        queue.enqueue(6);
        queue.transversal();
        queue.dequeue();
        queue.transversal();
        queue.enqueue(4);
        queue.enqueue(33);
        queue.enqueue(12);
        queue.transversal();
        queue.dequeue();
        queue.transversal();
        queue.dequeue();
        queue.transversal();
        queue.dequeue();
        queue.transversal();
        queue.dequeue();
    }
}
