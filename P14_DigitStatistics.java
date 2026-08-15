/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 14-08-2026
 * Program: P14 - Digit Statistics
 */
import java.util.Scanner;

public class P14_DigitStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = sc.nextLong();

        long number = Math.abs(n);
        int digits = 0;
        long sum = 0;

        do {
            sum += number % 10;
            digits++;
            number /= 10;
        } while (number > 0);

        System.out.println("Digits: " + digits);
        System.out.println("Digit sum: " + sum);

        sc.close();
    }
}