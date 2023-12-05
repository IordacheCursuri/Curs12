package com.itFactory.enum_exemplu;

import java.time.LocalDate;
import java.util.Objects;

public class Calatorie {

    private LocalDate dataPlecare;
    private Zile ziPlecare;

    private String ziSosire;


    public Calatorie(LocalDate dataPlecare, Zile ziPlecare) {
        this.dataPlecare = dataPlecare;
        this.ziPlecare = ziPlecare;
    }

    public Calatorie() {
    }

    public String getZiSosire() {
        return ziSosire;
    }

    public void setZiSosire(String ziSosire) {
        this.ziSosire = ziSosire;
    }

    public LocalDate getDataPlecare() {
        return dataPlecare;
    }

    public void setDataPlecare(LocalDate dataPlecare) {
        this.dataPlecare = dataPlecare;
    }

    public Zile getZiPlecare() {
        return ziPlecare;
    }

    public void setZiPlecare(Zile ziPlecare) {
        this.ziPlecare = ziPlecare;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calatorie calatorie = (Calatorie) o;
        return Objects.equals(dataPlecare, calatorie.dataPlecare) && ziPlecare == calatorie.ziPlecare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPlecare, ziPlecare);
    }


    @Override
    public String toString() {
        return "Calatorie{" +
                "dataPlecare=" + dataPlecare +
                ", ziPlecare=" + ziPlecare +
                ", ziSosire='" + ziSosire + '\'' +
                '}';
    }
}
