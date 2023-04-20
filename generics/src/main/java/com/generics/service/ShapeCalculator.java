package com.generics.service;

import com.generics.model.Shape;
import com.generics.model.ShapeColor;

import java.util.List;

public class ShapeCalculator implements Calculator{

    private static ShapeCalculator instance;

    @Override
    public <T extends Shape> Double calculateSumArea(List<T> list) {
        return list.stream().mapToDouble(Shape::getArea).sum();
    }

    @Override
    public <T extends Shape> Double calculateSumArea(List<T> list, ShapeColor color) {
        return list.stream().filter(s -> s.getColor().equals(color)).mapToDouble(Shape::getArea).sum();
    }

    @Override
    public <T extends Shape> Double calculateSumPerimeter(List<T> list) {
        return list.stream().mapToDouble(Shape::getPerimeter).sum();
    }

    @Override
    public <T extends Shape> Double calculateSumPerimeter(List<T> list, ShapeColor color) {
        return list.stream().filter(s -> s.getColor().equals(color)).mapToDouble(Shape::getPerimeter).sum();
    }

    public static ShapeCalculator getInstance(){
        if (instance == null){
            return new ShapeCalculator();
        }
        return instance;
    }
}
