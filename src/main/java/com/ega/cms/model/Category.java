package com.ega.cms.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Content> contents;

    public Category(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void addContent(Content content) {
        contents.add(content);
    }
}
