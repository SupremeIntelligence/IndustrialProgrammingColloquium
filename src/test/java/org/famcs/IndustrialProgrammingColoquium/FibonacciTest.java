package org.famcs.IndustrialProgrammingColoquium;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void testGenerateFibonacciValidInput() {
        List<Long> result = Fibonacci.generateFibonacci(5);
        assertEquals(List.of(0L, 1L, 1L, 2L, 3L), result);
    }

    @Test
    void testGenerateFibonacciSingleElement() {
        List<Long> result = Fibonacci.generateFibonacci(1);
        assertEquals(List.of(0L), result);
    }

    @Test
    void testGenerateFibonacciTwoElements() {
        List<Long> result = Fibonacci.generateFibonacci(2);
        assertEquals(List.of(0L, 1L), result);
    }

    @Test
    void testGenerateFibonacciLargeInput() {
        List<Long> result = Fibonacci.generateFibonacci(10);
        assertEquals(List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L), result);
    }

    @Test
    void testGenerateFibonacciInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.generateFibonacci(0);
        });
        assertEquals("Input must be a positive natural number.", exception.getMessage());
    }
}
