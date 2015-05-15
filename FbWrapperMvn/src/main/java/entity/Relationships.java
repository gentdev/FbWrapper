package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by hannes on 15/05/2015.
 */
public class Relationships {
    public Relationships()
    {
        this.ListOfPersons = new ArrayList<Person>();
        this.ListOfRelations = new ArrayList<Relation>();
    }

    List<Person> ListOfPersons;
    List<Relation> ListOfRelations;

    public void addRelationship(Person Person1, Person Person2)
    {
        Relation relation = new Relation(Person1, Person2);
        ListOfRelations.add(relation);
        Person1.addFriend(Person2);
        Person2.addFriend(Person1);
    }
    public void removeRelationship(Person Person1, Person Person2)
    {
        for( Relation relation : ListOfRelations)
        {
            if(relation.Person1 == Person1 && relation.Person2 == Person2 || relation.Person1 == Person2 && relation.Person2 == Person1)
            {
                ListOfRelations.remove(relation);
                Person1.removeFriend(Person2);
                Person2.removeFriend(Person1);
            }
        }
    }
    public void addPerson(String FirstName, String Name)
    {
        Person Identity = new Person(FirstName, Name);
        ListOfPersons.add(Identity);
    }
    public Person getPerson(String FirstName, String Name)
    {
        Person PersonFound = null;
        for (Person Element : ListOfPersons) {
            if (Element.getFirstName() == FirstName && Element.getName() == Name)
            {
                PersonFound = Element;
            }
        }
        return PersonFound;
    }
    public void removePerson(String FirstName, String Name)
    {
        for (Person Element : ListOfPersons) {
            if (Element.getFirstName() == FirstName && Element.getName() == Name)
            {
                ListOfPersons.remove(Element);
            }
        }
    }

}
