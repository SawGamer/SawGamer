package TLOSUNG.BrainfuckVSTuring;

public class Brainfuck {                    //Abdullah

    private static char[] workingTape = { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a' };
    private static int head = 0;

    public static void main(String[] args) {
        char[] sourceCode = { '#', '+', '#', '+', '#' };
        for (int i = 0; i < sourceCode.length; i++) {
            progress(sourceCode[i]);
        }
    }

    private static void progress(char command) {
        switch (command) {
            case '>':
                head = (head + 1) % 9;
                break;
            case '<':
                head = (head - 1) % 9;
                break;
            case '+':
                workingTape[head] = (char) (workingTape[head] + 1);
                break;
            case '-':
                workingTape[head] = (char) (workingTape[head] - 1);
                break;
            case '#':
                System.out.print(workingTape[head]);
                break;
            default:
                System.out.println("Befehl wurde nicht erkannt bitte Benutze < | > | + | - | #");
        }
    }
}
