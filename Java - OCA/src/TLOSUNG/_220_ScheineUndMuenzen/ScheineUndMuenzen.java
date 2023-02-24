package TLOSUNG._220_ScheineUndMuenzen;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class ScheineUndMuenzen {
    static final double[] values = {500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00,
            0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

    public void berechne(double betrag) {
        ArrayList<Double> notes = new ArrayList<>();
        for (double value : values) {
            if (betrag >= value) {
                do {
                    notes.add(value);
                    betrag = betrag - value;
                } while (betrag >= value);
            }
        }
        printFormatted(notes);
    }

    private void printFormatted(ArrayList<Double> notes) {
        StringBuilder formatted = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#0.00");
        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        String prefix = "";
        for (Object value : notes) {
            formatted.append(prefix);
            prefix = ", ";
            formatted.append(df.format(value));
        }
        System.out.println(formatted);
    }
}



