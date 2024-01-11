package org.example.search;

public class JumpSearch {

    public static int jumpSearch(int[] array, int target) {
        int n = array.length;
        int step = (int) Math.sqrt(n);
        int currentIdx = step;
        int prev = 0;

        while (array[Math.min(currentIdx, n) - 1] < target) {
            prev = currentIdx;
            currentIdx += step;

            if (prev >= n) {
                return -1; // Target element is not in the array
            }
        }

        while (array[prev] < target) {
            prev++;

            if (prev == Math.min(currentIdx, n)) {
                return -1; // Target element is not in the array
            }
        }

        return (array[prev] == target) ? prev : -1; // Return index if found, otherwise -1
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int index = jumpSearch(array, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
