import java.util.Scanner;

public class Q11D2 {
    public static int determinant(int[][] matrix, int n) {
        if (n == 1) return matrix[0][0];

        int det = 0;
        int sign = 1;

        for (int col = 0; col < n; col++) {
            int[][] subMatrix = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int subCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j != col) {
                        subMatrix[i - 1][subCol++] = matrix[i][j];
                    }
                }
            }
            det += sign * matrix[0][col] * determinant(subMatrix, n - 1);
            sign = -sign;
        }
        return det;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (N x N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Determinant: " + determinant(matrix, n));
    }
}
