import java.util.Comparator;

public class BalsuotojasImpl implements Balsuotojas, Comparable{

    //Klasės BalsuotojasImpl kintamieji
    private String vardas;
    private String pavarde;
    private int gimimoMetai;
    private String apygarda;
    private String tautybe;

    //Klasės konstruktorius
    public BalsuotojasImpl(String vardas, String pavarde, int gimimoMetai, String apygarda, String tautybe) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
        this.apygarda = apygarda;
        this.tautybe = tautybe;
    }

    //Get'eriai ir set'eriai
    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(int gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    public String getApygarda() {
        return apygarda;
    }

    public void setApygarda(String apygarda) {
        this.apygarda = apygarda;
    }

    public String getTautybe() {
        return tautybe;
    }

    public void setTautybe(String tautybe) {
        this.tautybe = tautybe;
    }

    @Override
    public String toString() {
        return "Balsuotojas: " +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", gimimoMetai=" + gimimoMetai +
                ", apygarda='" + apygarda + '\'' +
                ", tautybe='" + tautybe + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(BalsuotojasImpl::getGimimoMetai)
                .compare(this, (BalsuotojasImpl) o);
    }
}
