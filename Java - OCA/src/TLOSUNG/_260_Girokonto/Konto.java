package TLOSUNG._260_Girokonto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konto {
    DecimalFormat df = new DecimalFormat("0.00");

    private String kontonummer;
    private double kontostand;

    public Konto(String kontonummer, double  kontostand){
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag){
        kontostand += betrag;
    }

    public void auszahlen(double betrag){
        kontostand -= betrag;
    }

    public Object[] transaktion_vorbereiten(){
        Object[] parameter = new Object[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Einzahlung (E) oder Auszahlung (A) oder Abbrechen (X): ");
        parameter[0] = input.next();
        if (parameter[0].equals("X"))
            System.exit(0);
        System.out.print("Betrag: ");
        parameter[1] = input.nextDouble();
        return parameter;
    }

    public boolean transaktion_durchfuehren(String transaktion, double betrag){
        boolean ergebnis = true;
        if (transaktion.equals("E"))
            einzahlen(betrag);
        else if (transaktion.equals("A")){
            if (betrag <= getKontostand())
                auszahlen(betrag);
            else ergebnis = false;
        }
        else {
            System.out.println("Unrichtige Eingabe");
            System.exit(1);
        }
        return ergebnis;
    }

    public void transaktion_auswerten(boolean ergebnis){
        Scanner input = new Scanner(System.in);
        if (!ergebnis){
            do{
                System.out.println("\tGuthaben unzureichend!");
                System.out.print("Anderer Betrag (B) oder Abbrechen (X): ");
                String bOrX = input.next();
                if (bOrX.equals("X"))
                    System.exit(0);
                else if(bOrX.equals("B")){
                    System.out.print("Betrag: ");
                    double betrag = input.nextDouble();
                    ergebnis = transaktion_durchfuehren("A", betrag);
                }
                else {
                    System.out.println("Unrichitige Angabe");
                    System.exit(1);
                }
            }
            while(!ergebnis);
        }
    }

    public String toString(){
        return "\tKontonummer " + getKontonummer() + " hat den Konstostand " + df.format(getKontostand()) + " €";
    }
}
