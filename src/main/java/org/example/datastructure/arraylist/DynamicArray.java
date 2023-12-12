package org.example.datastructure.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

public class DynamicArray<E> implements Iterable<E> {

    public static final int INITIAL_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;

    public DynamicArray() {
        this(INITIAL_CAPACITY);
    }

    public DynamicArray(int initialCapacity) {
        this.elementData = new Object[ initialCapacity ];
    }

    public boolean add(E item) {
        if (size == elementData.length)
            grow();
        elementData[ size++ ] = item;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        Objects.checkIndex(index, elementData.length);
        return (E) elementData[ index ];
    }


    @SuppressWarnings("unchecked")
    public E remove(int index) {
        Objects.checkIndex(index, elementData.length);
        Object oldVale = elementData[ index ];
        size--;
        if (size > index)
            System.arraycopy(elementData, index + 1, elementData, index, size - index);
        elementData[ size ] = null;
        return (E) oldVale;
    }

    public boolean remove(Integer o) {
        int i = 0;
        found:
        {

            if (o == null) {
                for (; i < size; i++) {
                    if (elementData[ i ] == null) {
                        break found;
                    }
                }
            } else {
                for (; i < size; i++) {
                    if (o.equals(elementData[ i ])) {
                        break found;
                    }
                }
            }
            return false;
        }
        remove(i);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) Arrays
                .stream(Arrays.copyOf(elementData, size))
                .iterator();
    }

    private void grow() {
        int newCapacity = elementData.length + elementData.length / 2 + 1;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size));
    }


    public static void main(String[] args) {

        DynamicArray<String> languages = new DynamicArray<>(5);
        languages.add("Java");
        languages.add("Scala");
        languages.add("C#");
        languages.add("Python");
        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println("languages.remove(3) = " + languages.remove(3));
    }
}


