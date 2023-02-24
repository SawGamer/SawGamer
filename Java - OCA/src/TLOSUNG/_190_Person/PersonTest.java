package TLOSUNG._190_Person;

public class PersonTest {
    public static void main(String[] args) {

        Kunde kunde1 = new Kunde();
        System.out.println(kunde1);

        Kunde kunde2 = new Kunde("Hubertus", "Klaus", 86, 10012, "Gerhardt");
        System.out.println(kunde2);

        Mitarbeiter mit1 = new Mitarbeiter("Gerhardt", "Heinz", 57, 10779, "Hardware");
        System.out.println(mit1);

        Mitarbeiter mit2 = new Mitarbeiter();
        System.out.println(mit2);

        Person per1 = new Person();
        System.out.println(per1);

        Person per2 = new Person("Dieter");
        System.out.println(per2);

        Person per3 = new Person("Dieter", "Heinz");
        System.out.println(per3);

        Person per4 = new Person("Dieter", "Heinz", 45);
        System.out.println(per4);



    }
}
