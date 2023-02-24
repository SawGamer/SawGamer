package TLOSUNG._000_BonusAufgaben;

public class _B050_DurchZahlenreiheTeilbarZahl{
    /*
         * Durch Zahlenreihe teilbare Zahl
         *
         * Die kleinste positive Zahl,
         * die durch alle Zahlen von 1 bis 10 ohne Rest teilbar ist, ist die 2520.
         * Schreibe ein Programm mit der die kleinste positive Zahl ermittelt werden kann,
         * die durch alle Zahlen von 1 bis 40 ohne Rest teilbar ist.
         *
         * Hinweis: Die gesuchte Zahl ist 5342931457063200
         *
         * Tipp: Erst einmal mit einer kleineren Zahl anfangen und dann eine immer größere Zahl nehmen.
         * Hier alle möglichen Zahlen mit ihrem Ergebnis:
         *
         *
         *  1: 1
            2: 2
            3: 6
            4: 12
            5: 60
            6: 60
            7: 420
            8: 840
            9: 2520
            10: 2520
            20: 232792560
            30: 2329089562800
            40: 5342931457063200
        */
    public static void main(String[] args) {
        final int hoechsterTeiler = 41;
        long x = 1;
        long y = 1;

        for (int i = 1; i < hoechsterTeiler; i++) {
            while(true){
                if(y % i == 0 && y % x == 0){
                    x = y;
                    break;
                }else{
                    y += x;
                    //System.out.println(y);
                }
            }
            System.out.print(" | i = " + i);
            System.out.println(" | y = " + y);
        }
    }
}



