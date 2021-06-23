package com.Justin;

public class Fibonacci {
    public static double fib(int n) {
        if (n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }
}
