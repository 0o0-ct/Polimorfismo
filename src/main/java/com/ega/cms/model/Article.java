package com.ega.cms.model;

public class Article extends Content implements Publishable, Searchable {
    private String text;

    public Article(String title, String author, String text) {
        super(title, author);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Article: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Text: " + text);
    }

    @Override
    public void publish() {
        System.out.println("Publishing article: " + getTitle());
    }

    @Override
    public boolean search(String keyword) {
        return getTitle().contains(keyword) || text.contains(keyword);
    }
}
