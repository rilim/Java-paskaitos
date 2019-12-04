import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    /*
    Sukurti 10 statybininko objektų ir sudėti juos į pasirinktą masyvą:
        - atspausdinti (naudojant iteratorius ir paprastai) vartotojui į ekraną informaciją apie statybininkus;
        - pašalinti iš masyvo statybinikus, kurie turi mažiau negu 4m stažo;
        - surūšiuoti statybinkus pagal atlyginimą;
        - surūšiuoti statybinkus pagal vardą;
        - spausdinti masyvą prieš pakeitimus ir po.
     */

    public static void main(String[] args) {
        Statybininkas Simas = new Statybininkas("Simas", "KITM", 5, 500);
        Statybininkas Tomas = new Statybininkas("Tomas", "KITM", 2, 200);
        Statybininkas Dovydas = new Statybininkas("Dovydas", "KITM", 10, 500);
        Statybininkas Justas = new Statybininkas("Justas", "KITM", 15, 100);
        Statybininkas Arnoldas = new Statybininkas("Arnoldas", "KITM", 1, 550);
        Statybininkas Petras = new Statybininkas("Petras", "KITM", 6, 500);
        Statybininkas Lukas = new Statybininkas("Lukas", "KITM", 8, 150);
        Statybininkas Ieva = new Statybininkas("Ieva", "KITM", 5, 500);
        Statybininkas Migle = new Statybininkas("Migle", "KITM", 5, 800);

        ArrayList<Statybininkas> statybininkai = new ArrayList<Statybininkas>();
        statybininkai.add(Simas);
        statybininkai.add(Tomas);
        statybininkai.add(Dovydas);
        statybininkai.add(Justas);
        statybininkai.add(Arnoldas);
        statybininkai.add(Petras);
        statybininkai.add(Lukas);
        statybininkai.add(Ieva);
        statybininkai.add(Migle);

        Iterator<Statybininkas> i = statybininkai.iterator();
        while (i.hasNext()) {
            if (i.next().getStazas() < 4)
                i.remove();
        }
        System.out.println("Sarasas su pasalintais darbuotojais (stazas maziau nei 4m)");
        System.out.println(statybininkai);

        System.out.println("Rikiuotas sarasas pagal atlyginima: ");
        Collections.sort(statybininkai);
        System.out.print(statybininkai);
    }


}