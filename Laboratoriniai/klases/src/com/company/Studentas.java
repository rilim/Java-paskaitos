package com.company;

public class Studentas {

    private int id;
    private String vardas;
    private String pavarde;
    private String grupe;

    /*Klasės "Studentas" konstruktorius*/
    public Studentas(int id, String vardas, String pavarde, String grupe) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.grupe = grupe;
    }

    /*gewteriai*/
    public int getId() {
        return id;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getGrupe() {
        return grupe;
    }

    /*seteriai*/
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public void ieskotiPagalId(int id){
        if (this.id == id) {
            System.out.println("Studento, kurio id: " + id + "vardas yra: " + vardas);
        }

    }

}
