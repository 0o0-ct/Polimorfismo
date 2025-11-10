package com.ega.cms.model;

public class Administrator extends User {

    public Administrator(String username, String password) {
        super(username, password);
    }

    public void publishContent(Content content) {
        System.out.println("Publishing content: " + content.getTitle());
    }

    public void deleteContent(Content content) {
        System.out.println("Deleting content: " + content.getTitle());
    }
}
