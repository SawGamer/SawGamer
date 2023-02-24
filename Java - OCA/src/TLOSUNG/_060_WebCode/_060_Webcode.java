package TLOSUNG._060_WebCode;

import java.util.ArrayList;
import java.util.Random;

public class _060_Webcode{

    static ArrayList<Character> getCode() {

        ArrayList<Character> codes = new ArrayList<>();
        Random random = new Random();
        int asciiCode;
        int i = 0;
        while (i < 8) {
            asciiCode = random.nextInt(123 - 49) + 49;  // 50 bis 122
            if (asciiCode >= 50 && asciiCode < 58 || asciiCode >= 97) {
                if (asciiCode != 108) {
                    char c = (char) asciiCode;
                    codes.add(c);
                    i++;
                }
            }
        }

        return codes;
    }

    public static void main(String[] args) {
        ArrayList<Character> code;
        int i = 1;
        while (i <= 5) {
            code = getCode();
            StringBuilder formatted = new StringBuilder();
            for (char value : code) {
                formatted.append(value);
            }
            System.out.println("Code " + (i) + ": " + formatted);
            i++;
        }
    }
}
