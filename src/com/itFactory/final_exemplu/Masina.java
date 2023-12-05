package com.itFactory.final_exemplu;

public class Masina extends Automobil{

  //  private final String constructor= "Dacia";

    private final String constructor;


    public Masina(String constructor) {
        this.constructor = constructor;
    }


//    public Masina() {
//    }

    public String getConstructor() {
        return constructor;
    }


    @Override
    public void merge() {
        System.out.println("masina merge foarte repede");
    }
}
