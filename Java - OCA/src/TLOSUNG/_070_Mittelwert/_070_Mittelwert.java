package Uebungen;

import java.text.DecimalFormat;

public class _070_Mittelwert {

    public static void main(String[] args) {

        /*
         * Mittelwert
         *
         * Schreibe eine statische Methode,
         * die drei Zahlen entgegen nimmt,
         * den Mittelwert berechnet und diesen zurückgibt.
         */
        DecimalFormat dd =new DecimalFormat("##.##");
        System.out.println(dd.format(Mittelwert(35,26,45)));
    }

    static double Mittelwert(double x, double y, double i) {

        double Rechnen = x+y+i;

        double mittel = Rechnen/3;
        return  mittel;



    }
}
