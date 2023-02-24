package TLOSUNG._280_BruchMitSeriennummer;

public class Bruch {

    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    int getZaehler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    String bruchToString() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        int m, n, r;
        m = Math.abs(zaehler);
        n = Math.abs(nenner);
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    double dezimalwert() {
        return (double) zaehler / nenner;
    }

    Bruch addiere(Bruch b) {
        int z = zaehler * b.nenner + nenner * b.zaehler;
        int n = nenner * b.nenner;
        return new Bruch(z, n);
    }

    Bruch subtrahiere(Bruch b) {
        int z = zaehler * b.nenner - nenner * b.zaehler;
        int n = nenner * b.nenner;
        return new Bruch(z, n);
    }

    Bruch multipliziere(Bruch b){
        int z = zaehler * b.zaehler;
        int n = nenner * b.nenner;
        return new Bruch(z, n);
    }

    Bruch dividiere(Bruch b){
        int z = zaehler * b.nenner;
        int n = nenner * b.zaehler;
        return new Bruch(z, n);
    }
}
