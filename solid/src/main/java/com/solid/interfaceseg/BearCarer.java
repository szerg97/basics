package com.solid.interfaceseg;

public record BearCarer(String name) implements BearFeeder, BearWasher {

    @Override
    public void feedBear() {
        System.out.println("Feeds bear...");
    }

    @Override
    public void washBear() {
        System.out.println("Washes bear...");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
