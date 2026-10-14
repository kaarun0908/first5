package com.example;

/**
 * Main runner demonstrating all 5 programs.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("      JAVA PRACTICAL SUITE - 5 PROGRAMS      ");
        System.out.println("==============================================");

        // 1. Add Two Numbers
        System.out.println("\n[1] Addition of Two Numbers:");
        int num1 = 15, num2 = 25;
        System.out.println("    " + num1 + " + " + num2 + " = " + AddTwoNumbers.add(num1, num2));

        // 2. Check Even or Odd
        System.out.println("\n[2] Check Even or Odd:");
        int testEvenOdd = 14;
        System.out.println("    " + testEvenOdd + " is " + EvenOdd.checkEvenOrOdd(testEvenOdd));

        // 3. Largest of Three Numbers
        System.out.println("\n[3] Largest of Three Numbers:");
        int a = 12, b = 45, c = 27;
        System.out.println("    Largest of (" + a + ", " + b + ", " + c + ") is " + LargestOfThree.findLargest(a, b, c));

        // 4. Factorial of a Number
        System.out.println("\n[4] Factorial of a Number:");
        int factNum = 5;
        System.out.println("    " + factNum + "! = " + Factorial.calculateFactorial(factNum));

        // 5. Prime Number Check
        System.out.println("\n[5] Prime Number Check:");
        int primeNum = 29;
        System.out.println("    Is " + primeNum + " prime? " + PrimeCheck.isPrime(primeNum));

        System.out.println("\n==============================================");
        System.out.println("       All 5 programs executed successfully!   ");
        System.out.println("==============================================");
    }
}
