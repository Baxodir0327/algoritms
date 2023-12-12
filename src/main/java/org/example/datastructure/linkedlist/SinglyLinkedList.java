package org.example.datastructure.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;

public class SinglyLinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private int size;

    public boolean add(E element) {
        var newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            var current = this.head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        this.size++;
        return true;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        if (index == 0)
            return head.element;

        var current = head;

        for (int i = 1; i <= index; i++)
            current = current.next;

        return current.element;
    }

    public boolean addAtBeginning(E element) {
        var newNode = new Node<>(element);
        if (head != null)
            newNode.next = head;
        head = newNode;
        size++;
        return true;
    }

    public E removeFromBeginning() {
        if (head == null)
            throw new NoSuchElementException("LinkedList is empty");
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    public E remove(int index) {
        Objects.checkIndex(index, size);
        if (index == 0)
            return removeFromBeginning();
        var current = head;
        for (int i = 1; i < index; i++)
            current = current.next;
        var element = current.next.element;
        current.next = current.next.next;
        return element;
    }

    public boolean remove(Object o) {
        if (head == null)
            return false;
        Node<E> prev = null;
        Node<E> current = head;

        while (current != null) {
            if (Objects.equals(o, current.element)) {
                if (prev == null)
                    head = current.next;
                else
                    prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }


    @Override
    public String toString() {
        var sj = new StringJoiner(", ", "[", "]");
        var current = this.head;
        while (current != null) {
            sj.add(String.valueOf(current.element));
            current = current.next;
        }
        return sj.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    public static void main(String[] args) {
        var sll = new SinglyLinkedList<String>();
        /*
         size(); // done
         get(index); // done
         addAtBeginning(element); // done
         remove(obj); // remove
         remove(index); // done
         removeFromBeginning(); // done
         set(index, element); // done
         */
        sll.add("Java");
        sll.add("Scala");
        sll.add("Python");
        sll.add("Kotlin");
        sll.add("Groovy");
        // System.out.println(sll.addAtBeginning("C++"));
        // System.out.println(sll.addAtBeginning("Groovy"));
        // System.out.println(sll);
        // System.out.println(sll.removeFromBeginning());
        // System.out.println(sll.removeFromBeginning());
        // System.out.println(sll.removeFromBeginning());
        //System.out.println(sll.remove(null));
        // System.out.println(sll);

        for (String lang : sll) {
            System.out.println(lang);
        }
        // sll.forEach(System.out::println);

    }
}
