package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeCheckTest {

    @Test
    void testPrimes() {
        assertTrue(PrimeCheck.isPrime(2));
        assertTrue(PrimeCheck.isPrime(3));
        assertTrue(PrimeCheck.isPrime(5));
        assertTrue(PrimeCheck.isPrime(7));
        assertTrue(PrimeCheck.isPrime(11));
        assertTrue(PrimeCheck.isPrime(29));
        assertTrue(PrimeCheck.isPrime(97));
    }

    @Test
    void testNonPrimes() {
        assertFalse(PrimeCheck.isPrime(-5));
        assertFalse(PrimeCheck.isPrime(0));
        assertFalse(PrimeCheck.isPrime(1));
        assertFalse(PrimeCheck.isPrime(4));
        assertFalse(PrimeCheck.isPrime(6));
        assertFalse(PrimeCheck.isPrime(9));
        assertFalse(PrimeCheck.isPrime(25));
        assertFalse(PrimeCheck.isPrime(100));
    }
}
