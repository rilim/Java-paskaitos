package com.company.paslaugos;
import com.company.moketojas.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements Telefonas{

    private String telefonoNumeris;

    public TelefonasImpl(String moketojoKodas, String vardas, String pavarde, String adresas, int suma, String telefonoNumeris){
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.telefonoNumeris = telefonoNumeris;
    }

    @Override
    public String getTelefonoNumeris() {
        return telefonoNumeris;
    }

    @Override
    public void setTelefonoNumeris(String telefonoNumeris) {
        this.telefonoNumeris = telefonoNumeris;
    }

    public String toString(){
        return super.toString() + ". Mokėtojo telefono numeris: " + telefonoNumeris;
    }
}
