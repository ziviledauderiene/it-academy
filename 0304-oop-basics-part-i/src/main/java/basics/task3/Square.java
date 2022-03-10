package basics.task3;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    public double calculateArea() {
        return length * width;
    }

    public void print(Square shape) {
        System.out.println("l: " + shape.getLength() + ", w: " + shape.getWidth());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("");
    }
}
