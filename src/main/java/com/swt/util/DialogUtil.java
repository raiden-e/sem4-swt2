package com.swt.util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class DialogUtil {

    public static boolean showConfirmDialog(String titel, String nachricht) {
        Alert dialog = new Alert(Alert.AlertType.CONFIRMATION, nachricht, ButtonType.YES, ButtonType.NO);
        dialog.setTitle(titel);
        Optional<ButtonType> result = dialog.showAndWait();
        return result.get() == ButtonType.YES;
    }

    public static void showMessageDialog(String titel, String nachricht) {
        Alert dialog = new Alert(Alert.AlertType.INFORMATION);
        dialog.setTitle(titel);
        dialog.setContentText(nachricht);
        dialog.showAndWait();
    }

}
