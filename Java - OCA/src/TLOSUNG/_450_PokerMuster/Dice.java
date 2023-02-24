package TLOSUNG._450_PokerMuster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dice implements Iterable<String> {
    private static final String[][] lines = {
            {
                    "+-------+",
                    "|       |",
                    "|   o   |",
                    "|       |",
                    "+-------+",
            },
            {
                    "+-------+",
                    "| o     |",
                    "|       |",
                    "|     o |",
                    "+-------+",
            },
            {
                    "+-------+",
                    "| o     |",
                    "|   o   |",
                    "|     o |",
                    "+-------+",
            },
            {
                    "+-------+",
                    "| o   o |",
                    "|       |",
                    "| o   o |",
                    "+-------+",
            },
            {
                    "+-------+",
                    "| o   o |",
                    "|   o   |",
                    "| o   o |",
                    "+-------+",
            },
            {
                    "+-------+",
                    "| o   o |",
                    "| o   o |",
                    "| o   o |",
                    "+-------+",
            }
    };
    private final int dieValue;

    public Dice(int value) {
        if (value < 1 || value > 6) {
            throw new IllegalArgumentException("Illegal die value");
        }
        this.dieValue = value - 1;
    }

    public Iterator<String> iterator() {
        return Arrays.asList(lines[dieValue]).iterator();
    }

    public static void printDice(ArrayList<Dice> rolledDice) {

        List<Iterator<String>> dice = new ArrayList<>();
        for (Dice die : rolledDice) {
            dice.add(die.iterator());
        }
        StringBuilder builder = new StringBuilder();

        outer:
        while (true) {
            for (Iterator<String> iterator : dice) {
                if (!iterator.hasNext()) {
                    break outer;
                }
                builder.append(iterator.next()).append("   ");
            }
            builder.append("\r\n");
        }
        System.out.println(builder);
    }

}