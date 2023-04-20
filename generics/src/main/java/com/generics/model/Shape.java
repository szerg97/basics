package com.generics.model;

public abstract class Shape {

    protected ShapeColor color;

    public ShapeColor getColor(){
        return this.color;
    }
    public abstract Double getArea();
    public abstract Double getPerimeter();

}
