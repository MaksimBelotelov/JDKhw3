package org.example.classWork;

import java.io.DataInput;
import java.io.InputStream;

public class Task1<T extends Comparable, V extends InputStream & DataInput, K extends Number> {
    T t;
    V v;
    K k;

    Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printTypes() {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }
}
