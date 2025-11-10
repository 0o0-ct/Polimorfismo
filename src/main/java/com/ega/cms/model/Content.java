package com.ega.cms.model;

import java.util.Date;

public abstract class Content {
    private String title;
    private Date creationDate;
    private String author;

    public Content(String title, String author) {
        this.title = title;
        this.creationDate = new Date();
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void display();
}
