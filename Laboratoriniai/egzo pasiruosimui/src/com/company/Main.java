package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Fabrikas> cechas = new ArrayList<Fabrikas>();

        cechas.add(new Fabrikas("Jonas", "ekranas", 211, 150));
        cechas.add(new Fabrikas("Jarekas", "ekranas", 89, 150));
        cechas.add(new Fabrikas("Artūras", "baterija", 211, 26));
        cechas.add(new Fabrikas("Laimis", "ekranas", 219, 150));
        cechas.add(new Fabrikas("Vytautas", "ekranas", 104, 150));
        cechas.add(new Fabrikas("LongMu", "baterija", 489, 26));
        cechas.add(new Fabrikas("Marytė", "baterija", 311, 26));
        cechas.add(new Fabrikas("Gintaras", "ekranas", 289, 150));
        cechas.add(new Fabrikas("Nerijus", "baterija", 468, 26));
        cechas.add(new Fabrikas("Inga", "ekranas", 68, 150));


        int ekranuKiekis = 0;
        double ekranoKaina = 0;
        int baterijuKiekis = 0;
        double baterijosKaina = 0;
        /*Šiame cikle apskaičiuojamas detalių (ekranų ir baterijų) kiekis bei paimama šių detalių kaina, kuri išsaugoma
        į paprastus kintamuosius*/
        for (Fabrikas i : cechas) {
            if (i.getDetale().equals("ekranas")){
                ekranuKiekis += i.getPagamintasKiekis();
                ekranoKaina = i.getDetalesKaina();
            } else {
                baterijuKiekis += i.getPagamintasKiekis();
                baterijosKaina = i.getDetalesKaina();
            }
        }

        /*Atspausdinama detalių informacija: kiekis ir apskaičiuota suma*/
        System.out.println("Ekranų kiekis: " + ekranuKiekis + ". Suma: " + (ekranuKiekis * ekranoKaina));
        System.out.println("Baterijų kiekis: " + baterijuKiekis + ". Suma: " + (baterijuKiekis * baterijosKaina));

        System.out.println("Surūšiuotas sąrašas: ");
        Collections.sort(cechas); //Surūšiuojamas sąrašas
        for (Fabrikas i : cechas){
            System.out.println(i); //Atspausdinamas rūšiuotas sąrašas
        }

        /*Atspausdinami masvyo objektai su normos informacija*/
        for (Fabrikas i : cechas){
            if (ekranuKiekis > 1000 & i.getDetale().equals("ekranas")){
                System.out.println(i + " - Norma Įvykdyta");
            } else if (baterijuKiekis > 1000 & i.getDetale().equals("baterija")){
                System.out.println(i + " - Norma Įvykdyta");
            } else {
                System.out.println(i + " - Norma NEįvykdyta");
            }
        }

        /*Naudojant iteratorių (reikėjo importuoti iteratoriaus klasę), tikrinama kurios detalės kaina didesnė nei 100,
        ir tuomet toks objektas šalinamas iš masyvo*/
        for (Iterator<Fabrikas> iter = cechas.iterator(); iter.hasNext(); ) {
            Fabrikas i = iter.next();
            if (i.getDetalesKaina() > 100) {
                iter.remove();
            }
        }

        /*Atspausdinamas masyvas po objektų pašalinimo*/
        for (Fabrikas i : cechas){
            System.out.println(i);
        }


    }
}
