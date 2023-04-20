package com.anonymous;

public class Cat implements Animal{

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " goes Meow...");
    }

    public String getName() {
        return name;
    }
}
