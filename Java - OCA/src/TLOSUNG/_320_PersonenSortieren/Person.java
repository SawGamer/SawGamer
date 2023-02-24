package TLOSUNG._320_PersonenSortieren;

public class Person implements Comparable<Person>{

    private int alter;
    private String nachname;
    private String vorname;


    protected Person(){

    }

    protected Person(String nachname, String vorname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    protected Person(String vorname){
        this( vorname, "", 0);
    }

    protected Person(String vorname, String nachname){
        this(vorname, nachname, 0);
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

    @Override
    public String toString() {
        return "Person{" +
                "alter=" + alter +
                ", nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if(o == null) return -1;
        if(this.getNachname().compareTo(o.getNachname()) == 0){
            if(this.getVorname().compareTo(o.getVorname()) == 0){
                Integer alter = o.getAlter();
                return alter.compareTo(this.getAlter());
            }else{
                return Integer.compare(this.getVorname().compareTo(o.getVorname()),0);
            }
        } else {
            return Integer.compare(this.getNachname().compareTo(o.getNachname()), 0);
        }
    }
}
