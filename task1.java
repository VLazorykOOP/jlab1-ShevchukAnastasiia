import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        in.close();

        
        double result = (a / (Math.pow(b, 2) - 2)) 
                      + (b / (Math.pow(a, 2) + 2)) 
                      + Math.pow((a * b), 3);

        System.out.println("Result: " + result);
    }
}
