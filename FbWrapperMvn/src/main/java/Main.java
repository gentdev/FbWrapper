import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

/**
 * Created by RSB on 15/05/15.
 */
public class Main {
    public static void main(String[] args) {

    File input = new File("/tmp/input.html");
        Document doc = null;
        try {
            doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element content = null;
        if (doc != null) {
            content = doc.getElementById("content");
        }
        Elements links = content.getElementsByTag("a");

    for(Element link : links) {
        String linkHref = link.attr("href");
        String linkText = link.text();
    }
}}
