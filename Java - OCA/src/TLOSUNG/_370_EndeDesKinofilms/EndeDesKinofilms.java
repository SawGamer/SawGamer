package TLOSUNG._370_EndeDesKinofilms;

import java.time.LocalTime;

public class EndeDesKinofilms {                     //Abdullah

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(19,30);
        LocalTime ende = start.plusMinutes(132);
        System.out.println("Die Vorstellung endet um: " + ende);
    }
}
