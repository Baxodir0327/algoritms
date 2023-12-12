package org.example.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] nums = {12, 4, 5, 46, 777, 12853, 7351, 415, 5};
        System.out.println("first = " + Arrays.toString(nums));

        int maxVal = Arrays.stream(nums).max().orElse(0);

        int R = 10; // 10 digits

        int[] aux = new int[nums.length];
        for (int exp = 1; maxVal / exp > 0; exp *= 10) {
            int[] count = new int[R];

            for (int i = 0; i < nums.length; i++) {
                count[(nums[i] / exp) % 10]++;
            }
            System.out.println("count = " + Arrays.toString(count));

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            System.out.println("count = " + Arrays.toString(count));

            for (int i = nums.length - 1; i >= 0; i--) {
                aux[--count[(nums[i] / exp) % 10]] = nums[i];
                System.out.println("aux = " + Arrays.toString(aux));
            }

            System.arraycopy(aux, 0, nums, 0, nums.length);
            System.out.println("mm = " + Arrays.toString(nums));
        }
        System.out.println("first = " + Arrays.toString(nums));
    }
}
