package com.company.paslaugos;

import com.company.moketojas.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {

    private String ipAdresas;

    public InternetasImpl(String moketojoKodas, String vardas, String pavarde, String adresas, int suma, String ipAdresas){
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.ipAdresas = ipAdresas;
    }

    @Override
    public String getIpAdresas() {
        return ipAdresas;
    }

    @Override
    public void setIpAdresas(String ipAdresas) {
        this.ipAdresas = ipAdresas;
    }

    public String toString(){
        return super.toString() + ". Mokėtojo ip adresas: " + ipAdresas;
    }

}
