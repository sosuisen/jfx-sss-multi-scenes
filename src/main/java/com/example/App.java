package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var mainLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        /*
         * var mainController = (MainController) mainLoader.getController();
         * mainController.initController(args);
         */
        var mainScene = new Scene(mainLoader.load(), 640, 480);
        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}