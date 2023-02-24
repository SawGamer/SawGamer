package TLOSUNG._140_RoboterAufgabe._140_RoboterAufgabe;

public class _140_RoboterAufgabe {
     /*
     * Roboter
     *
     * Wir haben folgende einfache Roboterklasse geschrieben:

        public class Roboter {
            private String name;
            public Roboter(String name) { this.name = name;}
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
        }

     * Diese Klasse erfreut sich nun auf einmal weltweit großer Beliebtheit.
     * Wir haben allerdings ein Problem:
     * Die internationale Robotergewerkschaft konnte ein weltweites Verbot durchsetzen,
     * dass Roboter nicht mehr "Bernd" genannt werden dürfen.
     * Alle anderen Namen sind erlaubt.
     * Schreibe nun die Klasse so um,
     * dass Roboter automatisch "Herbert" genannt werden,
     * wenn jemand versucht, sie "Bernd" zu taufen
     * oder versucht den Roboter in "Bernd" umzubenennen.
     * Eine Test-Klasse könnte so aussehen:

        public class TLOSUNG._000_Fertig_besprochen._160_Ferienwohnungen._160_Ferienwohnungen_MatthiasBreuker.Main {
            public static void main(String[] args) {
                Roboter x = new Roboter("Herbert");
                Roboter y = new Roboter("Bernd");
                System.out.println(x.getName() + " und " + y.getName());
            }
        }

     * Für die Benutzer der Klasse darf sich natürlich nichts ändern
     * Nur muss jetzt zweimal "Herbert" ausgegeben werden.
     *
     * Bitte auch das Umbenennen testen.
     * Nach dem Versuch, einen Roboter in „Bernd” umzubenennen,
     * muss dieser Roboter „Herbert” heissen:

        Roboter z = new Roboter("Stefan");
        z.setName("Bernd");
        System.out.println(z.getName());  // Herbert

     */

    // Bitte als Ordner (mir angefügtem Namen) mit drei Dateien abgeben: RoboterAufgabe, Roboter, TLOSUNG._000_Fertig_besprochen._160_Ferienwohnungen._160_Ferienwohnungen_MatthiasBreuker.Main
}
