package com.example;

/**
 * 3. Program to find the largest of three numbers.
 */
public class LargestOfThree {

    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 12, b = 45, c = 27;
        if (args.length >= 3) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);
            } catch (NumberFormatException ignored) {}
        }
        System.out.println("Largest of (" + a + ", " + b + ", " + c + ") is " + findLargest(a, b, c));
    }
}
