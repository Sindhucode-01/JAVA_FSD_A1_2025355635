/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2515010711
 * Date: 08-08-2026
 * Program: P03 - Swap Without a Third Variable
 */

import java.util.Scanner;

public class P03_SwapWithoutThird {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Before: a = "+a+", b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After : a = "+a+", b = "+b);

        sc.close();
    }
}
