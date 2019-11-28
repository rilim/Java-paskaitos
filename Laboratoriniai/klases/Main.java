package com.zmog;

public class Main {

    public static void main(String[] args) {
        Zmogus zmog1 = new ZmogusImp("vyr", 44012250237L,"Petras","Petraitis", 25, 180,"juoda");
        Zmogus zmog2 = new ZmogusImp("mot", 47856230459L, "Laima", "Vaikulė", 45, 160,"juoda");
        Zmogus zmog3 = new ZmogusImp("mot", 47612363615L, "Ona", "Onaitienė", 33, 175,"geltona");
        Zmogus zmog4 = new ZmogusImp("mot",47989452125L,"Vilma","Kazlauskė", 55, 173,"raudona");
        Zmogus zmog5 = new ZmogusImp("vyt",54621236262L, "Kazys", "Kazlauskas",42,187,"pilka");
        Zmogus zmog6 = new ZmogusImp("vyr", 47845124578L, "Laimonas","Karalius",35,177,"ruda");

        System.out.print("Būdama" + " " + zmog2.getAmzius() + " " + zmog2.getVardas() + " " + "nusprendė persidažyti plaukų spalvą, nes visada buvo " + zmog2.getPlaukuSpalva() + ". " );
        zmog2.setPlaukuSpalva("geltona");
        System.out.println("Plaukų spalvą ji pakeitė į " + zmog2.getPlaukuSpalva() + ".");

        System.out.print("Prieš 10 metų" + " " + zmog5.getVardas() + " " + zmog5.getPavarde() + " buvo " + zmog5.getAmzius() + " darber jam ");
        zmog5.setAmzius(52);
        System.out.println(zmog5.getAmzius() + ".");
        System.out.println(zmog1.getAsmensKodas());
    }
}
