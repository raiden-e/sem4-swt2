package com.swt.kasse;

import com.swt.exceptions.ArtikelNichtVorhandenException;
import com.swt.util.DialogUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Kasse {

    public ArrayList<Artikel> artikel = new ArrayList<Artikel>();

    @FXML
    private ListView<Warenkorbposition> warenkorbListe;

    @FXML
    private TextField tfEingabe;

    private Warenkorb wk = new Warenkorb();

    public void initialize() {
        wk.add(new Artikel(100, "schule", 123123));
        setListe(wk);

        artikel.add(new Artikel(101, "norm. Brötchen", 0.50));
        artikel.add(new Artikel(102, "Mohnbrötchen", 0.50));
        artikel.add(new Artikel(103, "Körnerbrötchen", 0.50));
        artikel.add(new Artikel(104, "Sauerländerbrötchen", 0.50));
        artikel.add(new Artikel(105, "Berliner", 0.50));
        artikel.add(new Artikel(106, "Schnecke", 0.50));
        artikel.add(new Artikel(107, "Mehrkornbrötchen", 0.50));
        artikel.add(new Artikel(108, "Sauerteigbrot", 0.50));
        artikel.add(new Artikel(109, "Walnussbrot", 0.50));
        artikel.add(new Artikel(110, "Kaffee", 0.50));
        artikel.add(new Artikel(111, "Tee", 0.50));
        artikel.add(new Artikel(112, "Kakao", 0.50));
    }

    public void setListe(Warenkorb w) {
        warenkorbListe.getItems().clear();
        warenkorbListe.getItems().addAll(w.getInhalt());
    }

    public Artikel findeArtikelMitID(int id) throws ArtikelNichtVorhandenException{
        for (var x : artikel) {
            if (x.getId() == id)
                return x;
        }
        throw new ArtikelNichtVorhandenException("" + id);
    }

    @FXML
    private void bNormalesButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(101));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bMohnButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(102));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bKoernerButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(103));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bSauerlButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(104));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bBerlinerButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(105));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bSchneckeButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(106));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bMehrkornButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(107));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bSauertButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(108));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bWalnussButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(109));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bKaffeeButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(110));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bTeeButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(111));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bKakaoButtonAction(ActionEvent event) {
        try {
            wk.add(findeArtikelMitID(112));
        } catch (ArtikelNichtVorhandenException e) {
            throw new RuntimeException(e);
        }
        setListe(wk);
    }

    @FXML
    private void bStornoButtonAction(ActionEvent event) {
        Warenkorbposition temp = warenkorbListe.getSelectionModel().getSelectedItem();
        wk.remove(temp);
        setListe(wk);
    }

    @FXML
    private void b0ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "0");
    }

    @FXML
    private void b1ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "1");
    }

    @FXML
    private void b2ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "2");
    }

    @FXML
    private void b3ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "3");
    }

    @FXML
    private void b4ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "4");
    }

    @FXML
    private void b5ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "5");
    }

    @FXML
    private void b6ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "6");
    }

    @FXML
    private void b7ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "7");
    }

    @FXML
    private void b8ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "8");
    }

    @FXML
    private void b9ButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText() + "9");
    }

    @FXML
    private void bSternButtonAction(ActionEvent event) {
        if (tfEingabe.getText() == "" || Double.parseDouble(tfEingabe.getText()) == 0.0d || tfEingabe.getText().contains("."))
            return;
        if (warenkorbListe.getSelectionModel().getSelectedItem() == null)
            return;
        Warenkorbposition temp = warenkorbListe.getSelectionModel().getSelectedItem();
        wk.mengeAndern(temp, Integer.parseInt(tfEingabe.getText()));
        setListe(wk);
        tfEingabe.clear();
    }

    @FXML
    private void bCEButtonAction(ActionEvent event){
        tfEingabe.clear();
    }

    @FXML
    private void bCButtonAction(ActionEvent event) {
        tfEingabe.setText(tfEingabe.getText().substring(0,tfEingabe.getText().length()-1));
    }

    @FXML
    private void bPunktButtonAction(ActionEvent event) {
        if (tfEingabe.getText() == "")
            return;
        if (tfEingabe.getText().contains("."))
            return;
        tfEingabe.setText(tfEingabe.getText() + ".");
    }

    @FXML
    private void bBestButtonAction(ActionEvent event) {
        if (tfEingabe.getText() == "" || Integer.parseInt(tfEingabe.getText()) == 0 || tfEingabe.getText().contains("."))
            return;
        try {
            wk.add(findeArtikelMitID(Integer.parseInt(tfEingabe.getText())));
            setListe(wk);
        } catch (ArtikelNichtVorhandenException e) {
            DialogUtil.showMessageDialog("Artikel nicht gefunden", "Der Artikel mit der Nummer " + e.getMessage() + " wurde nicht gefunden!");
        }

    }


//    public static String detailsBox;
//    public static double nummernFeld;
//    public static double bestand;

//    public void storno(){}
//    public void beleg(){}
}
