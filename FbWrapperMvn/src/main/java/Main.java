import entity.Person;
import entity.Relation;
import entity.Relationships;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import parse.parseInteractions;
import parse.parsePerson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RSB on 15/05/15.
 */

public class Main {

    public static void main(String[] args) {
        List<Person> FBFriendList = new ArrayList<Person>();

        File input = new File("./input-facebook-robert/html/friends.htm");

        parsePerson parseFBPerson = new parsePerson();

        FBFriendList = parseFBPerson.parsePersons(input);

        //parseInteractions parseFBInteractions = new parseInteractions(input, FBFriendList);

        Relationships relationshipsFB = new Relationships();

        Person mainPerson = relationshipsFB.addPerson("Robert", "Stohr-Botar");

        System.out.println(FBFriendList.size());

        for (int i = 0; i < FBFriendList.size(); i++) {
            Person tempPers = relationshipsFB.addPerson(FBFriendList.get(i).getFirstName(), FBFriendList.get(i).getName());
            relationshipsFB.addRelationship(mainPerson, tempPers, 1);
            System.out.println("Friend added");
        }

        int friendlistSize = relationshipsFB.getPerson("Robert", "Stohr-Botar").getFriendList().size();
        System.out.println("Aantal vrienden: " + friendlistSize);

        for (int i = 0; i < friendlistSize; i++) {
            System.out.println(relationshipsFB.getPerson("Robert", "Stohr-Botar").getFriendList().get(i).getFirstName());
        }
    }
}