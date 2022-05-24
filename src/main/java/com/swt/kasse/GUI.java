package com.swt.kasse;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("kasse.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.getIcons().add(new Image("file:src/main/resources/com/swt/kasse/icon.png"));

        stage.setTitle("Lustiger Kassenautomat von © Herny Küfner und Raiden Erdmann ☺ - KRASSE KASSE");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void close(){
        Platform.exit();
    }
}