package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by hannes on 15/05/2015.
 */
public class Person {

    Person(String FirstName, String Name)
    {
        this.Friends = new ArrayList<Person>();
        this.FirstName = FirstName;
        this.Name = Name;
        this.ID = java.util.UUID.randomUUID();
    }

    UUID ID;
    String FirstName;
    String Name;
    List<Person> Friends;

    public String getFirstName()
    {
        return this.FirstName;
    }
    public String getName()
    {
        return this.Name;
    }
    public UUID getID()
    {
        return this.ID;
    }
    public void addFriend(Person Friend)
    {
        this.Friends.add(Friend);
    }
    public void removeFriend(Person Friend)
    {
        this.Friends.remove(Friend);
    }
    public List<Person> getFriendList()
    {
        return this.Friends;
    }
}
