package TLOSUNG._130_EigeneKlasse._130_EigeneKlasse;
import java.text.DecimalFormat;

public class Headset {

    static int counter;
    private String hersteller;
    private String modell;
    private double preis;

    DecimalFormat f = new DecimalFormat("##.##");


    Headset(){
        this("Logitech", "A 00067 'GFN-Headset'", 69.99);
    }

    Headset(String hersteller){
        this(hersteller, "Cloud II", 66.18);
    }

    Headset(String hersteller, String modell){
        this(hersteller, modell, 82.99);
    }
    
    Headset(double preis){
        this("Logitech", "Pro X", preis);
    }





    Headset(String hersteller, String modell, double preis) {
        this.hersteller = hersteller;
        this.modell = modell; 
        this.preis = preis;
        System.out.println("Es wurde ein neues Headset hinzugefügt!");
        Headset.counter++;
    }


    // getter und setter 

    public String getHersteller(){
        return this.hersteller;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
        System.out.println("Hersteller wurde geändert!");
    }

    public String getModell(){
        return this.modell;
    }

    public void setModell(String modell){
        this.modell = modell;
        System.out.println("Modell wurde geändert!");
    }

    public double getPreis(){
        return this.preis;
    }

    public void setPreis(double preis){
        this.preis = preis;
        System.out.println("Preis wurde geändert!");
    }

    @Override
    public String toString(){
        return "Das Headset des Modells "
        + getModell() + " vom Hersteller " 
        + getHersteller() + " kostet im Privateinkauf "
        + getPreis() + " Euro."
        + " Der Preis in Pfund beträgt " 
        + PreisInPfund() + ".";

    }

    public String PreisInPfund(){
        return f.format(getPreis() * 0.86);

    }

    

    
}
