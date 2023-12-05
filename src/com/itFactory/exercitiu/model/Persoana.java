package com.itFactory.exercitiu.model;

import java.util.Objects;

public class Persoana {

    private String nume;
    private TipPersoana tipPersoana;

    public Persoana(String nume, TipPersoana tipPersoana) {
        this.nume = nume;
        this.tipPersoana = tipPersoana;
    }

    public Persoana() {
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipPersoana getTipPersoana() {
        return tipPersoana;
    }

    public void setTipPersoana(TipPersoana tipPersoana) {
        this.tipPersoana = tipPersoana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume) && tipPersoana == persoana.tipPersoana;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, tipPersoana);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", tipPersoana=" + tipPersoana +
                '}';
    }
}
