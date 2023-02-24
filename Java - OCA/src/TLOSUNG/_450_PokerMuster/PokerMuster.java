package TLOSUNG._450_PokerMuster;

import java.util.*;

public class PokerMuster {

    private final HashMap<Integer, Integer> evaluator;

    public PokerMuster() {
        evaluator = new HashMap<>();
        initializeEvaluator();
        getDiceRolls();
        printAllDice();
        evaluateHand();
    }

    private void initializeEvaluator() {
        for (int i = 1; i <= 6; i++) {
            evaluator.put(i, 0);
        }
    }

    public void getDiceRolls() {
        Random rand = new Random();
        int i = 0;
        while (i < 5) {
            int roll = rand.nextInt(6) + 1;
            printDiceRoll(roll);
            evaluator.put(roll, evaluator.get(roll) + 1);
            i++;
        }
    }

    public void printDiceRoll(int diceRoll) {
        ArrayList<Dice> rolledDice = new ArrayList<>();
        rolledDice.add(new Dice(diceRoll));
        try {
            Thread.sleep(1000);
            System.out.println("Rolling  ... ");
            Dice.printDice(rolledDice);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void printAllDice() {
        ArrayList<Dice> allRolledDice = new ArrayList<>();
        evaluator.forEach((key, value) -> {
            if (value > 0) {
                int occurrences = value;
                do {
                    allRolledDice.add(new Dice(key));
                    occurrences--;
                } while (occurrences > 0);
            }
        });
        Dice.printDice(allRolledDice);
    }

    public void evaluateHand() {

        if (isPokerFive()) {
            System.out.println("Yahtzee!");
        } else if (isFour()) {
            System.out.println("Four of a kind!");
        } else if (isFullHouse()) {
            System.out.println("Full House!");
        } else if (isDrilling()) {
            System.out.println("Three of a kind!");
        } else if (isDoublePair()) {
            System.out.println("Double Pair!");
        } else if (isPair()) {
            System.out.println("Pair!");
        } else if (isRoad()) {
            System.out.println("Straight!");
        } else {
            System.out.println("No win.");
        }
    }

    private boolean isPokerFive() {
        return evaluator.containsValue(5);
    }

    private boolean isFour() {
        return evaluator.containsValue(4);
    }

    private boolean isDrilling() {
        return evaluator.containsValue(3);
    }

    private boolean isPair() {
        return evaluator.containsValue(2);
    }

    private boolean isDoublePair() {
        int count = (int) evaluator.values().stream().mapToInt(i -> i).filter(i -> i == 2).count();
        return count == 2;
    }

    private boolean isRoad() {
        int count = (int) evaluator.values().stream().mapToInt(i -> i).filter(i -> i == 1).count();
        if (count < 5) {
            return false;
        }
        return evaluator.get(1) == 0 && evaluator.get(6) == 1 || evaluator.get(1) == 1 && evaluator.get(6) == 0;
    }

    private boolean isFullHouse() {
        return evaluator.containsValue(2) && evaluator.containsValue(3);
    }
}
