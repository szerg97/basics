package com.basics.datastructures;

import java.util.List;
import java.util.Stack;

public class StackService implements Service{

    private static final Stack<String> stack = new Stack<>();

    public StackService() {
        stack.addAll(
                List.of(
                        "John",
                        "Adam",
                        "David",
                        "Brian"
                )
        );
    }

    @Override
    public void test() {
        displayStack();

        String steve = stack.push("Steve");
        display(steve);
        displayStack();

        String pop = stack.pop();
        display(pop);
        displayStack();

        String peek = stack.peek();
        display(peek);
        displayStack();

        int david = stack.search("David");
        display(david);
        displayStack();
    }

    private static void display(Object o){
        if (o == null){
            throw new IllegalStateException("The element was null");
        }
        System.out.println(o);
    }

    private static void displayStack(){
        if (stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        System.out.println(stack);
    }
}
