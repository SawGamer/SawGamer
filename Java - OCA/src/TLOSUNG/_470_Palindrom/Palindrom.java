package TLOSUNG._470_Palindrom;


public class Palindrom {

    private String parseString(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                builder.append(input.charAt(i));
            }
        }
        return builder.toString().toLowerCase();
    }

    public boolean checkPalindrome(String input) {
        String parsed = parseString(input);
        int front = 0;
        int end = parsed.length() - 1;
        while (end > front) {
            if (parsed.charAt(front) != parsed.charAt(end)) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.checkPalindrome("a")); // true
        System.out.println(palindrom.checkPalindrome("ab")); // false
        System.out.println(palindrom.checkPalindrome("dad")); // true
        System.out.println(palindrom.checkPalindrome("Dad")); // true - ignore case
        System.out.println(palindrom.checkPalindrome("A man, a plan, a canal, Panama!")); // true
        System.out.println(palindrom.checkPalindrome("A ma, a plan, a canal, Panama!")); // false - misspell
        System.out.println(palindrom.checkPalindrome("Lagerregal")); // true
        System.out.println(palindrom.checkPalindrome("Trug Tim eine so helle Hose nie mit Gurt?")); // true

    }
}
