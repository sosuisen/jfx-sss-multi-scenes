package com.sosuisha;

import javafx.fxml.FXML;

public class MainController {

    public MainController(Model model) {
        System.out.println(model.getMessage());
    }

    void initialize() {
        // TODO: Add init logic that is called after the FXML has been loaded.
    }
}
