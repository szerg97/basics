package com.basics.datastructures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetService implements Service{

    private final static Set<String> set = new HashSet<>(List.of(
            "John",
            "Adam",
            "David",
            "David",
            "Brian"
    ));

    @Override
    public void test() {
        int size = set.size();
        display(size);
        displaySet();

        boolean b = set.retainAll(List.of(
                "John",
                "Brian"
        ));
        display(b);
        displaySet();
    }

    private static void display(Object o){
        if (o == null){
            throw new IllegalStateException("The element was null");
        }
        System.out.println(o);
    }

    private static void displaySet(){
        if (set.isEmpty()){
            throw new IllegalStateException("Set is empty");
        }
        System.out.println(set);
    }
}
