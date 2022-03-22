package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    private final double side;

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                " Area=" + calculateArea() +
                " Perimeter=" + calculatePerimeter() +
                " }";
    }
}
