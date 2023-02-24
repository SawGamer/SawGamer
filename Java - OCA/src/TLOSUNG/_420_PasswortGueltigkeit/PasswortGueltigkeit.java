package TLOSUNG._420_PasswortGueltigkeit;

import static java.lang.Character.*;

public class PasswortGueltigkeit {

    public boolean isPasswordValid(String password) {
        if (password.length() < 9) {
            return false;
        }
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int specialCharCount = 0;
        int numberCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (isUpperCase(character)) {
                upperCaseCount++;
            } else if (isLowerCase(character)) {
                lowerCaseCount++;
            } else if (isDigit(character)) {
                numberCount++;
            } else if (!isLetterOrDigit(character)) {
                specialCharCount++;
            }
        }
        return upperCaseCount >= 2 && lowerCaseCount >= 2 && specialCharCount >= 2 && numberCount >= 2;
    }
}
