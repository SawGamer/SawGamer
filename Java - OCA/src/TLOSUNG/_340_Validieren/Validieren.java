package TLOSUNG._340_Validieren;

import java.util.Scanner;

public class Validieren {

    static class LeereEingabeException extends NumberFormatException {
        LeereEingabeException() {
            super();
        }
    }

    static float integerToFloat(int integer) {
        if(integer == 0) { throw new ArithmeticException("Darf nicht 0 sein");}
        return (float) 100 / integer;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bitte geben einen Integer ein: ");
            try {
                String entry = input.nextLine();
                if (entry.isEmpty()) {
                    throw new LeereEingabeException();
                } else {
                    int zahl = Integer.parseInt(entry);
                    System.out.println(integerToFloat(zahl));
                }
                break;
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            } catch (LeereEingabeException lee) {
                System.out.println("Darf nicht leer sein");
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist kein Integer.");
            }
        }
    }
}
