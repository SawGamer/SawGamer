package TLOSUNG._260_Girokonto;

public class Girokonto extends Konto{
    double limit;

    public Girokonto(String kontonummer, double kontostand, double limit){
        super(kontonummer, kontostand);
        setLimit(limit);
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void auszahlen(double betrag) {
        if (betrag <= super.getKontostand() + getLimit())
            super.auszahlen(betrag);
        else System.out.println("Unzureichendes Guthaaben");
    }
}
