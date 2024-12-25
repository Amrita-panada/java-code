import java.util.*;
public class Q1{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        arr[n-1]=arr[n-1]+1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(n);
    }
}