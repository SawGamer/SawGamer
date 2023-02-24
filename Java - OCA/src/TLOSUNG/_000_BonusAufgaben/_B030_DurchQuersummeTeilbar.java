package TLOSUNG._000_BonusAufgaben;

public class _B030_DurchQuersummeTeilbar {
    /*
     * Durch Quersumme teilbar
     *
     * Schreibe ein Programm, das alle Zahlen bis n ausgibt,
     * die durch ihre Quersumme teilbar sind.
     *
     * Z.B. 777 / (7 + 7 + 7) = 37
     */

    public static void main(String[] args) {
        int num = 777;
        //System.out.println(sumZiffern(num));

        int querNum = 1;
        int numMax = 100;
        while(querNum != numMax){
            int sumNum = sumZiffern(querNum);
            if(querNum %sumNum == 0){
                System.out.println("Zahl: " + querNum + " | Quersumme: " + sumNum +
                        " | Quotient:  " + (querNum/sumNum));
                querNum++;
            }else{
                querNum++;
            }
        }
    }

    public static int sumZiffern(int num){
        if(num < 0 || num == 0){
            return 0;
        }
        return num%10 + sumZiffern(num/10);
    }

}
