package org.example.datastructure.queue;

import java.util.ArrayDeque;

public class Demo {

    public static void main(String[] args) {
        MyArrayDeque queue = new MyArrayDeque();
//        queue.addLast(100);
//        queue.addLast(4);
//        queue.addLast(1100);
        //System.out.println(queue);
       // queue.removeLast();
        System.out.println(queue);
        queue.addFirst(90);
        System.out.println(queue);
        queue.addLast(110);
        queue.addFirst(80);
        queue.addLast(120);
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        queue.addFirst(1000);
        queue.addLast(10000);
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);
        System.out.println(queue.removeLast());
//        System.out.println(queue.removeLast());
//        System.out.println(queue.removeLast());
        System.out.println(queue);
        queue.addLast(200);
        System.out.println(queue);
        queue.addFirst(100);
        System.out.println(queue);
        queue.addFirst(90);
        System.out.println(queue);
        queue.addLast(80);
        System.out.println(queue);
//        queue.addLast(70);
//        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        queue.addFirst(800000);
        System.out.println(queue);
        queue.addFirst(80);
        System.out.println(queue);
        ArrayDeque<Object> objects = new ArrayDeque<>();
    }
}