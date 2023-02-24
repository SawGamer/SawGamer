package Uebungen._000_Fertig_besprochen;

public class _260_Girokonto {

    /*
     * Girokonto
     *
     * Leite von der Klasse Konto aus der vorherigen Aufgabe die Subklasse Girokonto ab.
     *
     * Die Klasse Girokonto soll über folgende Attribute verfügen:
     *
     * - ererbte Attribute der Klasse Konto
     * - limit als double
     *
     * Das Attribut limit gibt an,
     * welches Kreditlimit dem Kunden für das Überziehen zur Verfügung steht.
     * Beim Auszahlen soll jeweils geprüft werden,
     * ob die geforderte Auszahlung ohne Überschreitung des Kreditlimits möglich ist.
     *
     * Die Klasse Girokonto soll über folgende Konstruktoren verfügen:
     * Die Klasse soll einen Konstruktor mit drei Parametern verwenden.
     * Dabei stehen die ersten beiden Attribute für die Werte von Kontonummer
     * und Kontostand (wie bei der Klasse Konto).
     * Der dritte Parameter wird für die Initialisierung des Kreditlimits verwendet.
     *
     * Die Klasse Girokonto soll über folgende Methoden verfügen:
     *
     * - double getLimit()
     * - void setLimit(double l)
     *
     * Die Methode getLimit() soll keine Parameter verwenden
     * und als Ergebnis das Kreditlimit zurückliefern.
     * Von der Methode setLimit() soll kein Ergebnis zurückgeliefert
     * und als Parameter das neue Kreditlimit erwartet werden.
     * Die ererbte Methode auszahlen() soll so überschrieben werden,
     * dass nur dann der auszuzahlende Betrag vom Saldo abgezogen wird,
     * wenn nach dem Abzug das Kreditlimit nicht überschritten wird.
     * Ansonsten soll eine Fehlermeldung in der Konsole ausgegeben werden.
     * Teste die Klasse Girokonto mit dem folgenden Programm:
     *
     * public class Girokontotest {
     *     public static void main(String args[]) {
     *         Girokonto gk=new Girokonto("0000000001", 10000.0, 1000.0);
     *         gk.auszahlen(11000.0);
     *         System.out.println("Kontostand: " + gk.getKontostand());
     *         gk.einzahlen(11000.0);
     *         System.out.println("Kontostand: "+gk.getKontostand());
     *         gk.auszahlen(11001.0);
     *         System.out.println("Kontostand: "+gk.getKontostand());
     *     }
     * }
     *
     * Das Programm muss die folgenden Ausgaben in der Konsole erzeugen:
     *
     * - Kontostand: -1000.0
     * - Kontostand: 10000.0
     * - Fehler: Kreditlimit überschritten!
     * - Kontostand: 10000.0
     */

}
