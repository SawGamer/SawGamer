package TLOSUNG._430_Steganografie;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class _430_Steganografie {
    static int counter;

    public static void main(String[] args) {

        /*
         * Steganografie
         *
         * Steganografie ist die Technik, eine geheime Information in einem Dokument so
         * zu verstecken,
         * dass sie nur von einer eingeweihten Person gefunden werden kann.
         * Schreibe eine Methode mit zwei Parametern s und n,
         * die einen Klartext s auf folgende Weise durch Steganografie unleserlich
         * macht:
         *
         * - Der String s wird in Großbuchstaben umgewandelt.
         * - Hinter jedes Zeichen werden n zufällige Großbuchstaben eingefügt.
         * - Das Argument n ist optional (Default=1).
         *
         * Beispielaufrufe:
         */

        System.out.println(verstecke("Um acht an der Uhr"));
        // AUSGABE z.B.: UFMF LACCRHXTF GAXNJ VDCEYRA IUGHBRW

        System.out.println(verstecke("Um acht an der Uhr", 2));
        // AUSGABE z.B.: UALMVD SPAHNCWDHAHTPH PJAMUNSY REDKNEQBRIB PIUBTHZBRWN
    }

    static String verstecke(String encryptPlease, int j) {
        ArrayList<String> encryptedInput = new ArrayList<>();
        for (int i = 0; i < encryptPlease.length(); i++) {
            counter = j;
            char index = encryptPlease.charAt(i);
            encryptedInput.add(Character.toString(index).toUpperCase());
            while (counter > 0) {
                encryptedInput.add(Character.toString((char) (ThreadLocalRandom.current().nextInt(65, 90 + 1))));
                counter--;
            }
        }
        //String encryptedInputToString = String.join("",encryptedInput);
        return String.join("",encryptedInput);
    }

    static String verstecke(String encryptPlease) {
        return verstecke(encryptPlease, 1);

//        ArrayList<String> encryptedInput = new ArrayList<>();
//        for (int i = 0; i < encryptPlease.length(); i++) {
//            counter = 1;
//            char index = encryptPlease.charAt(i);
//            encryptedInput.add(Character.toString(index).toUpperCase());
//            while (counter > 0) {
//                encryptedInput.add(Character.toString((char) (ThreadLocalRandom.current().nextInt(65, 90 + 1))));
//                counter--;
//            }
//        }
//        //String encryptedInputToString = String.join("",encryptedInput);
//        return String.join("",encryptedInput);
    }
}
