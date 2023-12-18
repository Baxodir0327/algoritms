package org.example.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Array: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int currentElement = array[ i ];
            int j = i - 1;

            while (j >= 0 && array[ j ] < currentElement) {
                array[ j + 1 ] = array[ j ];
                j--;
            }
            array[ j + 1 ] = currentElement;
        }
    }
}
