package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int targetValue = 23;

        int resultIndex = binarySearch(sortedArray, targetValue);

        if (resultIndex != -1) {
            System.out.println("Izlangan qiymat " + targetValue + " indeks: " + resultIndex);
        } else {
            System.out.println("Izlangan qiymat topilmadi");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (array[ mid ] == target) {
                return mid;
            } else if (array[ mid ] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
