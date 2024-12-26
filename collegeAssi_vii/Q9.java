import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("num which is not smaller its neighbour:");
        for(int i=0;i<n;i++){
            if((i==0||arr[i]>arr[i-1]) &&(i==n-1 || arr[i]>=arr[i+1])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
