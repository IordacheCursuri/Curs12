package com.itFactory.enum_exemplu;

import java.time.LocalDate;

public class Exemplu3 {

    public static void main(String[] args) {

        Calatorie calatorie = new Calatorie(LocalDate.now().plusMonths(10), Zile.LUNI);
        calatorie.setZiSosire(Zile.DUMINICA.getZi());


        System.out.println(calatorie);




    }


}
