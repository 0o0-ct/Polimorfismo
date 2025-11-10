package com.ega.cms.view;

import com.ega.cms.controller.CMSController;
import com.ega.cms.model.Content;

public class CMSView {
    private CMSController controller;

    public CMSView(CMSController controller) {
        this.controller = controller;
    }

    public void displayContents() {
        System.out.println("--- All Contents ---");
        for (Content content : controller.getContents()) {
            content.display();
            System.out.println("========================================================");
        }
    }
}
