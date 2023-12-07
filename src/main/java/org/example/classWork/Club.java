package org.example.classWork;

public class Club<E extends Person>{
    E[] personsInDaClub;

    Club(E[] persons) {
        this.personsInDaClub = persons;
    }

    public void haveARest() {
        for(E person: personsInDaClub)
            person.haveRest();
    }
}
