package Uebungen._000_Fertig_besprochen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class _100_EinmaligesInArrayList {

    public static void main(String[] args) {

        /*
         * Einmaliges in ArrayList
         *
         * Schreibe ein Programm, das eine ArrayList mit neun Zahlen zufällig befüllt.
         * Dabei sollen vier Zahlen doppelt vorkommen und eine Zahl nur einmal.
         *
         * Mische dann die ArrayList per Collections.shuffle(ArrayList)
         *
         * Finde dann aus dieser ArrayList die Zahl, die nur einmal vorkommt.
         * Tipp: Benutze eine HashMap<Integer, Integer>
         */

        Random r = new Random();
        int zahlenbereich = 10;
        ArrayList<Integer> werte = new ArrayList<>();

        // Befüllen der ArrayList
        werte.add(r.nextInt(zahlenbereich));
        int wert;

        do {
            wert = r.nextInt(zahlenbereich);
            if (!werte.contains(wert)) {
                werte.add(wert);
                werte.add(wert);
            }
//            if (werte.contains(wert)) {
//                //
//            } else {
//                werte.add(wert);
//                werte.add(wert);
//            }

        } while (werte.size() < 9);
        System.out.println(werte);  // z.B. [4, 3, 3, 6, 6, 1, 1, 7, 7]

        // Mischen
        Collections.shuffle(werte);
        System.out.println(werte);  // z.B. [6, 1, 4, 3, 1, 3, 7, 6, 7]

        // Suchen der Zahl, die nur einmal vorkommt
        HashMap<Integer, Integer> results = new HashMap<>();
        for (int w: werte) {
            if (results.get(w) == null) {
                results.put(w, 1);
            } else {
                // results.put(w, 2);
                results.put(w, results.get(w) + 1);  // {1=2, 3=2, 4=1, 6=2, 7=2}
            }
        }
        System.out.println(results);

        // Ausgabe der einzelnen Zahl:
        for (int result: results.keySet()) {
            if (results.get(result) == 1) {
                System.out.println(result);  // z.B. 4
            }
        }

    }
}
