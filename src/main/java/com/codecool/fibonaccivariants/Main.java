package com.codecool.fibonaccivariants;

public class Main {
    public static final String FIB_NUM_TEMPLATE = "%36s: Fib(%d) = %d, number of additions: %d%n";

    public static void main(String[] args) {
        int k = 30;

        System.out.printf(FIB_NUM_TEMPLATE, "Using iteration", k, FibonacciVariants.iterative(k), FibonacciVariants.additionsCounter);

        FibonacciVariants.resetCounter();
        System.out.printf(FIB_NUM_TEMPLATE, "Using naive recursion", k, FibonacciVariants.naiveRecursive(k), FibonacciVariants.additionsCounter);

        FibonacciVariants.resetCounter();
        System.out.printf(FIB_NUM_TEMPLATE, "Using recursion with memoization", k, FibonacciVariants.recursiveWithMemoization(k), FibonacciVariants.additionsCounter);

        FibonacciVariants.resetCounter();
        System.out.printf(FIB_NUM_TEMPLATE, "Using tail recursion", k, FibonacciVariants.tailRecursive(k), FibonacciVariants.additionsCounter);
    }

}
