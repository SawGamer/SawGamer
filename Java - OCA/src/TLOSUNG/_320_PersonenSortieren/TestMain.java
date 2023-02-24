package TLOSUNG._320_PersonenSortieren;

import java.util.ArrayList;

public class TestMain {

    public static ArrayList<Mitarbeiter> sortMitarbeiter(ArrayList<Mitarbeiter> persons) {
        for (int i = 1; i < persons.size(); i++) {
            Mitarbeiter temp = persons.get(i);
            int j = i;
            while ((j > 0) && (persons.get(j - 1).compareTo(temp) > 0)) {
                persons.set(j, persons.get(j - 1));
                j--;
            }
            persons.set(j, temp);
        }
        return persons;
    }


    public static void main(String[] args) {
        Mitarbeiter danny = new Mitarbeiter("Williams", "Danny", 50);
        Mitarbeiter eric = new Mitarbeiter("George", "Eric", 25);
        Mitarbeiter andy = new Mitarbeiter("George", "Andy", 30);
        Mitarbeiter elise = new Mitarbeiter("George", "Elise", 33);
        Mitarbeiter andy2 = new Mitarbeiter("George", "Andy", 35);
        Mitarbeiter fran = new Mitarbeiter("Boromir", "Fran", 44);
        Mitarbeiter john = new Mitarbeiter("Doe", "John", 45);
        Mitarbeiter jane = new Mitarbeiter("Doe", "Jane", 47);
        Mitarbeiter john2 = new Mitarbeiter("Donald", "John", 33);
        Mitarbeiter janet = new Mitarbeiter("Dammit", "Janet", 35);
        Mitarbeiter riff =  new Mitarbeiter("Raff", "Riff", 50);
        Mitarbeiter frank = new Mitarbeiter("Furter", "Frank N", 60);

        ArrayList<Mitarbeiter> people = new ArrayList<>();

        people.add(danny);
        people.add(eric);
        people.add(andy2);
        people.add(andy);
        people.add(elise);
        people.add(fran);
        people.add(john);
        people.add(jane);
        people.add(john2);
        people.add(janet);
        people.add(riff);
        people.add(frank);

        System.out.println("Vor Sortierung: ");
        for (Mitarbeiter person : people) {
            System.out.println(person.getNachname() + ", " + person.getVorname() + "\tAlter: " + person.getAlter());
        }
        System.out.println();
        System.out.println("Nach Sortierung: ");

        ArrayList<Mitarbeiter> sorted = sortMitarbeiter(people);

        for (Person person : sorted) {
            System.out.println(person.getNachname() + ", " + person.getVorname() + "\tAlter: " + person.getAlter());
        }

    }
}
