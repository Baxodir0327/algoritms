package org.example.datastructure.stack;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

public class MyStack<E> implements Iterable<E> {
    public static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyStack(int capacity) {
        this.elements = new Object[capacity];
    }

    public E push(E element) {
        if ( isFull() )
            throw new StackOperationException("Stack is full");
        elements[size++] = element;
        return element;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if ( isEmpty() )
            throw new StackOperationException("Stack is empty");
        return (E) elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if ( isEmpty() )
            throw new StackOperationException("Stack is empty");
        E removedElement = (E) elements[size - 1];
        elements[--size] = null;
        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public String toString() {
        var sj = new StringJoiner(", ", "[", "]");
        this.forEach(e -> sj.add(Objects.toString(e)));
        return sj.toString();

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int current = 0;

            @Override
            public boolean hasNext() {
                return size > current;
            }

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                return (E) elements[current++];
            }
        };
    }

    public static class StackOperationException extends RuntimeException {
        public StackOperationException(String message) {
            super(message);
        }
    }
}