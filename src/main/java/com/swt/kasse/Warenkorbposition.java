package com.swt.kasse;

import java.util.Objects;

public class Warenkorbposition {
    private Artikel artikel;
    private int menge;
    private double gesamtbetrag;

    public Warenkorbposition(Artikel position, int menge) {
        this.artikel = position;
        this.menge = menge;
        this.gesamtbetrag = menge * artikel.getEinzelpreis();
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
        this.gesamtbetrag = menge * artikel.getEinzelpreis();
    }

    public double getGesamtBetrag() {
        return gesamtbetrag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Warenkorbposition that = (Warenkorbposition) o;

        return artikel.equals(that.getArtikel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(artikel);
    }

    @Override
    public String toString() {
        return artikel + ", Menge:" + menge + ", Gesamt: " + gesamtbetrag;
    }
}
