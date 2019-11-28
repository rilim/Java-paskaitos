package com.company.transportas;

public class TransportasImpl implements Transportas{
    private String transportoTipas;
    boolean arYraVariklis;
    int pagaminimoMetai;

    //Klasės TransportasImpl konstruktorius
    public TransportasImpl(String transportoTipas, boolean arYraVariklis, int pagaminimoMetai){
        this.transportoTipas = transportoTipas;
        this.arYraVariklis = arYraVariklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    //Klasės get'eriai
    public String getTransportoTipas() {
        return transportoTipas;
    }

    public boolean getArYraVariklis() {
        return arYraVariklis;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    //Klasės set'eriai
    public void setTransportoTipas(String transportoTipas) {
        this.transportoTipas = transportoTipas;
    }

    public void setArYraVariklis(boolean arYraVariklis) {
        this.arYraVariklis = arYraVariklis;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public String toString(){
        return "Transporto tipas: " + transportoTipas + ", ar šis transportas turi variklį? " + arYraVariklis + ". " +
                "Ši transporto priemonė pagaminta: " + pagaminimoMetai;
    }
}
