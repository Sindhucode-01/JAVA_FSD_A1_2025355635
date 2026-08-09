/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P07 - Interest Calculator
 */
import java.util.Scanner;

public class P07_InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate (% p.a.): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();

        double simpleInterest = principal * rate * time / 100;

        double compoundInterest =
                principal * Math.pow(1 + rate / 100, time) - principal;

        double maturity = principal + compoundInterest;

        System.out.printf("Simple Interest = %.2f%n", simpleInterest);
        System.out.printf("Compound Interest = %.2f%n", compoundInterest);
        System.out.printf("Maturity (P + CI) = %.2f%n", maturity);

        sc.close();
    }
}