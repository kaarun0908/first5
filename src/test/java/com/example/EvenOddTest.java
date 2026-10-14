package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    void testEvenNumbers() {
        assertTrue(EvenOdd.isEven(2));
        assertTrue(EvenOdd.isEven(0));
        assertTrue(EvenOdd.isEven(-4));
        assertEquals("Even", EvenOdd.checkEvenOrOdd(14));
    }

    @Test
    void testOddNumbers() {
        assertFalse(EvenOdd.isEven(1));
        assertFalse(EvenOdd.isEven(7));
        assertFalse(EvenOdd.isEven(-3));
        assertEquals("Odd", EvenOdd.checkEvenOrOdd(7));
    }
}
