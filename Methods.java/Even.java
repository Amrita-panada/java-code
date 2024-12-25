import java.util.*;

public class Even {
    public static boolean even(int n){
        boolean even = true;
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(even(n)){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }

    
}
    
       
         
      
        
    
    