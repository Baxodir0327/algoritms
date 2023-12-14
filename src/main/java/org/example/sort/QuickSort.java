package org.example.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15, 5};

        System.out.println("first = " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("last = " + Arrays.toString(array));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIdx = partition(arr, low, high);
            quickSort(arr, low, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int run = new Random().nextInt(low, high);
        int pivot = arr[ run ];
        swap(arr, run, high);
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[ j ] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;
    }

}
