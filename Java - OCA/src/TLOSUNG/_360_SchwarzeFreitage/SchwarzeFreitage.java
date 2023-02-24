package TLOSUNG._360_SchwarzeFreitage;

public class SchwarzeFreitage {             //Abdullah
    
    static int monat;
    static int jahr;
    static int tag = 6; //0 = Montag, 6 = Sonntag
    static int[] monatsLaenge = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        sucheFreitage();

    }

    public static void sucheFreitage() {
        for (jahr = 1901; jahr <= 2000; jahr++) {
            for (monat = 1; monat <= 12; monat++) {
                if (tag == 4) System.out.println(jahr + "-" + monat + "-13");
                tag = tag + monatsLaenge[monat - 1];

                //Schaltjahr?
                if (monat == 2 && jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) tag++;
                tag %= 7;
            }
        }
    }
}