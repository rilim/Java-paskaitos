package com.company.knyga;

public interface Knyga {
    String getPavadinimas();
    boolean getVirselioTipas();
    String getStilius();
    void setPavadinimas(String pavadinimas);
    void setArKietaisVirseliais(boolean arKietaisVirseliais);
    void setStilius(String stilius);

}
