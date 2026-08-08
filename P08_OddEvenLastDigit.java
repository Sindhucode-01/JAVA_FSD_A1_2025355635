/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P08 - Odd/Even & Last Digit
 */

import java.util.Scanner;

public class P08_OddEvenLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        int absoluteValue = Math.abs(n);
        System.out.println("Last digit: " + (absoluteValue % 10));

        sc.close();
    }
}