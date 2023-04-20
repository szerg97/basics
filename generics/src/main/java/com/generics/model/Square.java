package com.generics.model;

public class Square extends Rectangle{

    public Square(Double a, ShapeColor color) {
        super(a, a, color);
        numberOfAngles = 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", numberOfAngles=" + numberOfAngles +
                "} ";
    }
}
