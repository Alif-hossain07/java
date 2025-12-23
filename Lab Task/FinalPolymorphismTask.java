public class FinalPolymorphism {
    static class Shape {

    Shape() {}
    Shape(String name) {}

    double area() {
        return 0.0;
    }

    double area(double x) {   
        return x * x;
    }
}

static class Circle extends Shape {
    double r;

    Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

static class Rectangle extends Shape {
    double l, w;

    Rectangle(double l, double w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }

    @Override
    double area() {
        return l * w;
    }
}

public static class Main {
    public static void main(String[] args) {

        Shape s;   

        s = new Circle(5);
        System.out.println("Circle Area: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + s.area());
    }
}

}
