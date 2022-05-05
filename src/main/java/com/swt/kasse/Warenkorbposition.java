package com.swt.kasse;

public class Warenkorbposition {
    private Artikel position;
    private int menge;

    public Warenkorbposition(Artikel position, int menge) {
        this.position = position;
        this.menge = menge;
    }

    public Artikel getPosition() {
        return position;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Artikel:" + position +", Menge:" + menge;
    }
}
