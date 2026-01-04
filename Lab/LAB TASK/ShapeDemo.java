abstract class Shape {

    
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }
}


class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.1416 * radius * radius;
    }
}


public class ShapeDemo {
    public static void main(String[] args) {

        Shape r = new Rectangle(5, 4);
        r.displayShape();
        System.out.println("Rectangle Area: " + r.calculateArea());

        Shape c = new Circle(3);
        c.displayShape();
        System.out.println("Circle Area: " + c.calculateArea());
    }
}