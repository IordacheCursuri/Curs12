package com.itFactory.enum_exemplu;

public enum Zile {

    LUNI("luni"),
    MARTI("marti"),
    MIERCURI("miercuri"),
    JOI("joi"),
    VINERI("vineri"),
    SAMBATA("sambata"),
    DUMINICA("duminica");




    private String zi;

    Zile(String zi) {
        this.zi = zi;
    }

    public String getZi() {
        return zi;
    }

}
