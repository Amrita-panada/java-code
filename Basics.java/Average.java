import java.util.*;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner Sc =new Scanner( System.in);
        float A=Sc.nextFloat();
        float B=Sc.nextFloat();
        float C=Sc.nextFloat();
      //  System.out.println(A);
      //  System.out.println(B);
       // System.out.println(C);
        float sum = A+B+C;
        float Average = sum/3;
        System.out.println(Average);


    }
}

