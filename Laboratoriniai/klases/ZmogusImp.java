package com.zmog;

public class ZmogusImp implements Zmogus {
    private String lytis;
    private long asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private int ugis;
    private String plaukuSpalva;

    public ZmogusImp (String lytis, long asmensKodas, String vardas, String pavarde, int amzius, int ugis, String plaukuSpalva) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    public String getLytis() {
        return lytis;
    }

    public long getAsmensKodas() {
        return asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public int getUgis() {
        return ugis;
    }

    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }

    public void setAsmensKodas(long asmensKodas){
        this.asmensKodas = asmensKodas;
    }

    public void setVardas(String vardas){
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }

    public void setAmzius(int amzius){
        this.amzius = amzius;
    }

    public void setUgis(int ugis){
        this.ugis = ugis;
    }

    public void setPlaukuSpalva(String plaukuSpalva){
        this.plaukuSpalva = plaukuSpalva;
    }


}
