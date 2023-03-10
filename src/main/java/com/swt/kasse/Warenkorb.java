package com.swt.kasse;

import java.util.ArrayList;

public class Warenkorb {
    private final ArrayList<Warenkorbposition> position = new ArrayList<>();

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
    }

    public void mengeAndern(Warenkorbposition wp, int anzahl) {
        wp.setMenge(anzahl);
    }

    public double getGesamtBetrag() {
        double gesamtBetrag = 0.0;
        for (var x : position)
            gesamtBetrag += x.getGesamtBetrag();

        return gesamtBetrag;
    }

    public ArrayList<Warenkorbposition> getInhalt() {
        return position;
    }
}
