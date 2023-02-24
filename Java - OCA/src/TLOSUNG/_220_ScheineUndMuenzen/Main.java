package TLOSUNG._220_ScheineUndMuenzen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheineUndMuenzen test = new ScheineUndMuenzen();
        System.out.println("Test 53.28: ");
        test.berechne(53.28);
        System.out.println("Test 99.95: ");
        test.berechne(99.95);

        while (true) {
            try {
                ScheineUndMuenzen userCheck = new ScheineUndMuenzen();
                Scanner input = new Scanner(System.in);
                System.out.print("Betrag zu rechnen: ");
                double betrag = input.nextDouble();
                userCheck.berechne(betrag);
            } catch (Exception e) {
                System.out.println("Error. Nochmal versuchen.");
            } finally {
                boolean replayLoop = true;
                while (replayLoop) {
                    System.out.print("\nNochmal? (J/N) ");
                    Scanner input = new Scanner(System.in);
                    String replay = input.nextLine();
                    if (replay.equalsIgnoreCase("J")) {
                        replayLoop = false;
                    } else if (replay.equalsIgnoreCase("N")) {
                        System.exit(0);
                    } else {
                        System.out.println("J or N?");
                    }
                }
            }
        }
    }
}
