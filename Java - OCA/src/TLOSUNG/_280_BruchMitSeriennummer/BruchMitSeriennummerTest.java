package TLOSUNG._280_BruchMitSeriennummer;

import java.util.Scanner;

public class BruchMitSeriennummerTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl der zu erzeugenden Brüche: ");
        int anzahlBrueche = input.nextInt();
        BruchMitSeriennummer[] bruchMitSeriennummern = new BruchMitSeriennummer[anzahlBrueche];

        for (int i = 1; i <= anzahlBrueche; i++){
            System.out.println("Bruch_" + i);
            System.out.print("\tZähler: ");
            int zaehler = input.nextInt();
            System.out.print("\tNenner: ");
            int nenner = input.nextInt();
            bruchMitSeriennummern[i - 1] = new BruchMitSeriennummer(zaehler, nenner);
        }

        System.out.print("Wähle nun einen Bruch aus, um seine Seriennummer zu erfahren. Dafür musst du ein " +
                "Laufindiz im Bereich 1 bis " + anzahlBrueche + " wählen: ");
        int indiz = input.nextInt();
        System.out.println("\tBruch_" + indiz + " = " + bruchMitSeriennummern[indiz - 1].bruchToString()
                + " hat die Seriennummer " + bruchMitSeriennummern[indiz-1].getSeriennummer());
    }
}
