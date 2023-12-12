package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int[] nums = {12, 4, 5, 6, 7, 3, 1, 15, 5};
        List<List<Integer>> list = new ArrayList<>(10);
        create(list);

        int length = length(Arrays.stream(nums).max().orElse(0));

        for (int i = 0; i < length; i++) {
            put(nums, list, i);
            rePut(list, nums);
            refresh(list);
        }

        System.out.println(Arrays.toString(nums));
    }

        private static void put(int[] nums, List<List<Integer>> list, int i) {
            for (int num : nums) {
                list.get(digit(i, num)).add(num);
            }
        }

    private static void rePut(List<List<Integer>> list, int[] nums) {
        int currIndex = 0;
        for (List<Integer> items : list) {
            for (Integer item : items) {
                nums[currIndex++] = item;
            }
        }
    }

    public static int digit(int index, int num) {
        for (int i = 0; i < index; i++) {
            num /= 10;
        }

        return num % 10;
    }

    public static int length(int max) {
        int l = 0;
        while (max > 0) {
            l++;
            max /= 10;
        }
        return l;
    }

    public static void create(List<List<Integer>> list) {
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public static void refresh(List<List<Integer>> list) {
        for (int i = 0; i < 10; i++) {
            list.set(i, new LinkedList<>());
        }
    }


}
