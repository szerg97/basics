package com.generics.model;

public abstract class Circular extends Shape{

    protected Double r;

    public Circular(Double r, ShapeColor color) {
        this.r = r;
        this.color = color;
    }
}
