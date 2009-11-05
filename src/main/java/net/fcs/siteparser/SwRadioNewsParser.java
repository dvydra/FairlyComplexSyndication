package net.fcs.siteparser;

import net.fcs.model.NewsItem;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.Source;

import java.util.ArrayList;
import java.util.List;

public class SwRadioNewsParser implements NewsParser {

    public SwRadioNewsParser() {

    }

    public List<NewsItem> processNews(String html) {
        ArrayList<NewsItem> newsItems = new ArrayList<NewsItem>();
        Source source = new Source(html);

        Element table = getNewsTable(source);
        if (table != null) {
            List<Element> elements = table.getAllElements("td");
            for (Element td : elements) {
                if (isPostCell(td)) {
                    newsItems.add(createNewsItemFromTd(td));
                }
            }
        }
        return newsItems;

    }

    private NewsItem createNewsItemFromTd(Element td) {
        Element anchor = td.getFirstElement("a");
        String headline = anchor.getContent().getTextExtractor().toString();
        String body = td.getContent().getTextExtractor().toString();
        String href = anchor.getAttributeValue("href");
        return new NewsItem(headline, body, href);
    }

    private boolean isPostCell(Element element) {
        return element.getAttributeValue("height") != null &&
                element.getAttributeValue("height").equals("26") &&
                element.getAttributeValue("class") != null &&
                element.getAttributeValue("class").equals("entry");
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


