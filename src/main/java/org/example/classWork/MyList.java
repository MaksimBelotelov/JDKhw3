package org.example.classWork;

import java.util.Arrays;

public class MyList<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if(size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public void remove(int index) {
        if(size > 0 && index < size) {
            System.arraycopy(elements, index + 1 , elements, index, size - index - 1);
            elements[size-1] = null;
            size--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public static void main(String[] args) {
        MyList<Integer> iList= new MyList<>();
        iList.add(12);
        iList.add(14);
        iList.add(15);
        System.out.println(iList);
        iList.remove(1);
        System.out.println("After removing:");
        System.out.println(iList);
    }
}
