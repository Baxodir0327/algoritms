package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPrimeNumberToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number = ");
        int number = scanner.nextInt();
        printPrimeNumberToN(number);
    }

    public static void printPrimeNumberToN(int n) {
        for (int number = 2; number <= n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//
//        int n = 70;
//
//        boolean[] primes = new boolean[ n + 1 ];
//        Arrays.fill(primes, true);
//
//        for (int i = 2; i < primes.length; i++) {
//            for (int j = 2; j * i <= n && primes[ i ]; j++) {
//                System.out.println("i = " + i);
//                primes[ i * j ] = false;
//            }
//        }
//
//        for (int i = 2; i < primes.length; i++) {
//            if (primes[ i ]) {
//                System.out.println("i = " + i);
//            }
//        }
//
    }
