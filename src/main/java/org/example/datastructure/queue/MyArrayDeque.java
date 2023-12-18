package org.example.datastructure.queue;

import java.util.Arrays;

public class MyArrayDeque {
    private int[] items;
    private int cnt;
    private int head;
    private int tail;

    public MyArrayDeque(int capacity) {
        items = new int[ capacity ];
    }

    public MyArrayDeque() {
        items = new int[ 5 ];
    }

    public void addLast(int item) {
        if (isFull())
            throw new IllegalStateException("To'la");
        if (isEmpty()) {
            head = items.length - 1;
            tail = 0;
        }

        items[ tail ] = item;
        tail = (tail + 1) % items.length;
        cnt++;
    }

    public void addFirst(int item) {
        //[100, 60, 70, 80, 90]
        //      h
        if (isFull())
            throw new IllegalStateException("To'la");

        if (isEmpty()) {
            items[ 0 ] = item;
            head = items.length - 1;
            tail = 1;
        } else {
            items[ head ] = item;
            head = (head - 1) % items.length;
        }
        cnt++;
    }

    public int removeLast() {
        if (isEmpty())
            throw new IllegalStateException("Bo'sh");
        tail = (tail - 1) % items.length;
        int removed = items[ tail ];
        items[ tail ] = 0;
        cnt--;
        return removed;
    }

    public int removeFirst() {
        if (isEmpty())
            throw new IllegalStateException("Bo'sh");
        head = (head + 1) % items.length;
        int removed = items[ head ];
        items[ head ] = 0;
        cnt--;
        return removed;
    }

    public boolean isFull() {
        return cnt == items.length;
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}