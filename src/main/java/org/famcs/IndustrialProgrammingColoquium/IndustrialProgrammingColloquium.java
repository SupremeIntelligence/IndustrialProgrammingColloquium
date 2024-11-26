/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.famcs.IndustrialProgrammingColoquium;

import java.util.List;

/**
 *
 * @author supre
 */
public class IndustrialProgrammingColloquium 
{
    public static void main(String[] args) {
        try {
        int n = 100; 
            List<Long> fibonacciNumbers = Fibonacci.generateFibonacci(n);
            System.out.println("First " + n + " Fibonacci numbers: " + fibonacciNumbers);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
