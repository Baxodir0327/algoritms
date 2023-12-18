package org.example;

import java.util.Arrays;

public class FibonacciDynamicPrograming {
    static int[] dp;

    static int method(int n) {
        if (dp[ n ] != -1)
            return dp[ n ];

        dp[ n ] = method(n - 1) + method(n - 2);
        return dp[ n ];
    }

    public static int fib(int n) {
        if (n < 2) return n;

        dp = new int[ n + 1 ];
        Arrays.fill(dp, -1);
        dp[ 0 ] = 0;
        dp[ 1 ] = 1;

        return method(n);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
