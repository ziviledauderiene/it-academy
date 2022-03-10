package basics.task3;

public class ShapeApplication {
    public static void main(String[] args) {
        Square rectangle1 = new Square(10, 20);
        Square rectangle2 = new Square(-1, 2);
        Square rectangle3 = new Square(5, 5);
        Square rectangle4 = new Square(3, 15);

        Square[] shapes = {rectangle1, rectangle2, rectangle3, rectangle4};

        for (Square shape : shapes) {
            if (shape.getLength() > 0 && shape.getWidth() > 0) {
                shape.print(shape);
            } else if (shape.getLength() < 0) {
                System.out.println("l= " + shape.getLength() + ". Length can't have negative value.\n");
            } else if (shape.getWidth() < 0) {
                System.out.println("w= " + shape.getWidth() + ". Width can't have negative value.\n");
            }
        }
    }
}
