package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannes on 15/05/2015.
 */
public class Relation {
    Person Person1;
    Person Person2;
    Relation(Person Person1, Person Person2)
    {
        this.Person1 = Person1;
        this.Person2 = Person2;
    }

    public List<Person> getPersons()
    {
        List<Person> PersonList = new ArrayList<Person>();
        PersonList.add(this.Person1);
        PersonList.add(this.Person2);
        return PersonList;
    }
}
