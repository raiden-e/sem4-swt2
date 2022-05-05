package com.swt.kasse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class controller {

    public void initialize() {
        // TODO
    }

    @FXML
    private void normalesButtonAction(ActionEvent event) {
        Warenkorb w = kasse.warenkorb;
        w.test();
    }
}

