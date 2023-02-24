package TLOSUNG._210_MerkbaresZufallspasswort;

import java.util.Random;
import java.util.stream.IntStream;

public class _210_MerkbaresZufallspasswort {

    private static final String[] vowels = {"a", "e", "i", "o", "u"};
    private static final String[] vowels_upper = {"A", "E", "I", "U"};
    private static final String[] consonants = {"b", "c", "d", "f", "h", "j", "k", "m", "n", "p", "r", "s", "t", "v", "w", "x", "z"};
    private static final String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] specialCharacters = {"\\", "/", "%", "$", "#", "@", "!", "-", "_", "=", "+", "?", ",", ".", "<",
            ">", "(", ")", "[", "]", "{", "}"};
    private static final Random random = new Random();


    public String addRandom(String[] array) {
        return array[random.nextInt(array.length)];
    }

    public StringBuilder startingWithVowel(int numberOfLetters) {
        StringBuilder word = new StringBuilder();
        String testForO = "O";
        String testLetter = addRandom(vowels).toUpperCase();
        if (testForO.equals(testLetter)) {
            return startingWithVowel(numberOfLetters);
        } else {
            word.append(testLetter);
            IntStream.rangeClosed(1, numberOfLetters).forEach(i -> {
                if (i % 2 == 0) {
                    word.append(addRandom(vowels));
                } else {
                    word.append(addRandom(consonants));
                }
            });
        }
        return word;
    }

    public StringBuilder startingWithConsonant(int numberOfLetters) {
        StringBuilder word = new StringBuilder();
        word.append(addRandom(consonants).toUpperCase());
        IntStream.rangeClosed(1, numberOfLetters).forEach(i -> {
            if (i % 2 == 0) {
                word.append(addRandom(consonants));
            } else {
                word.append(addRandom(vowels));
            }
        });

        return word;
    }

    public StringBuilder randomNumbers() {
        int i = 0;
        StringBuilder randomNumbers = new StringBuilder();
        do {
            randomNumbers.append(addRandom(numbers));
            i++;
        } while (i <= random.nextInt(3));

        return randomNumbers;
    }


    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        int numberOfLetters = random.nextInt(3) + 3;

        if (random.nextInt() % 2 == 0) {
            password.append(startingWithVowel(numberOfLetters));
        } else {
            password.append(startingWithConsonant(numberOfLetters));
        }
        password.append(addRandom(specialCharacters));
        password.append(randomNumbers());

        return password.toString();
    }

    public static void main(String[] args) {
        System.out.println(new _210_MerkbaresZufallspasswort().generatePassword());
    }
}