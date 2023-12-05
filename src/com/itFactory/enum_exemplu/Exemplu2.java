package com.itFactory.enum_exemplu;

public class Exemplu2 {

    public static void main(String[] args) {

        System.out.println(Zile.VINERI);
        System.out.println(Zile.VINERI.getZi());

        doSomething(Zile.JOI);

        for (Zile zi: Zile.values()){
            System.out.println(zi.ordinal() + " : " + zi.name() + " : " + zi.getZi());

        }



    }


    public static void doSomething(Zile ziua){
        if(Zile.JOI.equals(ziua)){
            System.out.println("azi este " + Zile.JOI.getZi());

        }


    }




}
