package TLOSUNG._040_Schachbrett;

public class Schachbrett {
    public static void main(String[] args) {
        int x = 8;
        while (x >= 1) {
            for (int y = 0; y < 8; y++) {
                System.out.print((char) ('A' + y) + Integer.toString(x) + " ");
            }
            System.out.println();
            x -= 1;
        }

    }

}

