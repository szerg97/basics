package com.generics.model;

public class Rectangle extends Angular{

    protected final Double a;
    protected final Double b;

    public Rectangle(Double a, Double b, ShapeColor color) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.numberOfAngles = 4;
    }

    public Double getArea() {
        return a * b;
    }

    public Double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", numberOfAngles=" + numberOfAngles +
                '}';
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }
}
