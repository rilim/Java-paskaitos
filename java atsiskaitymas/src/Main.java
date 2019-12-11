import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Sukuriamas balsuotojų sąrašas
        ArrayList<BalsuotojasImpl> balsuotojai = new ArrayList<BalsuotojasImpl>();

        balsuotojai.add(new BalsuotojasImpl("Kazys", "Binkis", 1954, "Grybų",
                "lietuvis"));
        balsuotojai.add(new BalsuotojasImpl("Jarekas", "XWiczcekas", 1962, "Grybų",
                "lenkas"));
        balsuotojai.add(new BalsuotojasImpl("Vladimir", "Petkin", 1948, "NovaVilnia",
                "rusas"));
        balsuotojai.add(new BalsuotojasImpl("Artūras", "Litovcas", 1979, "Dainavos",
                "lietuvis"));
        balsuotojai.add(new BalsuotojasImpl("Jonas", "Kamienas", 1986, "Dainavos",
                "lietuvis"));
        balsuotojai.add(new BalsuotojasImpl("Večiaslavas", "Lenkovskis", 1965, "NovaVilnia",
                "lenkas"));
        balsuotojai.add(new BalsuotojasImpl("Lenkis", "Tomaševskij", 1968, "Grybų",
                "lenkas"));
        balsuotojai.add(new BalsuotojasImpl("Petia", "Medvedis", 1961, "NovaVilnia",
                "rusas"));
        balsuotojai.add(new BalsuotojasImpl("Dainius", "Kaunelis", 1992, "Dainavos",
                "lietuvis"));
        balsuotojai.add(new BalsuotojasImpl("Marytė", "Blond", 1987, "Dainavos",
                "lietuvis"));

        //Išvedama informacija apie balsuotojus esančius sąraše balsuotojai
        for (BalsuotojasImpl i : balsuotojai){
            System.out.println(i); //Atspausdinamas rūšiuotas sąrašas
        }

        bruksniuoti();

        //Sukuriamas skaneris vartotojui pasirinkti apygardą
        Scanner S = new Scanner(System.in);
        System.out.println("Pasirinkite apygardą: įrašykite 1, jei norit pasirinkti \"Grybų\" apygardą," +
                "įrašykite 2, jei norite pasirinkti \"NovaVilnia\" apygardą ir " +
                "įrašykit 3, jei norite pasirinkti \"Dainavos\" apygardą: ");

        //Kintamasis nuo kurio priklauso ar bus tęsiamas while ciklas
        boolean arNeteisingaiPasirinkta = true;


        /*Vartotojas, kaip nurodyta, įveda pasirinkimą nuo 1 iki 3 norėdamas pasirinkti atitinkamą apygardą.
        Tačiau, jei per klaidą įveda didesnį skaičių ar kitokius simbolius, jis paprašomas dar kartą įvesti savo pasirinkimą*/
        while (arNeteisingaiPasirinkta) {
            try {
                int pasirinkimas = S.nextInt();
                if (pasirinkimas == 1) {
                    int apygardosbalsuotoju = gautiApygardosBalsuotojus(balsuotojai, "Grybų");
                    System.out.println("Grybų apygardoje yra " + apygardosbalsuotoju + " balsuotojai/-ų");
                    bruksniuoti();
                    //Kintamąjam priskiriama false reikšmė, t.y. vartotojas įvedė teisingą pasirinkimą, todėl ciklo kartoti nereikės
                    arNeteisingaiPasirinkta = false;
                } else if (pasirinkimas == 2) {
                    int apygardosbalsuotoju = gautiApygardosBalsuotojus(balsuotojai, "NovaVilnia");
                    System.out.println("NovaVilnia apygardoje yra " + apygardosbalsuotoju + " balsuotojai/-ų");
                    bruksniuoti();
                    arNeteisingaiPasirinkta = false;
                } else if (pasirinkimas == 3) {
                    int apygardosbalsuotoju = gautiApygardosBalsuotojus(balsuotojai, "Dainavos");
                    System.out.println("Dainavos apygardoje yra " + apygardosbalsuotoju + " balsuotojai/-ų");
                    bruksniuoti();
                    arNeteisingaiPasirinkta = false;
                } else {
                    arNeteisingaiPasirinkta = true;
                    System.out.println("Įvestas neteisingas pasirinkimas, veskite tik skaičius nuo 1 iki 3");
                }
            } catch (Exception e) { //"Pagaunamas" neteisingas pasirinkimas, jei pvz, įvedė simbolį/-ius vietoj skaičiaus
                System.out.println("Veskite TIK skaičius nuo 1 iki 3");
                    S.next(); // Panaikina skanerio blogą pasirinkimą
                    continue; // kartojamas ciklas, jei rastas įvedimo neatitikimas
            }
        }


        System.out.println("Surūšiuotas sąrašas: ");
        Collections.sort(balsuotojai); //Surūšiuojamas sąrašas
        for (BalsuotojasImpl i : balsuotojai){
            System.out.println(i); //Atspausdinamas rūšiuotas sąrašas
        }

        bruksniuoti();

        /*Naudojant iteratorių (reikėjo importuoti iteratoriaus klasę), tikrinama kuris balsuotojas yra lenkas,
        ir tuomet toks objektas šalinamas iš sąrašo*/
        System.out.println("Sąrašas be lenkų balsuotojų:");
        for (Iterator<BalsuotojasImpl> iter = balsuotojai.iterator(); iter.hasNext(); ) {
            BalsuotojasImpl i = iter.next();
            if (i.getTautybe().equals("lenkas")) {
                iter.remove();
            }
        }

        /*Atspausdinamas masyvas po objektų pašalinimo*/
        for (BalsuotojasImpl i : balsuotojai){
            System.out.println(i);
        }

    }

    /**
     * Funkcija apskaičiuojanti apygargos balsuotojų skaičių
     * @param array main funkcijoje sukurtas balsuotojų sąrašas
     * @param apygarda main funkcijoje, vartotojo įvestas apygardos pasirinkimas
     * @return balsuotojų skaičius apygardoje (int)
     */
    public static int gautiApygardosBalsuotojus(ArrayList<BalsuotojasImpl> array, String apygarda){
        int balsuotoju = 0;
        for (BalsuotojasImpl i : array) {
            if (i.getApygarda().equals(apygarda)){
                balsuotoju += 1;
            }
        }
        return balsuotoju;
    }


    /**
     * Funkcija, kuri atspausdina brūkšnelius, padedančius išskirti kitą spausdinamą tekstą
     */
    public static void bruksniuoti(){
        System.out.println("-----------------------");
    }

}
