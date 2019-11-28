package com.company.paslaugos;
import com.company.moketojas.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {

    private int kubai;

    public SildymasImpl(String moketojoKodas, String vardas, String pavarde, String adresas, int suma, int kubai){
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.kubai = kubai;
    }

    @Override
    public int getKubai() {
        return kubai;
    }

    @Override
    public void setKubai(int kubai) {
        this.kubai = kubai;
    }

    public String toString(){
        return super.toString() + ". Mokėtojo sunaudoti kubai šildymui: " + kubai;
    }
}
