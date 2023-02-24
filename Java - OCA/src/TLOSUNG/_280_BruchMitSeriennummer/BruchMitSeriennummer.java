package TLOSUNG._280_BruchMitSeriennummer;

public class BruchMitSeriennummer extends Bruch{

    static int counter = 0;
    private final int seriennummer;

    public BruchMitSeriennummer(int x, int y){
        super(x, y);
        counter++;
        seriennummer = counter;
    }

    public int getSeriennummer() {
        return seriennummer;
    }
}
