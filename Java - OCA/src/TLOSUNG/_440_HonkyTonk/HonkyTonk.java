package TLOSUNG._440_HonkyTonk;

import java.util.Random;
import java.util.stream.IntStream;

public class HonkyTonk {
    private int totalAmount;
    private final int stake;
    private final int numberOfRounds;
    public HonkyTonk(int totalAmount, int stake, int numberOfRounds) {
        this.totalAmount = totalAmount;
        this.stake = stake;
        this.numberOfRounds = numberOfRounds;
        honkyTonkGame();
    }

    public void honkyTonkGame(){
        int countOnes = 0;
        int countTwos = 0;
        int countThrees = 0;

        for(int i = 1; i <= numberOfRounds; i++){
            System.out.printf("\n%-15s", "Runde: " + i);
            System.out.printf("%15s", " Startkapital: " + totalAmount);
            System.out.printf("\n%-15s", "Einsatz: " + stake);
            System.out.printf("%15s", " Aktuellekapital: " + (totalAmount - stake));
            int numberOfSixes = diceRoll();
            if (numberOfSixes > 0) {
                totalAmount += numberOfSixes;
                if(numberOfSixes==3){
                    countThrees++;
                } else if (numberOfSixes==2) {
                    countTwos++;
                }else {
                    countOnes++;
                }
            } else {
                totalAmount -= stake;
            }
            System.out.printf("\n%-15s","# 6s:  " + numberOfSixes);
            System.out.printf("%15s", " Endkapital: " + totalAmount);
            System.out.println();
            if(totalAmount <= 0){
                System.out.println("Ging nach der Runde " + i + " pleite.");
                break;
            }
            if(i==numberOfRounds){
                System.out.println("\nDie letzte Runde ist geschafft mit " + totalAmount + " Euro übrig.");

            }
        }
        System.out.println("3x 6 gewürfelt: " + countThrees + " mal.");
        System.out.println("2x 6 gewürfelt: " + countTwos + " mal.");
        System.out.println("Eine 6 gewürfelt: " + countOnes + " mal.");
    }

    private int diceRoll(){
        Random rand = new Random();
        return (int) IntStream.range(0, 3).map(i -> rand.nextInt(6) + 1).filter(dice -> dice == 6).count();
    }
}
