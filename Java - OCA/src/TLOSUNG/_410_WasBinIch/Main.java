package TLOSUNG._410_WasBinIch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Flugzeug> flugzeuge = new ArrayList<>();
        flugzeuge.add(new Heissluftballon());
        flugzeuge.add(new Rakete());
        flugzeuge.add(new Segelflugzeug());

        flugzeuge.forEach(Flugzeug::wasBinIch);
    }
}
