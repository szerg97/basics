package com.anonymous;

public class AnonymousApplication {

    public static void main(String[] args) {

        Cat cat = new Cat("Cirmi");
        cat.makeSound();

        Animal bigfoot = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Bigfoot goes Graaaaaaa...");
            }
        };
        bigfoot.makeSound();

        Animal ravenBear = () -> System.out.println("The raven bear just does not exist lol...");
        ravenBear.makeSound();
    }
}
