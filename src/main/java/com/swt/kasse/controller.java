package com.swt.kasse;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.Collection;
import java.util.List;

public class controller {

    @FXML
    private ListView<Warenkorbposition> warenkorbListe;

    private Warenkorb wk = new Warenkorb();

    public void initialize() {
        wk.add(new Artikel(100, "schule", 123123));
        setListe(wk);
    }

    public void setListe(Warenkorb w){
        warenkorbListe.getItems().addAll(w.getInhalt());
    }

    @FXML
    private void normalesButtonAction(ActionEvent event) {
        Warenkorb w = kasse.warenkorb;
    }

    //@FXML
    //private void updateList(){
    //    warenkorbListe.refresh();
    //}
}
