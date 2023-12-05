package com.itFactory.exercitiu.main;

import com.itFactory.exercitiu.model.Persoana;
import com.itFactory.exercitiu.model.TipPersoana;
import com.itFactory.exercitiu.util.Utility;

import java.util.ArrayList;
import java.util.List;

public class Tema {

    public static void main(String[] args) {

        Persoana persoana1 = new Persoana("Ioana", TipPersoana.MEDIC);
        Persoana persoana2 = new Persoana("Gigel", TipPersoana.PACIENT);
        Persoana persoana3 = new Persoana("Ionel", TipPersoana.ASISTENT);
        Persoana persoana4 = new Persoana("Ana", TipPersoana.MEDIC);
        Persoana persoana5 = new Persoana("Marcel", TipPersoana.PACIENT);
        Persoana persoana6 = new Persoana("Vasile", TipPersoana.ASISTENT);


        List<Persoana> persoanaList = new ArrayList<>();
        persoanaList.add(persoana1);
        persoanaList.add(persoana2);
        persoanaList.add(persoana3);
        persoanaList.add(persoana4);
        persoanaList.add(persoana5);
        persoanaList.add(persoana6);

        List<Persoana> listaFiltrata = Utility.filtreazaPersoanele(persoanaList, TipPersoana.MEDIC);

        System.out.println(listaFiltrata);


        Persoana persoana7 = new Persoana("Anghel", TipPersoana.MEDIC);
        Persoana persoana8 = new Persoana("Andrei", TipPersoana.MEDIC);


        List<Persoana> persoaneAdaugate = Utility.adaugaPersoana(persoanaList, persoana7);
        System.out.println("------------------------------------------------------");
        List<Persoana> persoaneAdaugate2 = Utility.adaugaPersoana(persoanaList, persoana8);


        System.out.println("************************");
        System.out.println(persoaneAdaugate2);





    }


}
