package Uebungen._000_Fertig_besprochen;

public class _120_CaesarChiffreBruteforcen {

    public static void main(String[] args) {

        /*
         * Cäsar-Chiffre bruteforcen
         *
         * Schreibe ein Programm das alle möglichen Lösungen
         * eines Cäsar-chiffrierten Strings ausgibt.
         *
         * Was bedeutet "vxumxgssokxkt sginz yvgyy"?
         *
         * Wer Cäsar-Chiffre nicht kennt: https://de.wikipedia.org/wiki/Caesar-Verschl%C3%BCsselung
         */

        String str = "vxumxgssokxkt sginz yvgyy";

        for (int chiffre = 1; chiffre <= 26; chiffre++) {
            System.out.print(chiffre + ": ");
            for (int index = 0; index < str.length(); index++) {

                int zeichen = str.charAt(index);
                if (zeichen != 32) zeichen += chiffre;  // ASCII-Code 32 ist das Leerzeichen
                if (zeichen > 122) zeichen -= 26;       // ASCII-Code 122 ist das z

                System.out.print((char) zeichen);

            }
            System.out.println();
        }


    }
}
