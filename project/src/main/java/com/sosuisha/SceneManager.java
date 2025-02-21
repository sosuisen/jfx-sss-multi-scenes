package com.sosuisha;

import java.io.IOException;
import java.util.HashMap;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    private HashMap<String, Scene> sceneMap = new HashMap<>();
    private Stage stage;
    private String currentSceneName;

    public SceneManager(Stage stage, String[] sceneNames, Model model) throws IOException {
        this.stage = stage;
        for (var sceneName : sceneNames) {
            var scene = new FxmlSceneBuilder(sceneName + ".fxml")
                    .css("style.css")
                    .size(320, 240)
                    .controller(controllerClass -> {
                        try {
                            // Call the constructor specified by fx:controller in fxmlPath.
                            return controllerClass.getDeclaredConstructor(Model.class, SceneManager.class)
                                    .newInstance(model, this);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .build();
            sceneMap.put(sceneName, scene);
        }
    }

    public Scene getScene(String sceneName) {
        return sceneMap.get(sceneName);
    }

    public void switchScene(String sceneName) {
        var scene = getScene(sceneName);
        if (scene != null) {
            this.currentSceneName = sceneName;
            this.stage.setScene(scene);
            this.stage.setTitle("MyApp: " + currentSceneName);
        }
    }
}
