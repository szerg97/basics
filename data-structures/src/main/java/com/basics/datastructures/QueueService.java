package com.basics.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueService implements Service{

    private static final Queue<String> queue = new LinkedList<>(List.of(
            "John",
            "Adam",
            "David",
            "Brian"
    ));

    @Override
    public void test(){
        displayQueue();

        boolean add = queue.add("Steve");
        display(add);
        displayQueue();

        String poll = queue.poll();
        display(poll);
        displayQueue();

        String peek = queue.peek();
        display(peek);
        displayQueue();
    }

    private static void display(Object o){
        if (o == null){
            throw new IllegalStateException("The element was null");
        }
        System.out.println(o);
    }

    private static void displayQueue(){
        if (queue.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        System.out.println(queue);
    }
}
