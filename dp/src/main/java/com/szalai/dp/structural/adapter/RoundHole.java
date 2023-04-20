package com.szalai.dp.structural.adapter;

public class RoundHole implements Round{

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    };

    public boolean fits(Round peg){
        System.out.printf("Analyzing %s with radius %s -> ", peg.getClass().getSimpleName(), peg.getRadius());
        return getRadius() >= peg.getRadius();
    }
}
