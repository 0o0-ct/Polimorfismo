package com.ega.cms;

import com.ega.cms.controller.CMSController;
import com.ega.cms.model.Administrator;
import com.ega.cms.model.Article;
import com.ega.cms.model.Editor;
import com.ega.cms.model.Image;
import com.ega.cms.model.Video;
import com.ega.cms.view.CMSView;

public class Main {
    public static void main(String[] args) {
        // Create a controller
        CMSController controller = new CMSController();

        // Create users
        Administrator admin = new Administrator("admin", "password");
        Editor editor = new Editor("editor", "password");
        controller.addUser(admin);
        controller.addUser(editor);

        // Editor creates and edits content
        Article article = new Article("Introduction to Java", editor.getUsername(), "This is an article about Java programming.");
        controller.createContent(article);
        editor.editContent(article, "Advanced Java Programming");

        Video video = new Video("Design Patterns", editor.getUsername(), "http://example.com/video.mp4", 120);
        controller.createContent(video);

        Image image = new Image("UML Diagram", editor.getUsername(), "http://example.com/uml.png", "UML Class Diagram");
        controller.createContent(image);

        // Admin publishes and deletes content
        admin.publishContent(article);
        admin.deleteContent(video);
        controller.deleteContent(video);


        // Create a view and display contents
        CMSView view = new CMSView(controller);
        view.displayContents();
    }
}
