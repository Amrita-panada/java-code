//Suppose a teacher with M students and N Marks of each student is maintained in an (M+1)-by-(N+1) array, reserving the last column for each student’s average mark and the last row for average test mark. Write a java program to compute the average mark for each student. (Average values of each row) and calculate the average test mark (average values of each column).

import java.util.*;
public class Q7D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int M = sc.nextInt();
        System.out.print("Enter number of tests: ");
        int N = sc.nextInt();

        double[][] scores = new double[M + 1][N + 1];

        System.out.println("Enter the marks:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                scores[i][j] = sc.nextDouble();
                scores[i][N] += scores[i][j];
                scores[M][j] += scores[i][j];
            }
            scores[i][N] /= N;
        }

        for (int j = 0; j < N; j++) {
            scores[M][j] /= M;
        }

        System.out.println("Marks and Averages:");
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                System.out.printf("%.2f",scores[i][j]+" ");
            }
            System.out.println();
        }
    }
}
