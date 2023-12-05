package com.itFactory.enum_exemplu;

public class Exemplu1 {

    public static void main(String[] args) {

        System.out.println(LunileAnului.APRILIE);


        for (LunileAnului luna: LunileAnului.values()){
            System.out.println(luna.ordinal() + " : " + luna.name());

        }

        System.out.println(LunileAnului.valueOf("FEBRUARIE"));



    }

}
