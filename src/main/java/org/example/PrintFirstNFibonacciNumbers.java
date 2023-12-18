package org.example;

public class PrintFirstNFibonacciNumbers {
//    F(0) = 0, F(1) = 1
//    F(n) = F(n - 1) + F(n - 2), for n > 1.
    public static void main(String[] args) {
        System.out.println(fibNum(5));
        int fib = fib(5);
        System.out.println(fib);
    }

    private static int fibNum(int n) {
        int f0 = 0, f1 = 1, fn=0;
        for (int i = 1; i < n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    public static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);

    }
}