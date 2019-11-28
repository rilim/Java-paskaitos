import com.company.knyga.KnygaImpl;
import com.company.leidinys.LeidinysImpl;

public class Main {

    public static void main(String[] args) {

        KnygaImpl knyga1 = new KnygaImpl("Žurnalas", true, 56, "Trys paršiukai",
                false, "nuotykių");
        KnygaImpl knyga2 = new KnygaImpl("Knyga", false, 342, "Davinčio kodas",
                true, "grožinė");
        KnygaImpl knyga3 = new KnygaImpl("Knyga", false, 386, "Žmogus aukštoje pilyje",
                false, "fantastika");
        KnygaImpl knyga4 = new KnygaImpl("Laikraštis", true, 34, "Kažkokios žinios",
                false, "naujienos");
        KnygaImpl knyga5 = new KnygaImpl("Knyga", false, 812, "Karas ir taika",
                true, "grožinė");
        LeidinysImpl leidinys1 = new LeidinysImpl("Knyga", false, 387);
        LeidinysImpl leidinys2 = new LeidinysImpl("Laikraštis", true, 87);
        LeidinysImpl leidinys3 = new LeidinysImpl("Knyga", false, 281);
        LeidinysImpl leidinys4 = new LeidinysImpl("Žurnalas", true, 117);
        LeidinysImpl leidinys5 = new LeidinysImpl("Knyga", false, 273);

        /*Sukuriamas masyvas, kuriame bus saugomi sukurti objektai*/
        LeidinysImpl[] leidiniai = new LeidinysImpl[10];

        leidiniai[0] = knyga1;
        leidiniai[1] = knyga2;
        leidiniai[2] = knyga3;
        leidiniai[3] = knyga4;
        leidiniai[4] = knyga5;
        leidiniai[5] = leidinys1;
        leidiniai[6] = leidinys2;
        leidiniai[7] = leidinys3;
        leidiniai[8] = leidinys4;
        leidiniai[9] = leidinys5;

        for (LeidinysImpl i : leidiniai){ // pereinama per visus objektus esančius masyve leidiniai
            if (i instanceof KnygaImpl) { //atrenkami KnygaImpl objektai
                /*Kadangi masyvas LeidinysImpl tipo, tai norint naudoti KnygaImpl klasės metodus, reikia šiuos, rastus,
                 KnygaImpl objektus "konvertuoti" į KnygaImpl objektą*/
                KnygaImpl knyga = (KnygaImpl) i;
                String stilius = knyga.getStilius();
                if (stilius.equals("grožinė")) {
                    System.out.println(i);
                }
            }
        }

    }
}
