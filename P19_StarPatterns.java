
import java.util.Scanner;

public class P19_StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        // (a) Left-aligned triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // (b) Inverted triangle
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // (c) Centred pyramid
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");

                if (k < i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
