import java.util.*;

public class Positive_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if ( n>0) {
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("some thing else");
        }
    }
}