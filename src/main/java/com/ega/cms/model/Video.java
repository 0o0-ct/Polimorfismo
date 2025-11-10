package com.ega.cms.model;

public class Video extends Content implements Publishable, Searchable {
    private String url;
    private int duration;

    public Video(String title, String author, String url, int duration) {
        super(title, author);
        this.url = url;
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void display() {
        System.out.println("Video: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("URL: " + url);
        System.out.println("Duration: " + duration + " seconds");
    }

    @Override
    public void publish() {
        System.out.println("Publishing video: " + getTitle());
    }

    @Override
    public boolean search(String keyword) {
        return getTitle().contains(keyword);
    }
}
