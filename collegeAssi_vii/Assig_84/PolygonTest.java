import java.util.Scanner;

interface Polygon {
    double area();
    double perimeter();
}

class Rectangle implements Polygon {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Square implements Polygon {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

public class PolygonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Shape (1-Rectangle, 2-Square): ");
        int choice = sc.nextInt();

        Polygon shape;
        if (choice == 1) {
            System.out.print("Enter length and width: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        } else {
            System.out.print("Enter side: ");
            double side = sc.nextDouble();
            shape = new Square(side);
        }

        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
