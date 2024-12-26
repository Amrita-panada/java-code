import java.util.Scanner;

public class Q7 {
    public static boolean isPerfect(int x){
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if(sum==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count=0;
        System.out.println("perfect nums:");
        for(int i=0;i<n;i++){
            if(isPerfect(arr[i])){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("total perfect nums:"+count);
    }
}
