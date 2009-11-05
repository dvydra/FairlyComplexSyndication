package net.fcs.siteparser;

import net.fcs.model.NewsItem;

import java.util.List;

public interface NewsParser {
    List<NewsItem> processNews(String html);
}
