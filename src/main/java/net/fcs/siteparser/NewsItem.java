package net.fcs.siteparser;

public class NewsItem {
    private String headline;
    private String body;
    private String url;

    public NewsItem(String headline, String body, String url) {
        this.headline = headline;
        this.body = body;
        this.url = url;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
