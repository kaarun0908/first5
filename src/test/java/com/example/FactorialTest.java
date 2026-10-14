package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void testFactorialOfZeroAndOne() {
        assertEquals(1L, Factorial.calculateFactorial(0));
        assertEquals(1L, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialPositiveNumbers() {
        assertEquals(120L, Factorial.calculateFactorial(5));
        assertEquals(720L, Factorial.calculateFactorial(6));
        assertEquals(3628800L, Factorial.calculateFactorial(10));
    }

    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}
