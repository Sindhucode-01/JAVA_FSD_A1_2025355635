/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 14-08-2026
 * Program: P13 - Multiplication Table
 */
import java.util.Scanner;

public class P13_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}
