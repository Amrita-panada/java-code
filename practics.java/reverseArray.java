import java.util.*;
public class reverseArray {
    public static void  reverseArray(int arr[],int n) {
        for(int i=arr.length;i>0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("arr elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr,n);
    }
}
