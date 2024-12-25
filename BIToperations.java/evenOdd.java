import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==0){
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }
    }
}
