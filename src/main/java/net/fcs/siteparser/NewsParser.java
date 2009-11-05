package net.fcs.siteparser;

import java.util.List;

public interface NewsParser {
    List<NewsItem> processNews(String html);
}
