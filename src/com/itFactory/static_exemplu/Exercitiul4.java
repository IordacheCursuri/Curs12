package com.itFactory.static_exemplu;

public class Exercitiul4 {

    public static void main(String[] args) {


        System.out.println(Angajat.salariu);


        Angajat angajat1 = new Angajat("gigel", 25);

        System.out.println(angajat1.nume);
        System.out.println(angajat1.varsta);
        System.out.println(Angajat.salariu);

        Angajat angajat2 = new Angajat("ionel", 40);

        angajat2.salariu = 5000;

        System.out.println("*****************");
        System.out.println(angajat1.salariu + " : " + angajat1.nume);
        System.out.println(angajat2.salariu + " : " + angajat2.nume);
       // System.out.println(Angajat.salariu);

        System.out.println(Angajat.doSomething());

        System.out.println(angajat1.ceFace());
    }




}
