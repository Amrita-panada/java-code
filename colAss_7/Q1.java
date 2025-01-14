abstract class shape{
    abstract double calculateArea();
}
class Square extends shape{
    double side;
    Square(double side){
        this.side=side;
    }
    double calculateArea(){
        return side*side;
    }
}

class tringle extends shape{
    double base;
    double height;
    tringle(double base,double height){
        this.base=base;
        this.height=height;
    }
    double calculateArea(){
        return 0.5*base*height;
    }
}

class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return 3.14*radius*radius;
    }
}

public class Q1 {
    public static void main(String[] args) {
        shape s1=new Square(5);
        shape s2=new tringle(5,10);
        shape s3=new circle(5);
        System.out.println("Area of Square: "+s1.calculateArea());
        System.out.println("Area of Tringle: "+s2.calculateArea());
        System.out.println("Area of Circle: "+s3.calculateArea());
    }
}