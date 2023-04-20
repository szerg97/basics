package com.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class LspApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car motorCar = new MotorCar();
        Car electricCar = new ElectricCar();

        cars.add(motorCar);
        cars.add(electricCar);

        cars.forEach(car -> {
            car.turnOnEngine();
            car.accelerate();
        });
    }
}
