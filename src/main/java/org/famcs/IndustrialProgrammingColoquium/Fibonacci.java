package org.famcs.IndustrialProgrammingColoquium;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci 
{
     /**
     * @param n - natural number (n > 0).
     * @return List of the first n Fibonacci numbers.
     * @throws IllegalArgumentException if n <= 0.
     */

    public static List<Long> generateFibonacci(int n) {
        if (n <= 0) 
        {
            throw new IllegalArgumentException("Input must be a positive natural number.");
        }
        List<Long> fibonacciList = new ArrayList<>();
        if (n >= 1) fibonacciList.add(0L); 
        if (n >= 2) fibonacciList.add(1L); 

        for (int i = 2; i < n; i++) 
        {
            long nextFib = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFib);
        }

        return fibonacciList;
    }
}


