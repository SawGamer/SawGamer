package TLOSUNG._320_PersonenSortieren;


public class Mitarbeiter extends Person {

    private String abteilung;
    private int mitarbeiterNummer;

    protected Mitarbeiter(){
        super();
    }

    public Mitarbeiter(String nachname, String vorname, int alter) {
        super(nachname, vorname, alter);
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public int getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public void setMitarbeiterNummer(int mitarbeiterNummer) {
        this.mitarbeiterNummer = mitarbeiterNummer;
    }


    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "abteilung='" + abteilung + '\'' +
                ", mitarbeiterNummer=" + mitarbeiterNummer +
                '}' + super.toString();
    }
}
