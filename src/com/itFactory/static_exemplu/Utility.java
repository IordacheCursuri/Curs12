package com.itFactory.static_exemplu;

public class Utility {

    public static final String ZIUA_MARTI = "MARTI";
    public static final String ZIUA_LUNI = "LUNI";


    public static double calculeazaSalariu(String ziSaptamana) {
        if(ziSaptamana.equals("MARTI")){
            return 5000;
        } else {
            return 0;
        }

    }



}
