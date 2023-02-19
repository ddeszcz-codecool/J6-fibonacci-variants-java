package com.codecool.fibonaccivariants;

public class FibonacciVariants {
    public static int additionsCounter = 0;

    public static void resetCounter() {
        additionsCounter = 0;
    }

    public static int iterative(int n) {
        int penultimate = 0;
        int previous = 1;
        if (n == 0) return penultimate;
        if (n == 1) return previous;
        for (int i = 2; i <= n; i++) {
            int current = penultimate + previous;
            penultimate = previous;
            previous = current;
            additionsCounter++;
        }
        return previous;
    }

    public static int naiveRecursive(int n) {
        return 0;
    }

    public static int recursiveWithMemoization(int n) {
        return 0;
    }

    public static int tailRecursive(int n) {
        return 0;
    }

}
