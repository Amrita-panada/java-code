import java.util.Scanner;

public class RemoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int num = 0;

        while (temp > 0) {
            int r = temp % 10;

            if (r != 0) {
                num =num*10+r;
            }

            temp = temp / 10; // VERY IMPORTANT
        }

        System.out.println(num);
    }
}
