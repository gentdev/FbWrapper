package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannes on 15/05/2015.
 */
public class Relation {
    Person Person1;
    Person Person2;
    int numberOfInteractions;

    Relation(Person Person1, Person Person2, int numberOfInteractions)
    {
        this.numberOfInteractions = numberOfInteractions;
        this.Person1 = Person1;
        this.Person2 = Person2;
    }

    public Relation(Person person1, Person person2) {
        this.Person1 = Person1;
        this.Person2 = Person2;
    }

    public int getNumberOfInteractions() {
        return numberOfInteractions;
    }

    public void setNumberOfInteractions(int numberOfInteractions) {
        this.numberOfInteractions = numberOfInteractions;
    }

    public List<Person> getPersons()
    {
        List<Person> PersonList = new ArrayList<Person>();
        PersonList.add(this.Person1);
        PersonList.add(this.Person2);
        return PersonList;
    }
}
