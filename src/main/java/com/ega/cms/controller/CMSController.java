package com.ega.cms.controller;

import com.ega.cms.model.Content;
import com.ega.cms.model.User;
import java.util.ArrayList;
import java.util.List;

public class CMSController {
    private List<Content> contents;
    private List<User> users;

    public CMSController() {
        this.contents = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void createContent(Content content) {
        contents.add(content);
        System.out.println("Content created: " + content.getTitle());
    }

    public void editContent(Content content, String newTitle) {
        content.setTitle(newTitle);
        System.out.println("Content updated: " + content.getTitle());
    }

    public void deleteContent(Content content) {
        contents.remove(content);
        System.out.println("Content deleted: " + content.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getUsername());
    }

    public List<Content> getContents() {
        return contents;
    }
}
