package com.company.automobilis;
import com.company.transportas.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {
    String automobilioMarke;
    int duruSkaicius;
    boolean arVaromasElektra;

    //Klasės AutomobilisImpl konstruktorius
    public AutomobilisImpl(String transportoTipas, boolean arYraVariklis, int pagaminimoMetai, String automobilioMarke,
                           int duruSkaicius, boolean arVaromasElektra){
        super(transportoTipas, arYraVariklis, pagaminimoMetai);
        this.automobilioMarke = automobilioMarke;
        this.duruSkaicius = duruSkaicius;
        this.arVaromasElektra = arVaromasElektra;
    }

    //Klasės get'eriai
    public String getAutomobilioMarke() {
        return automobilioMarke;
    }

    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    public boolean getArVaromasElektra(){
        return arVaromasElektra;
    }

    //Klasės set'eriai
    public void setAutomobilioMarke(String automobilioMarke) {
        this.automobilioMarke = automobilioMarke;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public void setArVaromasElektra(boolean arVaromasElektra) {
        this.arVaromasElektra = arVaromasElektra;
    }

    public String toString(){
        return super.toString() + " Automobilio markė: " + automobilioMarke + ", šis automobilis turi " + duruSkaicius + " duris"
                + ". Ar šis automobilis varomas elektra? " + arVaromasElektra;
    }

}
