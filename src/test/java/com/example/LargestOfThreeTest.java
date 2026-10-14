package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOfThreeTest {

    @Test
    void testFirstIsLargest() {
        assertEquals(50, LargestOfThree.findLargest(50, 20, 10));
    }

    @Test
    void testSecondIsLargest() {
        assertEquals(45, LargestOfThree.findLargest(12, 45, 27));
    }

    @Test
    void testThirdIsLargest() {
        assertEquals(99, LargestOfThree.findLargest(10, 25, 99));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-2, LargestOfThree.findLargest(-10, -5, -2));
    }

    @Test
    void testAllEqual() {
        assertEquals(7, LargestOfThree.findLargest(7, 7, 7));
    }
}
