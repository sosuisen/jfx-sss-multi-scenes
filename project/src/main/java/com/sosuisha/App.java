package com.sosuisha;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var mainLoader = new FXMLLoader(getClass().getResource("main.fxml"));

        // Get View
        var mainScene = new Scene(mainLoader.load(), 640, 480);

        // Get Controller
        var mainController = (MainController) mainLoader.getController();
        mainController.initController();

        // Build scene and stage to show View on the screen
        stage.setScene(mainScene);
        stage.setTitle("MyApp");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}