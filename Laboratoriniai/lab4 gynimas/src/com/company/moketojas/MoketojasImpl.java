package com.company.moketojas;

public class MoketojasImpl implements Moketojas{

    private String moketojoKodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private int suma;

    public MoketojasImpl (String moketojoKodas, String vardas, String pavarde, String adresas, int suma){
        this.moketojoKodas = moketojoKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    public String getMoketojoKodas() {
        return moketojoKodas;
    }

    @Override
    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    @Override
    public String getAdresas() {
        return adresas;
    }

    @Override
    public int getSuma() {
        return suma;
    }

    public void setMoketojoKodas(String moketojosKodas) {
        this.moketojoKodas = moketojosKodas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    @Override
    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String toString(){
        return "Mokėtojo kodas: " + moketojoKodas + ", mokėtojo vardas: " + vardas + ", pavardė: " + pavarde +
                ". Mokėtojas gyvena adresu: " + adresas + ". Jo mokėtina suma yra: " + suma;
    }
}
