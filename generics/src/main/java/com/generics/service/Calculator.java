package com.generics.service;

import com.generics.model.Shape;
import com.generics.model.ShapeColor;

import java.util.List;

public interface Calculator{

    <T extends Shape> Double calculateSumArea(List<T> list);
    <T extends Shape> Double calculateSumArea(List<T> list, ShapeColor color);
    <T extends Shape> Double calculateSumPerimeter(List<T> list);
    <T extends Shape> Double calculateSumPerimeter(List<T> list, ShapeColor color);

}
