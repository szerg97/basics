package com.solid.liskov;

public class ElectricCar implements Car{

    @Override
    public void turnOnEngine() {
        System.out.println("I've got no engine :(");
    }

    @Override
    public void accelerate() {
        System.out.println("SWOOOOOSH");
    }
}
