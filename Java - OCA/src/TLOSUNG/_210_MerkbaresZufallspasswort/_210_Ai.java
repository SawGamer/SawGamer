package TLOSUNG._210_MerkbaresZufallspasswort;

import java.util.Random;

public class _210_Ai {
    public static void main(String[] args) {
        // Generate a random password
        String password = generateRandomPassword();

        // Print the generated password
        System.out.println(password);
    }

    // Generates a random password with the specified requirements
    public static String generateRandomPassword() {
        // Create a random number generator
        Random rng = new Random();

        // Set the password length to a random value between 6 and 10 (inclusive)
        int passwordLength = rng.nextInt(5) + 6;

        // Set the word length to a random value between 4 and 6 (inclusive)
        int wordLength = rng.nextInt(3) + 4;

        // Set the number length to a random value between 1 and 3 (inclusive)
        int numberLength = rng.nextInt(3) + 1;

        // Create a StringBuilder to build the password
        StringBuilder passwordBuilder = new StringBuilder();

        // Set the first character of the word to a random uppercase letter
        passwordBuilder.append((char) (rng.nextInt(26) + 'A'));

        // Set the remaining characters of the word to alternating consonants and vowels
        for (int i = 1; i < wordLength; i++) {
            int charType = rng.nextInt(2);
            if (charType == 0) {
                // Set the character to a random consonant
                passwordBuilder.append((char) (rng.nextInt(21) + 'B'));
            } else {
                // Set the character to a random vowel
                passwordBuilder.append((char) (rng.nextInt(5) + 'A'));
            }
        }

        // Set the special character to a random non-confusable punctuation mark
        passwordBuilder.append((char) (rng.nextInt(15) + '#' /* 0x23 */));

        // Set the number to a random sequence of digits
        for (int i = 0; i < numberLength; i++) {
            passwordBuilder.append((char) (rng.nextInt(10) + '0'));
        }

        // Return the generated password
        return passwordBuilder.toString();
    }
}
