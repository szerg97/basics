package com.generics.model;

public class Ellipse extends Circular{

    public Ellipse(Double r, ShapeColor color) {
        super(r, color);
    }

    public Double getArea() {
        return r * r * Math.PI;
    }

    public Double getPerimeter() {
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "r=" + r +
                '}';
    }
}
