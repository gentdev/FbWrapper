import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannes on 15/05/2015.
 */
public class Relation {
    Relation(Person Person1, Person Person2)
    {
        Person1.addFriend(this);
        Person2.addFriend(this);

        this.Person1 = Person1;
        this.Person2 = Person2;
    }

    Person Person1;
    Person Person2;

    public List<Person> getPersons()
    {
        List<Person> PersonList = new ArrayList<Person>();
        PersonList.add(this.Person1);
        PersonList.add(this.Person2);
        return PersonList;
    }
    public void Close()
    {
        Person1.removeFriend(this);
        Person2.removeFriend(this);
        Person1 = null;
        Person2 = null;
    }
}
