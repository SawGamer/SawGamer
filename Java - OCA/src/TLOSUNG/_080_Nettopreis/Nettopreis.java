package Übungen;

public class Nettopreis {               //Abdullah

    public static void main(String[] args) {

        double brutto = 100.0;

        System.out.println(nettopreis(119, 19));
        System.out.println(nettopreis(238));

    }

    static double nettopreis(double brutto, double mehrwertsteuer) {
        mehrwertsteuer = mehrwertsteuer / 100 + 1;
        double nettopreis = brutto / mehrwertsteuer;
        return nettopreis;

        //in einer If-Schleife Strings mit Mehrwertsteuersatz verbinden wie z.B. Grundnahrungsmittel 7%
        //if(Artikel = "Eier" 7%) z.B.
    }
    static double nettopreis(double brutto){
        return nettopreis(brutto, 19);
    }
}
