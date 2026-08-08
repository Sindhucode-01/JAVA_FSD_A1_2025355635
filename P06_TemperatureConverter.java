/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P06 - Temperature Converter
 */

import java.util.Scanner;

public class P06_TemperatureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius*9/5+32;
        System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);

        System.out.print("Enter Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit-32)*5/9;

        System.out.printf("%.1f F = %.1f C%n", fahrenheit, celsius);

        sc.close();
    }
}
