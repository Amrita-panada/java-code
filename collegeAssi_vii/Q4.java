//Write a java program to find the maximum and minimum and how many times they both occur in an array of n elements. Find out the positions where the maximum first occurs and the minimum last occurs

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //find max and min
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum:"+max);
        System.out.println("minimum:"+min);

        //position
        for(int i=0;i<n;i++){
            if(max==arr[i]){
                System.out.println("1st position max:"+i+1);
                break;
            }
        }

        for(int i=n-1;i>0;i--){
            if(min==arr[i]){
                System.out.println("last position min:"+i+1);
                break;
            }
        }
    }
}
