package org.example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 3, 25, 8, 9};
        int target = 257;
        int resIndex = linearSearch(nums, target);
        System.out.println("resIndex = " + resIndex);
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
