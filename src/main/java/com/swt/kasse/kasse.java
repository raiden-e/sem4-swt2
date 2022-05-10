package com.swt.kasse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Kasse {

    @FXML
    private ListView<Warenkorbposition> warenkorbListe;

    private Warenkorb wk = new Warenkorb();

    public void initialize() {
        wk.add(new Artikel(100, "schule", 123123));
        setListe(wk);
    }

    public void setListe(Warenkorb w) {
        warenkorbListe.getItems().clear();
        warenkorbListe.getItems().addAll(w.getInhalt());
    }

    @FXML
    private void bNormalesButtonAction(ActionEvent event) {
        wk.add(new Artikel(101, "norm. Brötchen", 0.50));
        setListe(wk);
    }

    @FXML
    private void bMohnButtonAction(ActionEvent event) {
        wk.add(new Artikel(102, "Mohnbrötchen", 0.50));
        setListe(wk);
    }

    @FXML
    private void bKoernerButtonAction(ActionEvent event) {
        wk.add(new Artikel(103, "Körnerbrötchen", 0.50));
        setListe(wk);
    }

    @FXML
    private void bSauerlButtonAction(ActionEvent event) {
        wk.add(new Artikel(104, "Sauerländerbrötchen", 0.50));
        setListe(wk);
    }

    @FXML
    private void bBerlinerButtonAction(ActionEvent event) {
        wk.add(new Artikel(105, "Berliner", 0.50));
        setListe(wk);
    }

    @FXML
    private void bSchneckeButtonAction(ActionEvent event) {
        wk.add(new Artikel(106, "Schnecke", 0.50));
        setListe(wk);
    }

    @FXML
    private void bMehrkornButtonAction(ActionEvent event) {
        wk.add(new Artikel(107, "Mehrkornbrötchen", 0.50));
        setListe(wk);
    }

    @FXML
    private void bSauertButtonAction(ActionEvent event) {
        wk.add(new Artikel(108, "Sauerteigbrot", 0.50));
        setListe(wk);
    }

    @FXML
    private void bWalnussButtonAction(ActionEvent event) {
        wk.add(new Artikel(109, "Walnussbrot", 0.50));
        setListe(wk);
    }

    @FXML
    private void bKaffeeButtonAction(ActionEvent event) {
        wk.add(new Artikel(110, "Kaffee", 0.50));
        setListe(wk);
    }

    @FXML
    private void bTeeButtonAction(ActionEvent event) {
        wk.add(new Artikel(111, "Tee", 0.50));
        setListe(wk);
    }

    @FXML
    private void bKakaoButtonAction(ActionEvent event) {
        wk.add(new Artikel(112, "Kakao", 0.50));
        setListe(wk);
    }

//    public static String detailsBox;
//    public static double nummernFeld;
//    public static double bestand;

//    public void storno(){}
//    public void beleg(){}
}
