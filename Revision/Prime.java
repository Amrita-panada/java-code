import java.util.Scanner;

public class Prime {
    public static Boolean is_prime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(is_prime(n)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
            
        
    }
}
