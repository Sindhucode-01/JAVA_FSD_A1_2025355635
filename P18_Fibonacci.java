
import java.util.Scanner;

public class P18_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many terms? ");
        int k = sc.nextInt();

        if (k <= 0) {
            System.out.println("Number of terms must be positive");
        } else {
            long first = 0;
            long second = 1;

            for (int i = 1; i <= k; i++) {
                System.out.print(first);

                if (i < k) {
                    System.out.print(" ");
                }

                long next = first + second;
                first = second;
                second = next;
            }

            System.out.println();
        }

        sc.close();
    }
}
