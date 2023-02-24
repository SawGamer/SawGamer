package TLOSUNG._030_Multiplikation;


public class _030_Multiplication {
    /*
     * Multiplikation
     *
     * Schreibe ein Programm, das ermittelt,
     * wie viele ganzzahlige Multiplikator-Multiplikand-Kombinationen
     * vom Produkt 8.420.000 es gibt,
     * bei denen sowohl Multiplikator, als auch Multiplikand
     * kleiner als 10.000 sind.
     *
     * 1000*8420 und 8420*1000 ist nur eine Kombination
     */

    public static void main(String[] args) {

        int product = 8420000;
        int upperBound = 10000;
        int total = 0;

        for (int i = 0; i * i <= product; i++) {
            for (int j = 0; j < upperBound; j++) {
                int checkNumber = i * j;
                if (checkNumber == product) {
                    total++;
                    System.out.println("Combo: " + i + " * " + j);
                }
            }
        }
        System.out.println("\nTotal: " + total);
    }
}


