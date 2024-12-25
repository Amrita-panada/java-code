import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("number is the power of two");
        }else{
            System.out.println("number is not the power of tow");
        }
    }
}
