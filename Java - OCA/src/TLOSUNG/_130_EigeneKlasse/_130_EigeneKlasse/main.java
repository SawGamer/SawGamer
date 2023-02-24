package TLOSUNG._130_EigeneKlasse._130_EigeneKlasse;
    /*
     * Eigene Klasse
     *
     * Überlege dir ein Objekt aus deiner Umgebung oder deiner Phantasie.
     * Schreibe eine Klasse zum Erzeugen eines solchen Objekts.
     * Anforderungen:
     *     - Mindestens zwei Attribute
     *     - Diverse Konstruktoren
     *     - Kapselung mit private, Gettern & Settern
     *     - Statischer Counter
     *     - toString()-Methode
     *     - Mindestens eine zusätzliche Methode
     *     - Die Klasse in eine getrennte Datei (Abgabe als Package/Ordner mit zwei Dateien)
     */

public class main {

    public static void main(String[] args) {
    
        Headset headset1 = new Headset();
        System.out.println(headset1);

        Headset headset2 = new Headset("Hyper X");
        System.out.println(headset2);

        Headset headset3 = new Headset("JBL", "Quantum 350");
        System.out.println(headset3);

        Headset headset4 = new Headset(79.95);
        System.out.println(headset4);

        System.out.println("Es wurden " + Headset.counter + " Headsets hinzugefügt.");
        

        //headset2.setHersteller("Hyper X");
        //headset3.setHersteller("JBL");
        //headset3.setModell("Quantum 350");




        
    }





}