package com.generics;

import com.generics.model.Rectangle;
import com.generics.model.ShapeColor;
import com.generics.model.Square;
import com.generics.service.ShapeCalculator;
import com.generics.service.Calculator;
import com.generics.service.ShapeGenerator;

import java.util.List;

public class GenericsApplication {

    private static final Calculator calculator = ShapeCalculator.getInstance();
    private static final ShapeGenerator generator = ShapeGenerator.getInstance();
    private static final String DISPLAY_LIST = "=== LIST ===";

    public static void main(String[] args) {
        generator.generate();
        displayList(generator.getShapes());

        List<Rectangle> rectangles = generator.getRectangles();
        Double sumPerimeterForRectangles = calculator.calculateSumPerimeter(rectangles);
        displayDouble("Sum of rectangles sides", sumPerimeterForRectangles);

        Double sumArea = calculator.calculateSumArea(generator.getShapes());
        Double sumPerimeter = calculator.calculateSumPerimeter(generator.getShapes());
        displayDouble("Sum of all area", sumArea);
        displayDouble("Sum of all perimeter", sumPerimeter);

        Double sumColorArea = calculator.calculateSumArea(generator.getShapes(), ShapeColor.WHITE);
        Double sumColorPerimeter = calculator.calculateSumPerimeter(generator.getShapes(), ShapeColor.RED);
        displayDouble("Sum of colored area", sumColorArea);
        displayDouble("Sum of colored perimeter", sumColorPerimeter);
    }

    private static <T> void displayList(List<?> list){
        System.out.println(DISPLAY_LIST);
        list.forEach(System.out::println);
        System.out.println();
    }

    private static void displayDouble(String msg, Double value){
        System.out.printf("%s: %s%n", msg, value);
    }
}
