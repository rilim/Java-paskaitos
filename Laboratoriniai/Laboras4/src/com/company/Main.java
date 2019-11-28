package com.company;
import com.company.automobilis.Automobilis;
import com.company.automobilis.AutomobilisImpl;
import com.company.transportas.TransportasImpl;

public class Main {

    public static void main(String[] args) {

        //Sukuriamas masyvas, kuriame bus saugomi sukurti objektai
        TransportasImpl[] transportoPriemones = new TransportasImpl[10];

        //Kuriami bazinės klasės objektai
        transportoPriemones[0] = new TransportasImpl("Sausumos", true, 2011);
        transportoPriemones[1] = new TransportasImpl("Oro", true, 1998);
        transportoPriemones[2] = new TransportasImpl("Vandens", false, 1968);
        transportoPriemones[3] = new TransportasImpl("Sausumos", true, 2016);
        transportoPriemones[4] = new TransportasImpl("Oro", false, 2005);

        //Kuriami išvestinės klasės objektai
        transportoPriemones[5] = new AutomobilisImpl("Oro", true, 1999, "MIG",
                1, true);
        transportoPriemones[6] = new AutomobilisImpl("Vandens", true, 2004,
                "Laineris", 1000, true);
        transportoPriemones[7] = new AutomobilisImpl("Sausumos", true, 2006,
                "Audi", 4, false);
        transportoPriemones[8] = new AutomobilisImpl("Sausumos", true, 2014,
                "Tesla", 4, true);
        transportoPriemones[9] = new AutomobilisImpl("Oro", false, 2018,
                "Lėktuvėlis", 0, false);

        //Šiame cikle atrenkami AutomobilisImpl objektai ir ieškoma, kuris iš jų yra varomas elektra
        for (TransportasImpl i : transportoPriemones){ // pereinama per visus objektus esančius masyve transportoPriemonės
            if (i instanceof AutomobilisImpl) { //atrenkami AutomobilisImpl objektai
                AutomobilisImpl transportoPriemone = (AutomobilisImpl) i;
                boolean arVaromaElektra = transportoPriemone.getArVaromasElektra();
                if (arVaromaElektra) {
                    System.out.println(i);
                }
            }
        }


    }
}
