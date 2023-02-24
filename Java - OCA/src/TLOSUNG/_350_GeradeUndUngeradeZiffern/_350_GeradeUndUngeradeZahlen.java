package TLOSUNG._350_GeradeUndUngeradeZiffern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _350_GeradeUndUngeradeZahlen {

    /*
     * Gerade und ungerade Ziffern
     *
     * Das Programm soll von einer positiven Ganzzahl bestimmen,
     * wieviele Ziffern der Ausgangszahl gerade und wieviele Ziffern der
     * Ausgangszahl ungerade sind.
     *
     * Schreibe zuerst eine statische Methode zahlEinlesen(),
     * die per BufferedReader eine positiven Ganzzahl vom User einliest:
     * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     * String eingabe = reader.readLine();
     * Diese Zahl soll als int zurück gegeben werden.
     *
     * Die statische Methode bestimmeAnzahlGeraderUngeraderZiffern()
     * soll die Methode zahlEinlesen() aufrufen
     * und in einem int-Array zurück geben, wieviele Ziffern gerade sind und
     * wieviele ungerade.
     * Am Index 0 soll die Anzahl der geraden Ziffern stehen
     * und am Index 1 die Anzahl der ungeraden Ziffern.
     *
     * In der main()-Methode soll dann für die Zahl 471123427 Folgendes ausgegeben
     * werden
     * Gerade: 4 Ungerade: 5
     *
     * 1. Schreibe eine Lösung mit try catch.
     *
     * 2. Schreibe eine Lösung mit throws.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte >>> GANZE ZAHL <<< eingeben");
        String potentielleZahl;
        int geradeZahl = 0;
        int ungeradeZahl = 0;
        String[] numbs;

        while (true) {
            try {
                potentielleZahl = reader.readLine();
                if (potentielleZahl.equals("") || potentielleZahl.equals(" ") || Integer.parseInt(potentielleZahl) == 0)
                    throw new EmptyInputException(" Nichts ist nichts. Bitte Ganzzahl eingeben! ");
                numbs = potentielleZahl.split("");
                for (int i = 0; i < numbs.length; i++) {
                    if (Integer.parseInt(numbs[i]) % 2 == 0) {
                        geradeZahl++;
                    } else
                        ungeradeZahl++;
                }

                break;

            } catch (EmptyInputException eie) {
                System.out.println(eie);
            } catch (NumberFormatException n) {
                System.out.println("Bitte Ganzzahl eingeben!");

            }

        }
        System.out.println("Gerade: " + geradeZahl + " Ungerade: " + ungeradeZahl);
    }
}

