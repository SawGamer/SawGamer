package TLOSUNG._190_Person;

public class Person {

    private int alter;
    private String nachname = "unbekannt";
    private String vorname = "unbekannt";

    Person(){
    }
    Person(String vorname){
        this(vorname, "unbekannt");
    }
    Person(String vorname, String nachname){
        this(vorname, nachname, 0);
    }
    Person(String vorname, String nachname, int alter){
        setAlter(alter);
        setNachname(nachname);
        setVorname(vorname);
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override public String toString(){
        return  "Nachname:      " + getNachname() + "\n" +
                "Vorname:       " + getVorname() + "\n" +
                "Alter:         " + getAlter() + "\n";
    }




}
