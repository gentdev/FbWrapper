import java.util.List;
import java.util.UUID;

/**
 * Created by hannes on 15/05/2015.
 */
public class Person {

    Person(String FirstName, String Name)
    {
        this.FirstName = FirstName;
        this.Name = Name;
        this.ID = java.util.UUID.randomUUID();
    }

    UUID ID;
    String FirstName;
    String Name;

    public String getFirstName()
    {
        return this.FirstName;
    }
    public String GetName()
    {
        return this.Name;
    }
    public UUID GetID()
    {
        return this.ID;
    }
}
