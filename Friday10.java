/*
    Friday, October 10th, 2025
    Chapter 3.2

    * Fibonacci sequence
    * User input
        - Libraries & External classes
*/

import java.util.Scanner; // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
// import java.util.*; // Only import classes from java.util that are needed

public class Friday10 {
    public static void main(String[] args) {
        System.out.println("Friday, October 10th");
        System.out.println("fibonacci(10) = " + fibonacci());

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is " + scanner.nextLine());
        scanner.close();

        // Reverse string
        System.out.println("Minecraft reversed is \"" + reverseString("Minecraft") + "\"");
    }

    // Fibonacci sequence f(n) = f(n - 1) + f(n - 2)
    public static int fibonacci(int n) {
        int a = 0, b = 1, c = 1;

        for (int i = 0; i < n; i++) {
            c = b + a;
            a = b;
            b = c;
        }

        return c;
    }

    public static int fibonacci() { return fibonacci(10); } // Default n = 10

    // Reverse string
    public static String reverseString(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i) + newStr;
        }

        return newStr;
    }
}