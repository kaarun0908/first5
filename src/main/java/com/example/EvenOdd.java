package com.example;

/**
 * 2. Program to check whether a number is even or odd.
 */
public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String checkEvenOrOdd(int number) {
        return isEven(number) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 14;
        if (args.length >= 1) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {}
        }
        System.out.println("Number " + number + " is " + checkEvenOrOdd(number));
    }
}
