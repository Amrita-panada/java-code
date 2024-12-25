public class Student{

    public static class Std{  // class
        String name;
        int rno;
       private double percent;
       final String schoolName="SSVM";
        static int numOFstd;

       public Std(){

       }

       public Std(String name,int rno){
        this.name=name;
        this.rno=rno;
        numOFstd++;
       }
    }

    public static void fun(Std x){
        System.out.println(x.name);
    }

    public static void change(Std x,int y){
        y=11;
        //System.out.println(y); //11
        x.rno=80;
        return;

    }

    
    public static void main(String[] args) {

        class Car{
            String name;
            int price;
        }

        Car c1=new Car();
        c1.name="maruti";
        c1.price=234556;

        //System.out.println(c1.name);

        Std x=new Std();     //object
        x.name="amrita";
        x.rno=76;
        x.percent=92.4;

        //x.schoolName="sbm";
       

        fun(x);
       // System.out.println(x.name);

       int y=10;
       change(x, y);
       //System.out.println(x.rno+" "+y);

       Std s1= new Std("amn", 22);
       System.out.println(s1.numOFstd);
    
       Std s2= new Std("aman", 22);
       System.out.println(s2.numOFstd);
       
    }
}