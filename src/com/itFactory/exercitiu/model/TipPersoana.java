package com.itFactory.exercitiu.model;

public enum TipPersoana {

    PACIENT("pacient"),
    ASISTENT("asistent"),
    MEDIC("medic");


    private String tip;

    TipPersoana(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }
}
