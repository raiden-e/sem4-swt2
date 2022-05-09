package com.swt.kasse;

import java.util.Objects;

public class Artikel {
    private int id;
    private String name;
    private double einzelpreis;

    public Artikel(int id, String name, double einzelpreis) {
        this.id = id;
        this.name = name;
        this.einzelpreis = einzelpreis;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getEinzelpreis() {
        return einzelpreis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return id == artikel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + name +
                ", Einzelpreis=" + einzelpreis +
                '}';
    }
}
