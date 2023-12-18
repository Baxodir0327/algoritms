package org.example;

import java.util.Scanner;

public class PrintFirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number = ");
        int number = scanner.nextInt();
        printFirstNPrimeNumbers(number);
    }
    public static void printFirstNPrimeNumbers(int n) {
        for (int number = 2, counter = 1; counter <= n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                counter++;
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
