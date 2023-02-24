package TLOSUNG._290_Anteil;

public class AnteilTest {

    public static void main(String[] args){

        int vermoegen = 200000;
        Anteil a1 = new Anteil(1,4);
        Anteil a2 = new Anteil(1,2);
        System.out.println("\nAnteil a1: " + a1.bruchToString());
        System.out.println("Betrag von a1 :" + vermoegen * a1.dezimalwert());
        System.out.println("Anteil a2: " + a2.bruchToString());
        System.out.println("Betrag von a2: " + vermoegen * a2.dezimalwert());
        System.out.println("Verteilt: " + Anteil.getVerteilt().bruchToString());
        System.out.println("Rest: " + a1.getRest().bruchToString());
        System.out.println("Restbetrag: " + vermoegen * a1.getRest().dezimalwert());


    }
}
