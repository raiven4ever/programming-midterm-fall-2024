package com.raivens.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(new FXMLLoader(this.getClass().getResource("view.fxml")).load());
        stage.setScene(scene);
        stage.setTitle("Search");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }

}