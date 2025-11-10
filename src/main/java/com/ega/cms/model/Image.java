package com.ega.cms.model;

public class Image extends Content implements Publishable, Searchable {
    private String url;
    private String altText;

    public Image(String title, String author, String url, String altText) {
        super(title, author);
        this.url = url;
        this.altText = altText;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    @Override
    public void display() {
        System.out.println("Image: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("URL: " + url);
        System.out.println("Alt Text: " + altText);
    }

    @Override
    public void publish() {
        System.out.println("Publishing image: " + getTitle());
    }

    @Override
    public boolean search(String keyword) {
        return getTitle().contains(keyword) || altText.contains(keyword);
    }
}

