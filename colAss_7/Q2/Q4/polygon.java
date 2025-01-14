package colAss_7.Q2.Q4;

public interface polygon {

    double area();
    double perimeter();

}

public class rectangle implements polygon {

    double l,w;
    rectangle(double L,double w){
        this.w=w;
        this.l=L;
    }
    public double area(){
        return l*w;
    }
    public double perimeter(){
        return 2*(l*w);
    }
}

public class SquarePolygon implements polygon{
    double s;
    SquarePolygon(double s){
        this.s=s;
    }
    public double area(){
        return s*s;
    }
    public double perimeter(){
        return 4*s;
    }
}