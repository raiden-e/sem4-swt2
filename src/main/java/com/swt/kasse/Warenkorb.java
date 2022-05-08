package com.swt.kasse;

import javafx.scene.control.ListView;

import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Warenkorbposition> position = new ArrayList<Warenkorbposition>();

    public Warenkorb(){}

    public void add(Artikel a){
        position.add(new Warenkorbposition(a, 1));
    }

    public void remove(Warenkorbposition wp){
        position.remove(wp);
        // position.remove(position.remove(position.indexOf(wp));
    }

    public void mengeAndern(Warenkorbposition wp, int anzahl){
        wp.setMenge(anzahl);
    }

    public ArrayList<Warenkorbposition> getInhalt(){
        return position;
    }
}
