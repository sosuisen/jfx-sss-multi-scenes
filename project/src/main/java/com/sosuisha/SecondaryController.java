package com.sosuisha;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {
    @FXML
    private Label titleLabel;

    @FXML
    private Button secondaryButton;

    private Model model;
    private SceneManager sceneManager;

    public SecondaryController(Model model, SceneManager sceneManager) {
        this.model = model;
        this.sceneManager = sceneManager;
    }

    public void initialize() {
        titleLabel.setText(model.getMessage());
        secondaryButton.setOnAction(e -> {
            this.sceneManager.switchScene("primary");
        });

    }
}
