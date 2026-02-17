//import java.util.*;
public class Emp{
    int id;
    String name;
    double sal;
    public Emp(int id,String name,double sal){
        super();
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public String toString(){
        return "Emp [id="+id+", name="+name+", sal="+sal+"]";
    }

    public static void main(String[] args) {
        Emp e1=new Emp(101,"Ravi",50000);
        Emp e2=new Emp(102,"Raju",60000);
        Emp e3=new Emp(103,"Ramesh",70000);
        System.out.println(e1.toString());
        System.out.println(e2); //
        System.out.println(e3);
    }
}