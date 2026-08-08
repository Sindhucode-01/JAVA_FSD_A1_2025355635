/*
 * Name: Varada Divya Sindhu
 * Roll Number: 2025355635
 * Date: 08-08-2026
 * Program: P04 - Type-Casting Report
 */

public class P04_TypeCasting {
    public static void main(String[] args){

        int n = 42;
        long l = n;
        double d = l;
        System.out.println("Widening : " + n + " -> " + l + " -> " + d);

        double value = 99.99;
        int num = (int)value;
        System.out.println("Narrowing: " + value + " -> " + num);

        char ch = 'A';
        int char_int = ch;
        System.out.println("'A' code : "+char_int);

        int ascii = 66;
        char letter = (char)ascii;
        System.out.println("66 char  : "+letter);
    }
}
