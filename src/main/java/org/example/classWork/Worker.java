package org.example.classWork;

public class Worker implements Person {
    @Override
    public void doWork() {
        System.out.println("I'm working hard...");
    }

    @Override
    public void haveRest() {
        System.out.println("I can't have a rest");
    }
}
