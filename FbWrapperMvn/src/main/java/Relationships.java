import java.util.List;
import java.util.UUID;

/**
 * Created by hannes on 15/05/2015.
 */
public class Relationships {
    Relationships(){}

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

}
