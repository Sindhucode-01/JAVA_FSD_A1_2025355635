import java.util.Scanner;

public class P16_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (0-20): ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Invalid input: n must be between 0 and 20");
        } 
        else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(n + "! = " + factorial);
        }

        sc.close();
    }
}
