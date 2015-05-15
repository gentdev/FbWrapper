package parse;

import entity.Person;
import entity.Relation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 15/05/15.
 */
public class parseInteractions {
    File interactionFile;
    List<Person> FBFriendList = new ArrayList<Person>();

    public parseInteractions() {

    }

    public parseInteractions(File interactionFile, List<Person> FBFriendList) {

        Elements interactions = null;
        int numberOfInteractions;
        Relation relations;
        Document doc = null;

        try {
            doc = Jsoup.parse(interactionFile, "UTF-8", "http://example.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (doc != null) {
            for (int i = 0; i < FBFriendList.size(); i++) {

                interactions = doc.getElementsContainingText(FBFriendList.get(i).getFirstName());

                if (interactions.is(FBFriendList.get(i).getFirstName())) {

                }
            }
            ;


        }
    }

}



