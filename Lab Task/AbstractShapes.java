public class AbstractShapes {

abstract class Shape {
  
    abstract double calculateArea();


    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    double length, width;

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
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s; 

        s = new Rectangle(4, 5);
        s.displayShape();
        System.out.println("Rectangle Area: " + s.calculateArea());

        s = new Circle(3);
        s.displayShape();
        System.out.println("Circle Area: " + s.calculateArea());
    }
}
}
