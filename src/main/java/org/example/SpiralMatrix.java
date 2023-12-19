package org.example;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row count");
        int row = scanner.nextInt();
        System.out.println("Enter column count");
        int col = scanner.nextInt();
        System.out.println();

        int[][] matrix = getSpiralMatrix(row, col);

        printMatrix(matrix);
    }

    private static int[][] getSpiralMatrix(int row, int col) {
        int[][] matrix = new int[row][col];

        int number = 0;
        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;

        while (true) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = ++number;
            }
            top++;
            if(top > bottom) break;

            for (int i = top; i <= bottom ; i++) {
                matrix[i][right] = ++number;
            }
            right--;
            if(right < left) break;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = ++number;
            }
            bottom--;
            if(top > bottom) break;

            for (int i = bottom; i >= top ; i--) {
                matrix[i][left] = ++number;
            }
            left++;
            if(right < left) break;
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int value : arr) {
                System.out.printf("%-3d ", value);
            }
            System.out.println();
        }
    }
}