package net.fcs.siteparser;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.MasonTagTypes;
import net.htmlparser.jericho.MicrosoftTagTypes;
import net.htmlparser.jericho.Source;

import java.util.ArrayList;
import java.util.List;

public class SwRadioNewsParser implements NewsParser {

    public SwRadioNewsParser() {

    }

    public List<NewsItem> processNews(String html) {
        ArrayList<NewsItem> newsItems = new ArrayList<NewsItem>();
        MicrosoftTagTypes.register();
        MasonTagTypes.register();
        Source source = new Source(html);
        //List<Element> elementList=source.getAllElements();
        Element table = getNewsTable(source);
        if (table != null) {
            List<Element> elements = table.getAllElements("td");
            for (Element td : elements) {
                if (td.getAttributeValue("height") != null && td.getAttributeValue("height").equals("26") &&
                    td.getAttributeValue("class") != null && td.getAttributeValue("class").equals("entry")) {
                    Element anchor = td.getFirstElement("a");
                    String headline = anchor.getContent().getTextExtractor().toString();
                    String body = td.getContent().getTextExtractor().toString();
                    newsItems.add(new NewsItem(headline,body,anchor.getAttributeValue("href")));
                }
            }
        }
        return newsItems;

    }

    private Element getNewsTable(Source source) {
        List<Element> tables = source.getAllElements("table");
        for (Element table : tables) {
            if (table.getAttributeValue("width") != null && table.getAttributeValue("width").equals("389")) {
                return table;
            }
        }
        return null;
    }
}


