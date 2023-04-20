package com.generics.service;

import com.generics.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeGenerator {

    private static ShapeGenerator instance;
    private final List<Shape> shapes = new ArrayList<>();

    public void generate(){
        System.out.println("Generating shapes...");
        generateSquares();
        generateRectangles();
        generateCircles();
        generateEllipses();
    }

    private void generateSquares(){
        for (int i = 0; i < 23; i++) {
            shapes.add(new Square(new Random().nextDouble(5, 25), ShapeColor.RED));
        }
    }

    private void generateRectangles(){
        for (int i = 0; i < 9; i++) {
            shapes.add(new Rectangle(
                    new Random().nextDouble(5, 25),
                    new Random().nextDouble(5, 25),
                    ShapeColor.GREEN
                    ));
        }
    }

    private void generateCircles(){
        for (int i = 0; i < 15; i++) {
            shapes.add(new Circle(new Random().nextDouble(5, 25), ShapeColor.BLUE));
        }
    }

    private void generateEllipses(){
        for (int i = 0; i < 18; i++) {
            shapes.add(new Ellipse(new Random().nextDouble(5, 25), ShapeColor.WHITE));
        }
    }

    public List<Shape> getShapes(){
        return shapes;
    }

    public List<Rectangle> getRectangles(){
        List<Rectangle> rectangles = new ArrayList<>();
        shapes.forEach(s -> {
            if (s instanceof Rectangle){
                rectangles.add((Rectangle) s);
            }
        });
        return rectangles;
    }

    public static ShapeGenerator getInstance(){
        if (instance == null){
            return new ShapeGenerator();
        }
        return instance;
    }
}
