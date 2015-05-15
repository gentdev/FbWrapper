package parse;

import entity.Person;
import entity.Relationships;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by RSB on 15/05/15.
 */
public class parsePerson {
    File personFile;

    public parsePerson() {
    }

    public List<Person> parsePersons(File personFile) {
        Elements personsFB = null;
        Person FacebookFriend;
        List<Person> FBFriendList = new ArrayList<Person>();


        Document doc = null;

        try {
            doc = Jsoup.parse(personFile, "UTF-8", "http://example.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (doc != null) {
            personsFB = doc.getElementsByTag("li");
        }

        for (Element personFB : personsFB) {

            FacebookFriend = new Person(personFB.text(), personFB.text());
            FBFriendList.add(FacebookFriend);

        }
        return FBFriendList;
    }
}
