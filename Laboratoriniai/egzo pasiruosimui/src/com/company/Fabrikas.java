package com.company;

import java.util.Comparator;

public class Fabrikas implements IFabrikas, Comparable{
    private String darbininkas;
    private String detale;
    private int pagamintasKiekis;
    private double detalesKaina;

    public Fabrikas(String darbininkas, String detale, int pagamintasKiekis, double detalesKaina) {
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.pagamintasKiekis = pagamintasKiekis;
        this.detalesKaina = detalesKaina;
    }

    public String getDarbininkas() {
        return darbininkas;
    }

    public void setDarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;
    }

    public String getDetale() {
        return detale;
    }

    public void setDetale(String detale) {
        this.detale = detale;
    }

    public int getPagamintasKiekis() {
        return pagamintasKiekis;
    }

    public void setPagamintasKiekis(int pagamintasKiekis) {
        this.pagamintasKiekis = pagamintasKiekis;
    }

    public double getDetalesKaina() {
        return detalesKaina;
    }

    public void setDetalesKaina(double detalesKaina) {
        this.detalesKaina = detalesKaina;
    }

    @Override
    public String toString() {
        return  "darbininkas='" + darbininkas + '\'' +
                ", detale='" + detale + '\'' +
                ", pagamintasKiekis=" + pagamintasKiekis +
                ", detalesKaina=" + detalesKaina;
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Fabrikas::getPagamintasKiekis)
                .reversed()
                .thenComparing(Fabrikas::getDetale)
                .compare(this, (Fabrikas) o);
    }
}
