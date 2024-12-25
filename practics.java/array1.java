import java.util.*;
public class array1 { //maximum and minimum

    public static void Max(int arr[],int n){
       int max=Integer.MIN_VALUE;
       System.out.println("max element:");
        for(int i =0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max); 
    }

    public static void Min(int arr[],int n){
        int min=Integer.MAX_VALUE;
        System.out.println("min element:");
         for(int i =0;i<n;i++){
             if (arr[i]>min){
                 min=arr[i];
             }
         }
         System.out.println(min); 
     }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter size of arr:");
       int n=sc.nextInt();
       int arr[]=new int[10];
       System.out.println("enter elements of arr");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       Max(arr,n);
       Min(arr,n);

    }
    
}
