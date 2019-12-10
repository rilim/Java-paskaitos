package com.company;
import com.company.automobilis.Automobilis;
import com.company.automobilis.AutomobilisImpl;
import com.company.transportas.TransportasImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Sukuriamas masyvas, kuriame bus saugomi sukurti objektai
        ArrayList<TransportasImpl> transportoPriemones = new ArrayList<TransportasImpl>();

        transportoPriemones.add(new AutomobilisImpl("Sausumos", true, 2011,
                240000, "BMW", 4, false));
        transportoPriemones.add(new AutomobilisImpl("Vandens", false, 1968,
                450, "Valtis", 0, false));
        transportoPriemones.add(new AutomobilisImpl("Oro", true, 1998,
                489000, "Boeing", 3, false));
        transportoPriemones.add(new AutomobilisImpl("Sausumos", true, 2016,
                186000, "Volvo", 4, false));
        transportoPriemones.add(new AutomobilisImpl("Oro", false, 2005,
                15000, "Sklandytuvas", 0, false));
        transportoPriemones.add(new AutomobilisImpl("Oro", true, 1999,
                367000, "MIG", 1, false));
        transportoPriemones.add(new AutomobilisImpl("Vandens", true, 2004,
                678000, "Laineris", 1000, true));
        transportoPriemones.add(new AutomobilisImpl("Sausumos", true, 2006,
                248683, "Audi", 4, false));
        transportoPriemones.add(new AutomobilisImpl("Sausumos", true, 2014,
                189873, "Tesla", 4, true));
        transportoPriemones.add(new AutomobilisImpl("Sausumos", true, 2010,
                640321, "traukinys", 20, true));

        //Atspausdinama objektų, esančių transportoPriemonės masyve, informacija
        for (int i = 0; i < transportoPriemones.size() ; i++) {
            System.out.println((i+1) + ". " + transportoPriemones.get(i));
        }

        /*Naudojant iteratorių (reikėjo importuoti iteratoriaus klasę), tikrinama ar rida daugiau kaip 500tūkst. ir jei
        taip, tai tas objektas pašalinamas iš masyvo*/
        for (Iterator<TransportasImpl> iter = transportoPriemones.iterator(); iter.hasNext(); ) {
            TransportasImpl i = iter.next();
            if (i.getRida() > 500000) {
                iter.remove();
            }
        }

        System.out.println("Sąrašas su pašalintais įrašais (rida daugiau kaip 500tūkst. km)");
        for (int i = 0; i < transportoPriemones.size() ; i++) {
            System.out.println((i+1) + ". " + transportoPriemones.get(i));
        }


    }
}
