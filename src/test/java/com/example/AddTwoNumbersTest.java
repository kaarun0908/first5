package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    @Test
    void testAddPositiveNumbers() {
        assertEquals(40, AddTwoNumbers.add(15, 25));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-30, AddTwoNumbers.add(-10, -20));
    }

    @Test
    void testAddZero() {
        assertEquals(5, AddTwoNumbers.add(5, 0));
        assertEquals(0, AddTwoNumbers.add(0, 0));
    }
}
