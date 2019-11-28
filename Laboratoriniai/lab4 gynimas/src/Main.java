package com.company;
import com.company.moketojas.MoketojasImpl;
import com.company.paslaugos.InternetasImpl;
import com.company.paslaugos.SildymasImpl;
import com.company.paslaugos.TelefonasImpl;

public class Main {

    public static void main (String[ ]args){

        MoketojasImpl[] moketojai = new MoketojasImpl[12];

        moketojai[0] = new MoketojasImpl("123456", "Petras", "Kazlauskas", "Grybų g. 16, Kaunas",
                160);
        moketojai[1] = new MoketojasImpl("654982", "Kazys", "Binkis", "Poetų g. 1, Kažkoks kaimas",
                56);
        moketojai[2] = new MoketojasImpl("5644894", "Algis", "Ramanauskas", "Juokdarių g. 16, Vilnius",
                87);
        moketojai[3] = new TelefonasImpl("643214", "Vardauskas", "Pavardauskas", "Kažkur g. 111, Miestas",
                92, "+37011112345");
        moketojai[4] = new TelefonasImpl("654564", "Laimis", "Raudenis", "Energetikų g. 14",
                64, "+37066611122");
        moketojai[5] = new TelefonasImpl("324564564", "Teleponijus", "Ryšelis", "Telekomo g. 13",
                24, "+37099998765");
        moketojai[6] = new InternetasImpl("111222", "Hakeris", "Baltasis", "Nežinios g. 0, kažkur",
                1, "1.1.1.1");
        moketojai[7] = new InternetasImpl("654456", "Lameris", "Pavardukas", "Interneto g. 5, kompas",
                16, "12.35.65.8");
        moketojai[8] = new InternetasImpl("5555", "Jonas", "Nežinau", "Bandytojų g. 3, Kaunas",
                29, "54.68.125.2");
        moketojai[9] = new SildymasImpl("45454", "Šilumijus", "Šaltenis", "Karščio g. 66, Saulė",
                132, 45);
        moketojai[10] = new SildymasImpl("56445", "Rimas", "Šalna", "Morkų g. 46, Alytus",
                34, 6);
        moketojai[11] = new SildymasImpl("6546546", "Antanas", "Šaltarankis", "Anykščių šilelis",
                78, 26);

        int bendraSumaTelefonas = 0;
        int bendraSumaInternetas = 0;
        for (MoketojasImpl moketojas : moketojai){
            if (moketojas instanceof TelefonasImpl) {
                TelefonasImpl telNaudotojas = (TelefonasImpl) moketojas;
                bendraSumaTelefonas += telNaudotojas.getSuma();
            }else if (moketojas instanceof InternetasImpl){
                InternetasImpl internetoNaudotojas = (InternetasImpl) moketojas;
                bendraSumaInternetas += internetoNaudotojas.getSuma();
            }
        }
        System.out.println("Bendra suma už telefoną: " + bendraSumaTelefonas + ". Bendra suma už internetą: "
                + bendraSumaInternetas);

    }
}





