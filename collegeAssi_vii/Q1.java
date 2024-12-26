//Write a java program to create an array of size N and store the random values in it and find the sum and average.
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Random r=new Random();
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(100);
            sum+=arr[i];
           
        }

        double avg=(double) sum/n;
        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);

    }
}
