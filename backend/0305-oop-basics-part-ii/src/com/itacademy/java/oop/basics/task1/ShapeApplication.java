package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {

        Shape circle = new Circle(1);
        Shape square = new Square(2);

        System.out.println(circle.toString());
        System.out.println(square.toString());
    }
}
