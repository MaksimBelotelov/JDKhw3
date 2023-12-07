package org.example.classWork;

public class Workplace <E extends Person>{
    E[] personsInWorkplace;

    public Workplace(E[] persons) {
        this.personsInWorkplace = persons;
    }

    public void workEverybody() {
        for(E person : personsInWorkplace)
            person.doWork();
    }
}
