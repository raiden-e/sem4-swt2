package com.swt.kasse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class GUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("kasse.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Lustiger Kassenautomat von © Herny Küfner und Raiden Erdmann ☺");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}