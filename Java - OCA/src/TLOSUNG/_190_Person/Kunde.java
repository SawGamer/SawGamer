package TLOSUNG._190_Person;

public class Kunde extends Person{

    private String betreuer = "unbekannt";
    private int kundenNummer;

    Kunde(){

    }
    Kunde(String vorname, String nachname, int alter, int kundenNummer, String betreuer){
        super(vorname,nachname,alter);
        setBetreuer(betreuer);
        setKundenNummer(kundenNummer);
    }


    public String getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(String betreuer) {
        this.betreuer = betreuer;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }


    @Override public String toString(){
        return super.toString() +
                "Kundennummer:  " + getKundenNummer() + "\n" +
                "Betreuer:      " + getBetreuer() + "\n";
    }




}
