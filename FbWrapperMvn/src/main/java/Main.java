import entity.Person;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
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

        for (int i = 0; i < FBFriendList.size(); i++)
            System.out.println(FBFriendList.get(i).getFirstName());

    }
}