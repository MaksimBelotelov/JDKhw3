package org.example.classWork;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<E> implements Iterator<E> {
    E[] arr;
    int size;
    int index;

    MyIterator(E[] array) {
        arr = array;
        size = array.length;
        index = 0;
    }

    public E next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return arr[index++];
    }

    public boolean hasNext() {
        return index < size;
    }
}
