package org.example.datastructure.arraylist;

import java.util.Arrays;
import java.util.Objects;

public class DynamicIntegerArray {

    private Integer[] elementData;
    private int size = 0;

    public DynamicIntegerArray() {
        this(10);
    }

    public DynamicIntegerArray(int initialCapacity) {
        this.elementData = new Integer[initialCapacity];
    }

    public boolean add(Integer item) {
        if ( size == elementData.length )
            grow();
        elementData[size++] = item;
        return true;
    }

    public Integer get(int index) {
        Objects.checkIndex(index, elementData.length);
        return elementData[index];
    }

    public Integer remove(int index) {
        Objects.checkIndex(index, elementData.length);
        Integer oldVale = elementData[index];
        int newSize;
        if ( ( newSize = size - 1 ) > index )
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        elementData[size = newSize] = null;
        return oldVale;
    }

    public boolean remove(Integer o) {
        int i = 0;
        found:
        {

            if ( o == null ) {
                for ( ; i < size; i++ ) {
                    if ( elementData[i] == null ) {
                        break found;
                    }
                }
            } else {
                for ( ; i < size; i++ ) {
                    if ( o.equals(elementData[i]) ) {
                        break found;
                    }
                }
            }
            return false;
        }
        remove(i);
        return true;
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
        DynamicIntegerArray arr = new DynamicIntegerArray(30);
        arr.add(12);
        arr.add(4);
        arr.add(null);
        arr.add(19);
        arr.add(17);
        arr.add(18);
        System.out.println(arr);
        System.out.println(arr.remove(null));
        System.out.println(arr.remove(new Integer(17)));
        System.out.println(arr);
    }

}