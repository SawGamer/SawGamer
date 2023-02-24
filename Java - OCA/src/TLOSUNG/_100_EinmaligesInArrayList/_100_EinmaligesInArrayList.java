package TLOSUNG._100_EinmaligesInArrayList;

import java.util.*;

public class _100_EinmaligesInArrayList {
    /*
     * Einmaliges in ArrayList
     *
     * Schreibe ein Programm, das eine ArrayList mit neun Zahlen zufällig befüllt.
     * Dabei sollen vier Zahlen doppelt vorkommen und eine Zahl nur einmal.
     *
     * Mische dann die ArrayList per Collections.shuffle(ArrayList)
     *
     * Finde dann aus dieser ArrayList die Zahl, die nur einmal vorkommt.
     * Tipp: Benutze eine HashMap<Integer, Integer>
     */

    static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random random = new Random();

        while (numbersList.size() < 8) {
            int doubledNumber = random.nextInt(100);
            if (!numbersList.contains(doubledNumber)) {
                numbersList.add(doubledNumber);
                numbersList.add(doubledNumber);
            }
        }

        while (numbersList.size() < 9) {
            int singleNumber = random.nextInt(100);
            if (!numbersList.contains(singleNumber)) {
                numbersList.add(singleNumber);
            }
        }

        System.out.println("Before shuffle: " + numbersList);

        Collections.shuffle(numbersList);
        System.out.println("Shuffled: " + numbersList);

        return numbersList;
    }

    static void findUnique(ArrayList<Integer> numbersList) {

        HashMap<Integer, Integer> uniqueNumber = new HashMap<>();

        numbersList.forEach(number -> {
            if (uniqueNumber.containsKey(number)) {
                uniqueNumber.put(number, 1 + uniqueNumber.get(number));
            } else {
                uniqueNumber.put(number, 1);
            }
        });

        System.out.println("Hashed: " + uniqueNumber);

        uniqueNumber.forEach((key, value) -> {
            if (value == 1) {
                System.out.println("Unique: " + key + "");
            }
        });
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = generateNumbers();
        findUnique(numbersList);
    }
}
