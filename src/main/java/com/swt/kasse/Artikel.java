package com.swt.kasse;

public class Artikel {
    private int id;
    private String name;
    private double verkaufspreis;

    public Artikel(int id, String name, double verkaufspreis) {
        this.id = id;
        this.name = name;
        this.verkaufspreis = verkaufspreis;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "id=" + id +
                ", name=" + name +
                ", verkaufspreis=" + verkaufspreis +
                '}';
    }
}
