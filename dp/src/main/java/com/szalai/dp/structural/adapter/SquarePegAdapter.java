package com.szalai.dp.structural.adapter;

public class SquarePegAdapter implements Round{

    private final Square square;

    public SquarePegAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double getRadius() {
        return square.getWidth() * Math.sqrt(2) / 2;
    }
}
