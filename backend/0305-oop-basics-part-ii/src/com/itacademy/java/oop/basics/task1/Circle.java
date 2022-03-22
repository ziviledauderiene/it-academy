package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private final double radius;

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                " Area=" + calculateArea() +
                " Perimeter=" + calculatePerimeter() +
                " }";
    }
}
