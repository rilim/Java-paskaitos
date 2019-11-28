package com.company.knyga;
import com.company.leidinys.LeidinysImpl;

public class KnygaImpl extends LeidinysImpl implements Knyga{
    private String pavadinimas;
    private boolean arKietaisVirseliais;
    private String stilius;

    /*Klasės KnygaImpl konstruktorius.
    * Kadangi ši klasė išplečia klasę LeidinysImpl, tai konstruktoriuje nurodom ir tos klasės parametrus*/
    public KnygaImpl(String rusis, boolean periodinis, int puslapiuSkaicius, String pavadinimas,
                     boolean arKietaisVirseliais, String stilius){
        super(rusis, periodinis, puslapiuSkaicius);
        this.pavadinimas = pavadinimas;
        this.arKietaisVirseliais = arKietaisVirseliais;
        this.stilius = stilius;
    }

    @Override
    public String getPavadinimas() {
        return pavadinimas;
    }

    @Override
    public boolean getVirselioTipas() {
        return false;
    }

    @Override
    public String getStilius() {
        return stilius;
    }

    @Override
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public void setArKietaisVirseliais(boolean arKietaisVirseliais) {
        this.arKietaisVirseliais = arKietaisVirseliais;
    }

    @Override
    public void setStilius(String stilius) {
        this.stilius = stilius;
    }

    //naudojama super.toString(), nes yra papildomas bazinės klasės string'as
    public String toString(){
        return super.toString() + " Leidinio pavadinimas: " + pavadinimas + ", ar šis leidinys kietais viršeliais? "
                + arKietaisVirseliais + " Leidinio stilius: " + stilius;
    }
}
