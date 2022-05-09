package com.swt.kasse;

import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Warenkorbposition> position = new ArrayList<Warenkorbposition>();

    public Warenkorb() {
    }

    public void add(Artikel a) {
        for (var x : position) {
            if (x.equals(new Warenkorbposition(a, 1))) {
                x.setMenge(x.getMenge() + 1);
                return;
            }
        }
        position.add(new Warenkorbposition(a, 1));
    }

    public void remove(Warenkorbposition wp) {
        position.remove(wp);
        // position.remove(position.remove(position.indexOf(wp));
    }

    public void mengeAndern(Warenkorbposition wp, int anzahl) {
        wp.setMenge(anzahl);
    }

    public ArrayList<Warenkorbposition> getInhalt() {
        return position;
    }
}
