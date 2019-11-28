package com.company.leidinys;

public class LeidinysImpl implements Leidinys{
    private String rusis;
    private boolean periodinis;
    private int puslapiuSkaicius;

    //Klasės LeidinysImpl konstruktorius
    public LeidinysImpl(String rusis, boolean periodinis, int puslapiuSkaicius){
        this.rusis = rusis;
        this.periodinis = periodinis;
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    @Override
    public String getRusis() {
        return rusis;
    }

    @Override
    public boolean getPeriodinis() {
        return false;
    }

    @Override
    public int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    @Override
    public void setRusis(String rusis) {
        this.rusis = rusis;
    }

    @Override
    public void setPeriodinis(boolean periodinis) {
        this.periodinis = periodinis;
    }

    @Override
    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public String toString(){
        return "Leidinio rūšis: " + rusis + ", ar šis leidinys yra periodinis? " + periodinis + " Puslapių skaičius: " + puslapiuSkaicius;
    }
}
