import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int choice;
        int evensum=0;
        int oddsum=0;
       // System.out.println("to stot the process press 0 other wise press 1");
       // choice=sc.nextInt();
   
           do{
             System.out.println("enter a number:");
           num=sc.nextInt();
             if(num%2==0){
                 evensum+=num;
                
             }else{
                 oddsum+=num;
             }
           System.out.println("continue press 1 other wise 0");
            choice=sc.nextInt();
         }while(choice==1);
        System.out.println("Sum of even numbers:"+evensum);
        System.out.println("sum of odd numbers"+oddsum);
        
        
            
        
     }
}
    
    