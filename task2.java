import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size n (n <= 200): ");
        int n = in.nextInt();

        int[] A = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }


        System.out.print("Enter k (number of positions to shift): ");
        int k = in.nextInt();
        in.close();

        k = k % n;


        int[] shifted = new int[n];
        for (int i = 0; i < n; i++) {
            shifted[(i + k) % n] = A[i];
        }

     
        System.out.println("Shifted array:");
        for (int x : shifted) {
            System.out.print(x + " ");
        }
    }
}
