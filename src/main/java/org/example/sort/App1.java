package org.example.sort;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("first = " + Arrays.toString(array));
//        insertionSort(array);
//        bubbleSort(array);
        selectionSort(array);
        System.out.println("last = " + Arrays.toString(array));

    }

    private static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int pos = selection(array, length, i);
            swap(array, i, pos);
        }
    }

    private static int selection(int[] array, int length, int pos) {
        int start = pos;
        for (int i = start; i < length; i++) {
            if (array[ i ] < array[ pos ])
                pos = i;
        }
        return pos;
    }

    private static void bubbleSort(int[] array) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[ j ] > array[ j + 1 ]) {
                    swap(array, j);
                    swap = true;
                }
            }


        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[ j ];
        array[ j ] = array[ j + 1 ];
        array[ j + 1 ] = temp;
    }

    private static void swap(int[] array, int i, int pos) {
        int temp = array[ pos ];
        array[ pos ] = array[ i ];
        array[ i ] = temp;
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[ i ];
            int j = i - 1;
            while (j >= 0 && currentElement < array[ j ]) {
                array[ j + 1 ] = array[ j ];
                j--;
            }
            array[ j + 1 ] = currentElement;
        }
    }
}
