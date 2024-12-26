//Input 10 integers from the keyboard into an array. The number to be searched is entered through the keyboard by the user. Write a java program to find if the number to be searched is present in the array and if it is present, display the number of times it appears in the array.

import java.util.*;

public class Q3 {

    public static int Search(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        int count = Search(arr, key);
        if (count == 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Number is found " + count + " times");
        }
    }
}
