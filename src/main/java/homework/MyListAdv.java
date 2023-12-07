package homework;

/*1. Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyListAdv<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    MyIterator<E> iterator;

    MyListAdv() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
        iterator = new MyIterator<E>();
    }

    public void add(E element) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public void remove(int index) {
        if (size > 0 && index < size) {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[size - 1] = null;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Object el : elements) {
            if (el != null)
                sb.append(el + ",");
            else
                break;
        }
        if (sb.length() > 2)
            sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    public Iterator<E> iterator() { return iterator; }

    class MyIterator<E> implements Iterator<E> {
        int index;

        @Override
        public E next() {
            if(index >= size)
                throw new NoSuchElementException();
            return (E) elements[index++];
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }
    }

    public static void main(String[] args) {

    }
}
