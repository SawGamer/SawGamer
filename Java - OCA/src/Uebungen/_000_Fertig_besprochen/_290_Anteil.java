package Uebungen._000_Fertig_besprochen;

public class _290_Anteil {

    /*
     * Anteil
     *
     * Verwende als Ausgangsbasis die Klasse Bruch aus der vorherigen Aufgabe,
     * und erstelle eine abgeleitete Subklasse mit dem Namen Anteil.
     * Ein Anteil soll den Bruchteil eines Gesamtbestands darstellen.
     * Das bedeutet, dass ein Anteil immer einen Bruch darstellt,
     * der aber maximal den Wert 1 annehmen kann.
     * In einem Programm können also nur so lange Instanzen
     * der Klasse Anteil definiert werden,
     * bis der Gesamtbestand auf die Anteile verteilt ist.
     * Deshalb soll über ein Attribut verteilt überwacht werden,
     * wie viel des Gesamtbestands bereits verteilt ist.
     * Stellt man sich den Gesamtbestand z.B. als
     * ein zu verteilendes Vermögen von 200.000 € vor,
     * ist der maximale Anteil das Gesamtvermögen.
     * Damit wäre dann auch das Gesamtvermögen bereits verteilt.
     *
     * Die Attribute der Klasse Anteil sind:
     * - die von Bruch geerbten Attribute zaehler und nenner
     * - das Attribut verteilt als Bruch mit dem Modifier static
     *
     * Das Attribut verteilt soll die Summe der bereits verteilten Anteile speichern.
     * Es soll mit dem Wert 0 initialisiert werden.
     *
     * Die Klasse Anteil soll zwei Konstruktoren besitzen:
     * - Anteil() setzt den Anteil auf den Wert 0.
     * - Anteil(int z, int n) setzt Zähler und Nenner auf die übergebenen Werte.
     *
     * Ein Konstruktor ohne Parameter soll den Anteil
     * auf den Wert 0 (Zähler = 0, Nenner = 1) setzen.
     * Der zweite Konstruktor soll zwei Parameter verwenden.
     * Wie beim Bruch sollen die beiden Parameter für den Zähler
     * und den Nenner einen Wert übernehmen.
     * Mit der Definition eines Anteils muss auch
     * der Wert des Attributs verteilt angepasst werden.
     * Der Wert der verteilten Anteile muss um den Wert des Anteils erhöht werden.
     * Ist der Gesamtwert der verteilten Anteile größer als 1,
     * soll eine Fehlermeldung in der Konsole ausgegeben werden.
     *
     * Die Klasse Anteil benötigt zwei Methoden:
     *
     * - getVerteilt() soll ohne Parameter aufgerufen werden
     *   und als Ergebnis den Wert des Bruchs verteilt als double zurückliefern.
     * - getRest() soll ebenfalls ohne Parameter aufgerufen werden
     *   und den Wert des noch nicht verteilten Anteils als Bruch zurückliefern.
     *
     * Teste die Klasse Anteil mit dem folgenden Programm mit dem Namen Anteiltest:
     *
     * public class Anteiltest {
     * 	public static void main(String args[]) {
     * 		int vermoegen = 200000;
     * 		Anteil a1 = new Anteil(1,4);
     * 		Anteil a2 = new Anteil(1,2);
     * 		System.out.println("Anteil a1: " + a1.bruchToString());
     * 		System.out.println("Betrag von a1 :" + vermoegen * a1.dezimalwert());
     * 		System.out.println("Anteil a2: " + a2.bruchToString());
     * 		System.out.println("Betrag von a2: " + vermoegen * a2.dezimalwert());
     * 		System.out.println("Verteilt: " + a1.verteilt.bruchToString());
     * 		// System.out.println("Verteilt: " + Anteil.verteilt.bruchToString());
     * 		System.out.println("Rest: " + a1.getRest().bruchToString());
     * 		System.out.println("Restbetrag: " + vermoegen * a1.getRest().dezimalwert());
     *        }
     * }
     *
     * Das Programm müsste die folgende Ausgabe erzeugen:
     *
     * Anteil a1: 1/4
     * Betrag von a1: 50000.0
     * Anteil a2: 1/2
     * Betrag von a2: 100000.0
     * Verteilt: 6/8
     * Rest: 2/8
     * Restbetrag: 50000.0
     */

}
