package org.example;

public class PrintFirstNFibonacciNumbers {
    public static void main(String[] args) {
        int n = 20;

        int f0 = 0, f1 = 1, fn;
        for (int i = 0; i < n; i++) {
            System.out.println(f0);
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
    }
}
