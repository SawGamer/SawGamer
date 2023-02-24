package TLOSUNG._050_Lottoziehung;

import java.util.ArrayList;
import java.util.Random;

public class Lottozahlen {
    public static ArrayList<Integer> getLotteryNumbers(int size, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (numbers.size() < size) {   //Get Random numbers between range
            int randomNumber = random.nextInt((max - min) + 1) + min;   //Check for duplicate values
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        System.out.println("\nHere comes the winning lotto numbers....");
        for (Integer number : numbers) {
            try {
                Thread.sleep(1000);
                System.out.println("Drawing the number... " + number);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = getLotteryNumbers(6, 1, 6);
        System.out.println(lotteryNumbers);
    }

}
