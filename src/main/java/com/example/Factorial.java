package com.example;

/**
 * 4. Program to find the factorial of a number.
 */
public class Factorial {

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        if (args.length >= 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {}
        }
        System.out.println("Factorial of " + n + " is " + calculateFactorial(n));
    }
}
