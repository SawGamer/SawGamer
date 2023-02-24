package TLOSUNG._000_BonusAufgaben;

public class _B010_Zahlenreihe {
    /* 6.
     * Schreibe ein Programm, das per for-Schleife
     * alle Zahlen von 1 bis 20 addiert
     * und danach das Endergebnis ausgibt.
     */
    /* 7.
     * Schreibe eine for-Schleife, die Folgendes ausgibt:
     * a2b3 a12b13 a22b23
     */
    /* 8.
     * Schreibe eine for-Schleife, die Folgendes ausgibt:
     * 13 17 21 29 33 37 45
     */
    /* 9.
     * Schreibe EINE for-Schleife, die Folgendes ausgibt:
     * 1 2 3 4 5 4 3 2 1
     */
    /* 10.
     * Schreibe ein Programm, das mit EINER while-Schleife
     * alle natülichen Zahlen von 1 bis 39 sowie 61 bis 100
     * (jeweils einschließlich) der Größe nach ausgibt:
     * 1 2 3 4 ..... 36 37 38 39 61 62 63 64 ... 97 98 99 100
     */

    public static void main(String[] args) {

        int num = 0;
        for (int i = 0; i <= 20; i++) {
            num += i;
        }
        System.out.println(num);

        int num1 = 2;
        int num2 = 3;
        char char1 = 'a';
        char char2 = 'b';
        for (int i = 0; i < 3; i++) {
            System.out.print("" + num1 + char1 + num2 + char2 + " ");
            num1 += 10;
            num2 += 10;
        }
        System.out.println();

        int num3 = 9;
        int plus1 = 4;
        int plus2 = 8;
        int durchlaeufe = 7;
        int counter = 0;
        for (int i = 1; i <= durchlaeufe;) {
            if(counter == 3){
                num3 += plus2;
                counter = 0;
            }else{
                num3 += plus1;
            }
            counter++;
            durchlaeufe--;
            System.out.print(num3 + " ");
        }
        System.out.println();

        int num5 = 1;
        int chanceNum = 5;
        int counter2 = 1;
        for (int i = 0; i <9 ; i++) {
            if(counter2 < chanceNum){
                System.out.print(num5 + " ");
                num5++;
                counter2++;
            } else if (counter2 == chanceNum) {
                System.out.print(num5 + " ");
                counter2++;
            } else{
                num5--;
                System.out.print(num5 + " ");
            }
        }
        System.out.println();

        //1 2 3 4 ..... 36 37 38 39 61 62 63 64 ... 97 98 99 100
        int num7 = 1;
        int num7Max = 100;
        int firstBreak = 39;
        int secondBreak = 61;

        while(num7 <= num7Max){
            if(num7 <= firstBreak){
                System.out.print(num7 + " ");
                num7++;
            } else if (num7 >= secondBreak) {
                System.out.print(num7 + " ");
                num7++;
            } else{
                num7++;
                System.out.print(".");
            }

        }

    }
}
