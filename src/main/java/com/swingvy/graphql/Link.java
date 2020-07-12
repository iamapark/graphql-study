package com.swingvy.graphql;

/**
 * @author jinyoung.park
 * @date 2020/07/13
 */
public class Link {

    private final String url;
    private final String description;

    public Link(String url, String description) {
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }
}
