package org.example.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15, 5};
        System.out.println("first = " + Arrays.toString(array));

        int length = array.length;

        selectionSort(array, length);

        System.out.println("last = " + Arrays.toString(array));
    }

    private static void selectionSort(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            int pos = select(array, length, i);
            swap(array, i, pos);
        }
    }

    private static int select(int[] array, int length, int start) {
        int pos = start;
        for (int i = start; i < length; i++) {
            if (array[i] < array[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    private static void swap(int[] array, int i, int pos) {
        int temp = array[i];
        array[i] = array[pos];
        array[pos] = temp;
    }

}
