package TLOSUNG._390_Kopfrechnen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathGame {

    RandomMathProblem problem;
    Stopwatch stopwatch;
    DecimalFormat df = new DecimalFormat("0.000");

    public MathGame() {
        problem = new RandomMathProblem();
        stopwatch = new Stopwatch();
        gameLoop();
    }

    private int readInput() {
        Scanner input = new Scanner(System.in);
        int userAnswer;
        while (true) {
            try {
                userAnswer = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nUngültiger Eingabe. Versuch es noch einmal:  ");
            }
        }
        return userAnswer;
    }

    public void gameLoop() {
        int correctAnswers = 0;
        stopwatch.start();

        int i = 1;
        while (i <= 5) {
            System.out.printf("Frage %d: ", i);
            int result = problem.randomMathProblem();
            int answer = readInput();
            if (answer == result) {
                System.out.println("Richtig!");
                correctAnswers++;
            } else {
                System.out.println("Falsch. Die richtige Antwort ist " + result + ".");
            }
            System.out.println("Du hast diese Frage in " + df.format(stopwatch.lapTime()) + " Sekunden geantwortet.\n");
            i++;
        }
        double timeTaken = stopwatch.stop();
        System.out.println("Du hast " + correctAnswers + " von 5 Fragen richtig beantwortet");
        System.out.println("Du hast " + df.format(timeTaken) + " Sekunden gebraucht, um den Test abzuschließen.\n");
    }

}
