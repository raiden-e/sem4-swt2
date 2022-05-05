package com.swt.kasse;

import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Warenkorbposition> position = new ArrayList<Warenkorbposition>();

    public Warenkorb(){

    }

    public void add(Artikel a){
        position.add(new Warenkorbposition(a, 1));
    }

    public void remove(Warenkorbposition wp){
        position.remove(wp);
        // position.remove(position.remove(position.indexOf(wp));
    }

    public void mengeAndern(Warenkorbposition wp, int anzahl){
        // pseudo: wp.setAnzahl(anzahl);
    }
    public void test(){
        position.add(new Warenkorbposition(new Artikel(100, "lustiges Brot", 100), 1));
    }
}
