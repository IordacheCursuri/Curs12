package com.itFactory.static_exemplu;

public class Angajat {

    String nume;
    int varsta;
    static double salariu = 4000;

    //bloc static anonim -> se va executa inaintea constructorului
    static {
        System.out.println("am facut ceva!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }


    public Angajat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String ceFace() {
        return "angajatul nu face nimic!!!";
    }


    public static String doSomething() {
        return "Angajatul face ceva!!";
    }



}
