/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P05 - Circle Calculator
 */

import java.util.Scanner;

public class P05_CircleCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circumference);

        sc.close();
    }
}
