package Uebungen._000_Fertig_besprochen;

public class _270_Bruch {

    /*
     * Bruch
     *
     * Verwende für die folgende Aufgabenstellung
     * die unten stehende Klasse Bruch als Ausgangspunkt.
     *
     *     Ergänze die Klasse Bruch um drei Methoden:
     *
     *         - Bruch addiere(Bruch b)
     *         - Bruch subtrahiere(Bruch b)
     *         - double dezimalwert()
     *
     *     Die ersten beiden Methoden übernehmen als Argument einen Bruch,
     *     den sie zu dem Bruch hinzuaddieren,
     *     dessen addiere-Methode aufgerufen wird,
     *     bzw. den sie von dem Bruch abziehen,
     *     dessen subtrahiere-Methode aufgerufen wird.
     *     Achte darauf,
     *     dass die beiden Methoden das Ergebnis als neuen Bruch zurückliefern
     *     und dass die Attribute zaehler und nenner
     *     der beiden Ausgangsbrüche nicht verändert werden.
     *     Die Methode dezimalwert liefert den Wert des Bruchs
     *     als Kommazahl (double) zurück.
     */
}

class Bruch {

    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    int getZaehler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    String bruchToString() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        int m, n, r;
        m = Math.abs(zaehler);
        n = Math.abs(nenner);
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

}
