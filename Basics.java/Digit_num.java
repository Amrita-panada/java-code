import java.util.*;
public class Digit_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int i;
        //    do{
     //     count++;
     //     n/=10;
     //    }while(n!=0);
     //    System.out.println("total digit:"+count);
    //  while(n!=0){
    //     n/=10;
    //     count++;
    //  }
    //  System.out.println("total digit:"+count);
     for(i=0;n!=0;i++){
        n/=10;
     }
     System.out.println("total digit:"+i);
    }


}
