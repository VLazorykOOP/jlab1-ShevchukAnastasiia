import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedit' rozmir matryci n (ne bil'she 20х20): ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Vvedit elementy matruci: ");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                A[i][j] = sc.nextInt();
            }
        }

        int maxSumCol = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(A[i][j]);
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumCol = j;
            }
        }

        int minInCol = A[0][maxSumCol];
        for (int i = 1; i < n; i++) {
            if (A[i][maxSumCol] < minInCol) {
                minInCol = A[i][maxSumCol];
            }
        }

        int minVal = A[0][0];
        int minCol = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (A[i][j] < minVal) {
                    minVal = A[i][j];
                    minCol = j;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            int[] temp = new int[n];

            for (int k = 0; k < n; ++k) {
                temp[k] = A[i][(minCol + k) % n];
            }

            for (int k = 0; k < n; ++k) {
                A[i][k] = temp[k];
            }
        }

        System.out.println("Maytica pislya cyklichnogo zsyvy:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}