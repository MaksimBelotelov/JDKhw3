package org.example.classWork;

public class LazyMan implements Person {
    @Override
    public void doWork() {
        System.out.println("I can't work");
    }

    @Override
    public void haveRest() {
        System.out.println("Having a rest...");
    }
}
