import java.util.Scanner;

public class Q12D2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int trace = 0;
        double normal = 0;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];
            for (int j = 0; j < n; j++) {
                normal += Math.pow(matrix[i][j], 2);
            }
        }

        normal = Math.sqrt(normal);

        System.out.println("Trace: " + trace);
        System.out.println("Normal: " + normal);
    }
}
