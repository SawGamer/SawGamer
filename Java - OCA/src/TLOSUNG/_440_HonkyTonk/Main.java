package TLOSUNG._440_HonkyTonk;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        gameloop:
        while (true) {
            new Game();
            System.out.print("\nNochmal spielen? (J/N):  ");
            while (true) {
                try {
                    String replay = input.nextLine();
                    if (replay.equalsIgnoreCase("N")) {
                        break gameloop;
                    } else if (replay.equalsIgnoreCase("J")) {
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.print("Ja oder Nein?: ");
                }
            }
        }
    }
}
