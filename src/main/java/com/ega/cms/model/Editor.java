package com.ega.cms.model;

public class Editor extends User {

    public Editor(String username, String password) {
        super(username, password);
    }

    public void createContent(String title, String author) {
        System.out.println("Creating content with title: " + title);
    }

    public void editContent(Content content, String newTitle) {
        System.out.println("Editing content: " + content.getTitle());
        content.setTitle(newTitle);
        System.out.println("New title: " + content.getTitle());
    }
}
