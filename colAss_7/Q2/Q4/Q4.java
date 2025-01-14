package colAss_7.Q2.Q4;

public class Q4 {
    public static void main(String[] args) {
        polygon rect=new rectangle(4, 5);
        polygon sqr=new SquarePolygon(4);
        System.out.println("Rectangle Area:"+rect.area()+"perimeter"+rect.perimeter());
    }
}
