package org.example.datastructure.queue;

import java.util.Arrays;

public class MyArrayQueue {
    private final int[] items;
    private int cnt;

    public MyArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public MyArrayQueue() {
        items = new int[5];
    }

    public void enqueue(int num) {
        if (cnt == items.length)
            throw new IllegalStateException("To'la");
        items[cnt++] = num;
    }

    public int dequeue() {
        //5
        //[5, 6, 7, 0,0,0,0,0]
        //[6, 7, 0, 0,0,0,0,0]
        //[7, 0, 0, 0,0,0,0,0]
        if (cnt == 0)
            throw new IllegalStateException("Bo'shku");

        int removed = items[0];

        for (int i = 0; i < cnt - 1; i++)
            items[i] = items[i + 1];

        items[cnt - 1] = 0;
        cnt--;
        return removed;
    }

    public int peek() {
        //[5, 6, 7, 0,0,0,0,0]
        if (cnt == 0)
            throw new IllegalStateException("Bo'shku");

        return items[0];
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, cnt));
    }
}