import java.util.Scanner;

public class RotateArray {
    public static void rotateLeft(int[] arr, int d, int n) {
        d = d % n; // In case d is larger than n
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int d = sc.nextInt();

        rotateLeft(arr, d, n);

        System.out.println("Array after left rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

