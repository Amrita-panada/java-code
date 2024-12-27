package Assig_81;
abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    //@Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Square(4);
        Shape s2 = new Triangle(3, 5);
        Shape s3 = new Circle(7);

        System.out.println("Square Area: " + s1.area());
        System.out.println("Triangle Area: " + s2.area());
        System.out.println("Circle Area: " + s3.area());
    }
}
