package com.solid.lsp;

public class MotorCar implements Car{

    @Override
    public void turnOnEngine() {
        System.out.println("Turning on engine...");
    }

    @Override
    public void accelerate() {
        System.out.println("BRRRRRRRRRRRR");
    }
}
