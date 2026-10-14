package com.example;

/**
 * 1. Program to add two numbers.
 */
public class AddTwoNumbers {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        if (args.length >= 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException ignored) {}
        }
        System.out.println("Add Two Numbers: " + a + " + " + b + " = " + add(a, b));
    }
}
