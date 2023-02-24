package TLOSUNG._290_Anteil;

public class Anteil extends Bruch{

    private static Bruch verteilt = new Bruch(0, 1);

    public Anteil(){
        super(0,1);
    }
    public Anteil(int z, int n){
        super(z, n);
        try {
            verteilt = verteilt.addiere(this);
            double rest = 1 - verteilt.dezimalwert();
            if (rest < 0)
                throw new Exception("Der Gesamtwert kann nicht weiter verteilt werden !");
            }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Bruch getVerteilt() {
        return verteilt;
    }

    public Bruch getRest(){
        return new Bruch(1, 1).subtrahiere(getVerteilt());
    }
}
