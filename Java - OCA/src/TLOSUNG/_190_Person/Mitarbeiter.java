package TLOSUNG._190_Person;

public class Mitarbeiter extends Person{
    private String abteilung = "unbekannt";
    private int mitarbeiterNummer;

    Mitarbeiter(){

    }
    Mitarbeiter(String vorname, String nachname, int alter, int mitarbeiterNummer, String abteilung){
        super(vorname,nachname,alter);
        setAbteilung(abteilung);
        setMitarbeiterNummer(mitarbeiterNummer);
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

    @Override public String toString(){
        return super.toString() +
                "MitarbeiterNr: " + getMitarbeiterNummer() + "\n" +
                "Abteilung:     " + getAbteilung() + "\n";
    }

}
