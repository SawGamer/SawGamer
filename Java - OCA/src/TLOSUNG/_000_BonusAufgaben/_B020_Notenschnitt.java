package TLOSUNG._000_BonusAufgaben;

import java.util.ArrayList;
import java.util.Random;

public class _B020_Notenschnitt {
    /*
     * Notenschnitt
     *
     * Schreibe eine Programm, das 20 Zeugnisnoten (1.0 bis 6.0)
     * in Zehntelnoten (z.B. 4.3, 3.1, 5.6, ...) zufällig erzeugt.
     *
     * Verwende diese 20 Noten, um damit den relevanten Durchschnitt
     * nach folgendem Verfahren zu berechnen:
     *
     * - streiche die beste und die schlechteste Note
     * - ermittel den Durchschnitt der verbleibenden Zahlen
     * - runde auf die nächste halbe Note (1, 1.5, 2, ..., 4.5, 5, 5.5, 6)
     */

    final private static int anzahlNoten = 20;
    final private static int noteMax = 6;
    final private static int noteMin = 1;
    private static double noteHighest = 0;
    private static double noteLowest = 6;
    private static double noteAll = 0;

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Double> schoolNotes = new ArrayList<>();

        // Füllung des Arrays
        fillList(schoolNotes);

        // Filtert die schlechteste und beste Note aus
        for (int i = 0; i < schoolNotes.size(); i++) {
            highestNote(schoolNotes.get(i));
            lowestNote(schoolNotes.get(i));
            System.out.print(schoolNotes.get(i) + " ");
        }
        System.out.println();

        // Entfernt beste und schlechteste Note
        schoolNotes.remove(noteHighest);
        schoolNotes.remove(noteLowest);
        //
        for (int i = 0; i < schoolNotes.size(); i++) {
            System.out.print(schoolNotes.get(i) + " ");
        }
        System.out.println();
        //

        // Summiert alle restlichen Noten
        for (int i = 0; i < schoolNotes.size(); i++) {
            noteAll += schoolNotes.get(i);
        }
        double notenDurchschnitt = noteAll / schoolNotes.size();
        System.out.println("Notendurchschnitt: " + (Math.ceil(notenDurchschnitt*2)/2));
    }


    public static ArrayList<Double> fillList(ArrayList<Double> arrayList){
        while(arrayList.size() < anzahlNoten){
            for (int i = 0; i < 1; i++) {
                double note = Math.random()*10;
                if (note <= noteMax && note >= noteMin){
                    if (note <= 1.1){
                        arrayList.add(1.0);
                    } else{
                        arrayList.add(Math.ceil(note*2)/2);
                    }
                }
            }
        }
        return arrayList;
    }
    public static double highestNote(double note){
        if(note > noteHighest){
            noteHighest = note;
        }
        return noteHighest;
    }
    public static double lowestNote(double note){
        if(note < noteLowest){
            noteLowest = note;
        }
        return noteLowest;
    }
}
