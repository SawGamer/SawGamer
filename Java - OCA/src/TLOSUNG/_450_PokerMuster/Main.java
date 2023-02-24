package TLOSUNG._450_PokerMuster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        gameloop:
        while (true) {
            new PokerMuster();
            System.out.print("\nAgain? (Y/N):  ");
            while (true) {
                try {
                    String replay = input.nextLine();
                    if (replay.equalsIgnoreCase("N")) {
                        break gameloop;
                    } else if (replay.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.print("Yes or No: ");
                }
            }
        }
    }
}
