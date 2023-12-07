package org.example.classWork;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        DataInputStream dis1 = new DataInputStream(System.in);
        Task1<Integer, DataInputStream, Double> t1 = new Task1<>(1, dis1, 2.1);
        t1.printTypes();
    }
}