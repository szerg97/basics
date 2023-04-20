package com.szalai.dp.structural.adapter;

public class RoundPeg implements Round{

    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
