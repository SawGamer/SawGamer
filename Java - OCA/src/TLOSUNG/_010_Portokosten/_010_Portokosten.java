package TLOSUNG._010_Portokosten;

import java.text.DecimalFormat;
import java.util.Random;

public class _010_Portokosten {

    public static void main(String[] args) {
        double max = 130.0;
        DecimalFormat df = new DecimalFormat("#.00");
        Random random = new Random();
        double portokosten = max * random.nextDouble();
        double result = getPorto(portokosten);

        System.out.println("Bei einem Bestellwert von " + df.format(portokosten)
                + "€ betragen die TLOSUNG.Portokosten " + df.format(result) + "€. Der Gesamtbestrag somit "
                + (df.format(portokosten + result)) + " €");

    }

    static double getPorto(double portokosten) {
        double result;
        if (portokosten <= 39.99) {
            result = 3.99;
        // } else if (portokosten >= 40.0 && portokosten <= 69.99) {
        } else if (portokosten <= 69.99) {
            result = 2.99;
        } else if (portokosten >= 70.0 && portokosten <= 99.99) {
            result = 1.99;
        } else {
            result = 0.0;
        }
        return result;
    }

}
