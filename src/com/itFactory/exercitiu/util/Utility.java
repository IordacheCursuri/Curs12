package com.itFactory.exercitiu.util;

import com.itFactory.exercitiu.PreaMultiMediciException;
import com.itFactory.exercitiu.model.Persoana;
import com.itFactory.exercitiu.model.TipPersoana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utility {

    public static List<Persoana> filtreazaPersoanele(List<Persoana> listaPersoane, TipPersoana tipPersoana){

//        List<Persoana> listaFiltrata = listaPersoane.stream()
//                .filter(persoana -> persoana.getTipPersoana().equals(tipPersoana))
//                .collect(Collectors.toList());
//
//        return listaFiltrata;

        //filter
        //map
        //forEach
        //collect

        List<Persoana> listaFiltrata = new ArrayList<>();

        for(Persoana persoana : listaPersoane) {
            if(persoana.getTipPersoana().equals(tipPersoana)) {
                listaFiltrata.add(persoana);
            }
        }

        return listaFiltrata;

    }


    public static List<Persoana> adaugaPersoana(List<Persoana> persoanaList, Persoana persoana) {

        List<Persoana> medici = filtreazaPersoanele(persoanaList, TipPersoana.MEDIC);
        List<Persoana> asistenti = filtreazaPersoanele(persoanaList, TipPersoana.ASISTENT);
        List<Persoana> pacienti = filtreazaPersoanele(persoanaList, TipPersoana.PACIENT);


        if(persoana.getTipPersoana().equals(TipPersoana.MEDIC)){
            if(medici.size() >= 3) {
                throw new PreaMultiMediciException("Numarul de medici este de 3 sau mai mare ca 3. Nu putem adauga alt medic");
            } else {
                persoanaList.add(persoana);
            }
        }

        return persoanaList;

    }

}
