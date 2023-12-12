package org.example.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueWith {
    public static void main(String[] args) {
        int[] nums = {170, 45, 75, 90, 802000, 24, 2, 66};
        System.out.println("nums = " + Arrays.toString(nums));
        nums = priorityQueue(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    private static int[] priorityQueue(int[] nums) {
        int i = 0;
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums)
            pq.add(num);

        while (!pq.isEmpty())
            ans[i++] = pq.poll();
        return ans;
    }
}
