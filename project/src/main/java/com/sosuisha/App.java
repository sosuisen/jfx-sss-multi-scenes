package com.sosuisha;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Model
        var model = new Model();

        // View
        var scene = new FxmlSceneBuilder("main.fxml")
                .css("style.css")
                .size(640, 480)
                .controller(controllerClass -> {
                    try {
                        // Call the constructor specified by fx:controller in fxmlPath.
                        return controllerClass.getDeclaredConstructor(Model.class).newInstance(model);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .build();
        stage.setScene(scene);
        stage.setTitle("MyApp");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
