package com.szalai.dp.structural.adapter;

public class SquarePeg implements Square{
    private final double width;

    SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
