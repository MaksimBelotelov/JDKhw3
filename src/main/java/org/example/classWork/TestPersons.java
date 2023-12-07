package org.example.classWork;

public class TestPersons {
    public static void main(String[] args) {
        Person[] persons = {new Worker(), new LazyMan(), new Worker(), new LazyMan()};
        Workplace<Person> workplace = new Workplace<>(persons);
        Club<Person> club = new Club<>(persons);
        workplace.workEverybody();
        club.haveARest();
    }
}
