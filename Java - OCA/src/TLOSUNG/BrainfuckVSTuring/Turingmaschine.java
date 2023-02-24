package TLOSUNG.BrainfuckVSTuring;

public class Turingmaschine {                   //Abdullah

    // Arbeitsband der TuringMaschine
    private char[] workingTape = new char[10];
    private int workingTapeIndex = 0;
    // char[] sourceCode = {'#', '+', '#', '+', '#'};
    // Quellcode für Ausgabe von "hallo_welt"
    char[] sourceCode = { '+', '+', '+', '+', '+', '+', '+', '#', '>', '#',
            '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '#', '#',
            '+', '+', '+', '#', '>', '-', '-', '#', '>', '+', '+', '+', '+',
            '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+',
            '+', '+', '+', '+', '+', '#', '>', '+', '+', '+', '+', '#', '>',
            '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '#', '>',
            '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+',
            '+', '+', '+', '+', '+', '+', '#' };

    // Konstruktor
    public Turingmaschine() {
        initWorkingTape();
        work(sourceCode);
    }

    // initialisiert Arbeitsband mit 'a'
    private void initWorkingTape() {
        for (int i = 0; i < workingTape.length; i++) {
            workingTape[i] = 'a';
        }
    }

    // Rechtsshift des Kopfes
    private void shiftRight() {
        if (workingTapeIndex > 10) {
            workingTapeIndex = 0;
        } else {
            workingTapeIndex++;
        }
    }

    // Linksshift des Kopfes
    private void shiftLeft() {
        if (workingTapeIndex <= 0) {
            workingTapeIndex = workingTape.length - 1;
        } else {
            workingTapeIndex--;
        }
    }

    // Zeichen "inkrementieren"
    private void plus() {
        workingTape[workingTapeIndex]++;
    }

    // Zeichen "dekrementieren"
    private void minus() {
        workingTape[workingTapeIndex]--;
    }

    // Ausgabe des aktuellen Zeichens
    private void print() {
        System.out.println(workingTape[workingTapeIndex]);
    }

    // Algorithmus der TuringMaschine zur Abarbeitung des Codes
    private void work(char[] sourceCode) {
        for (char c : sourceCode) {
            switch (c) {
                case '#':
                    print();
                    break;
                case '<':
                    shiftLeft();
                    break;
                case '>':
                    shiftRight();
                    break;
                case '+':
                    plus();
                    break;
                case '-':
                    minus();
                    break;
                default:
                    System.out.println("Code " + c + " ist nicht zulaessig!");
            }
        }
    }

    // main-methode (Startpunkt des Programms)
    public static void main(String[] args) {
        new Turingmaschine();
    }
}
