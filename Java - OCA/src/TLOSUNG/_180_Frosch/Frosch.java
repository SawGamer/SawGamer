package TLOSUNG._180_Frosch;

public class Frosch {
    //Abdullah
    public void calculatingDis(double StrLang , double Schirtt){
        double gesamt =Schirtt;
        int jumps=1;
        double e=Schirtt;

        while (gesamt<StrLang){
            e=e/2;
            gesamt+=e;
            jumps++;
        }
        System.out.println(jumps);
    }




    static int jum=1;
    public int recrusive(double StrLang , double Schirtt ) {
        if (Schirtt<StrLang){
            jum++;
        }

        if (StrLang > 0) {
            recrusive(StrLang - Schirtt, Schirtt / 2);
        }
        return jum;
    }


        public static void main(String args[]) {

            Frosch s = new Frosch();
            s.calculatingDis(2, 1);
            System.out.println(s.recrusive(1.99,1));

        }

}
