package org.example.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15, 5};

        System.out.println("first = " + Arrays.toString(array));

        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            bubbleSort(array, length);
        }
        System.out.println("last = " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i);
            }
        }
    }
    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }


}
