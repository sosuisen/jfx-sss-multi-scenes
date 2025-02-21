package com.sosuisha;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Model
        var model = new Model();

        var sceneManager = new SceneManager(stage, new String[] { "primary", "secondary" }, model);
        sceneManager.switchScene("primary");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
