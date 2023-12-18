package org.example;

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
}
