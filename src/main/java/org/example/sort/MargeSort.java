package org.example.sort;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 1, 5, 3, 9};
        System.out.println("arr = " + Arrays.toString(arr));

        int[] sorted = margeSort(arr, arr.length);

        System.out.println("sorted = " + Arrays.toString(sorted));
    }

    private static int[] margeSort(int[] arr, int length) {
        if (length <= 1)
            return arr;

        int mid = length / 2;
        int[] left = new int[ mid ];
        int[] right = new int[ length - mid ];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, length - mid);

        int[] leftSorted = margeSort(left, mid);
        int[] rightSorted = margeSort(right, length - mid);
        return merge(arr, leftSorted, rightSorted, mid, length - mid);
    }

    private static int[] merge(int[] arr, int[] leftSorted, int[] rightSorted, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftSorted[ i ] <= rightSorted[ j ]) {
                arr[ k++ ] = leftSorted[ i++ ];
            } else {
                arr[ k++ ] = rightSorted[ j++ ];
            }
        }
        while (i < left) {
            arr[ k++ ] = leftSorted[ i++ ];
        }
        while (j < right) {
            arr[ k++ ] = rightSorted[ j++ ];
        }
        return arr;
    }

}
