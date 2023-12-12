package org.example.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnalyzeLinkedListAndArrayList {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        var linkedList = new LinkedList<Integer>();

        final var max_element_count = 100_000;

        var start = System.currentTimeMillis();
        addToArrayList(arrayList, max_element_count);
        var end = System.currentTimeMillis();
        System.out.println("array list - " + (end - start));

        start = System.currentTimeMillis();
        addToLinkedList(linkedList, max_element_count);
        end = System.currentTimeMillis();
        System.out.println("linked list - " + (end - start));

        start = System.currentTimeMillis();
        removeFromBeginningArrayList(arrayList);
        end = System.currentTimeMillis();
        System.out.println("array list (remove) - " + (end - start));

        start = System.currentTimeMillis();
        removeFromBeginningLinkedList(linkedList);
        end = System.currentTimeMillis();
        System.out.println("linked list (remove) - " + (end - start));


    }

    private static void addToLinkedList(LinkedList<Integer> linkedList, int max_element_count) {
        for (int i = 0; i < max_element_count; i++) {
            linkedList.add(0, i);
        }
    }

    private static void addToArrayList(ArrayList<Integer> arrayList, int max_element_count) {
        for (int i = 0; i < max_element_count; i++) {
            arrayList.add(0, i);
        }
    }

    private static void removeFromBeginningLinkedList(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
    }

    private static void removeFromBeginningArrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
    }
}
