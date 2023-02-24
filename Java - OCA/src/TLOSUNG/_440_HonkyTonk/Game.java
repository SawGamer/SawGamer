package TLOSUNG._440_HonkyTonk;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private int startAmount;
    private int numberOfRounds;
    private int stakedAmount;

    public Game() {
        gameLoop();
    }

    public void userInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Kapital eingeben: ");
                startAmount = input.nextInt();
                System.out.print("Wie viele Runden?: ");
                numberOfRounds = input.nextInt();
                System.out.print("Höhe des Einsatzes: ");
                stakedAmount = input.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Eingabe ungültig. Versuch es erneut.");
                input.next();
            }
        }
    }

    public void gameLoop(){
        userInput();
        new HonkyTonk(startAmount, stakedAmount, numberOfRounds);
    }
}
