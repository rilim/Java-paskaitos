package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //int id, String vardas, String pavarde, String grupe
        Studentas stud = new Studentas(1, "James", "Bond", "007");
        System.out.println(stud.getVardas() + " prieš pakeitimą, turėjo pavardę " + stud.getPavarde());
        stud.setPavarde("JamesBond");
        System.out.println("Po pakeitimo " + stud.getVardas() + " pavardė yra " + stud.getPavarde());

        Studentas stud2 = new Studentas(2, "Vardauskas", "Pavardauskas", "as123");
        System.out.println("Antro sutdento grupė prieš pakeitimą: " +stud2.getGrupe());
        stud2.setGrupe("T-100");
        System.out.println("Antro sutdento grupė po pakeitimo: " +stud2.getGrupe());

        Scanner s = new Scanner(System.in);
        ieskotiPagalId(s);
    }
}
