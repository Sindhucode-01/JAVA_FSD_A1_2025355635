/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P12 - Menu Calculator
 */
import java.util.Scanner;

public class P12_MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+ - * / %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
                }
                break;

            case '%':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%.2f %% %.2f = %.2f%n", a, b, a % b);
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}