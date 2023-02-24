package TLOSUNG._300_PWKVergleich;

import java.util.Objects;

public class PKW {

    private String hersteller;
    private String farbe;
    private double kofferraumVolume;


    public PKW() {
    }

    public PKW(String hersteller, String farbe, double kofferraumVolume) {
        this.hersteller = hersteller;
        this.farbe = farbe;
        this.kofferraumVolume = kofferraumVolume;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getKofferraumVolume() {
        return kofferraumVolume;
    }

    public void setKofferraumVolume(double kofferraumVolume) {
        this.kofferraumVolume = kofferraumVolume;
    }

    @Override
    public String toString() {
        return "PKW{" +
                "hersteller='" + hersteller + '\'' +
                ", farbe='" + farbe + '\'' +
                ", kofferraumVolume=" + kofferraumVolume +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PKW pkw = (PKW) object;
        return Double.compare(pkw.kofferraumVolume, kofferraumVolume) == 0 &&
                Objects.equals(hersteller, pkw.hersteller) &&
                Objects.equals(farbe, pkw.farbe);
    }

}
