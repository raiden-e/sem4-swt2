package com.swt.kasse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class kasse extends Application {
    public static Warenkorb warenkorb = new Warenkorb();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(kasse.class.getResource("kasse.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Lustiger Kassenautomat von © Herny Küfner und Raiden Erdmann ☺");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}