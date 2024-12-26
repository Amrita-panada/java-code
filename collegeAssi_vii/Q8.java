import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of 1st arr elements:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

    
        System.out.println("Enter the number of 2nd arr elements:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        //marge 2 array
        System.out.println("Enter the number of elements:");
        int m = n1+n2;
        int marge[] = new int[m];
        int j=0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
           marge[j]=arr1[i];
           j++;
        }
        for(int i=0;i<n2;i++){
            marge[j]=arr2[i];
            j++;
        }

        for(int num:marge){
            System.out.print(num +" ");
        }
    }

}
