package TLOSUNG._110_Zahlenpyramide;

public class _110_Zahlenpyramid {

    /*
     * Zahlenpyramide
     *
     * Schreibe ein Programm, das folgendes Ergebnis ausgibt:
     *
     * 00
     * 01 02
     * 02 03 04
     * 03 04 05 06
     * 04 05 06 07 08
     * 05 06 07 08 09 10
     * 06 07 08 09 10 11 12
     * 07 08 09 10 11 12 13 14
     * 08 09 10 11 12 13 14 15 16
     *
     * Zusatz: Benutze nur eine Schleife.
     */
    public static void main(String[] args) {
        int row = 1;
        int column = 0;
        int count = 0;
        while (row < 10) {
            if (column < row) {
                if (count < 10) {
                    System.out.print("0" + count + " ");
                } else {
                    System.out.print(count + " ");
                }
                column++;
                count++;
                continue;
            }
            if (column == row) {
                System.out.println();
                row++;
                column = 0;
                count = row - 1;
            }
        }
    }
}
