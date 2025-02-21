package com.sosuisha;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label titleLabel;

    @FXML
    private Button primaryButton;

    private Model model;
    private SceneManager sceneManager;

    public PrimaryController(Model model, SceneManager sceneManager) {
        this.model = model;
        this.sceneManager = sceneManager;
    }

    public void initialize() {
        titleLabel.setText(model.getMessage());
        primaryButton.setOnAction(e -> {
            this.sceneManager.switchScene("secondary");
        });

    }
}
