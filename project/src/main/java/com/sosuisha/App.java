package com.sosuisha;

import java.io.IOException;
import java.lang.InstantiationException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException, InstantiationException {
        var mainLoader = new FXMLLoader(getClass().getResource("main.fxml"));

        // Model
        var model = new Model();

        // Controller
        mainLoader.setControllerFactory(controllerClass -> {
            try {
                // Call the constructor specified by fx:controller in main.fxml.
                return controllerClass.getDeclaredConstructor(Model.class).newInstance(model);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        // View
        var mainScene = new Scene(mainLoader.load(), 640, 480);
        stage.setScene(mainScene);
        stage.setTitle("MyApp");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}