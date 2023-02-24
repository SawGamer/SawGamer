package TLOSUNG._300_PWKVergleich;

public class TestPKW {
    public static void main(String[] args) {
        PKW pkw1 = new PKW();
        System.out.println(pkw1);

        PKW pkw2 = new PKW();
        System.out.println(pkw2);

        PKW pkw3 = new PKW("ford", "blue", 6.6);
        System.out.println(pkw3);

        System.out.println(pkw1 == pkw2);       // false
        System.out.println(pkw1.equals(pkw2));  // true
        System.out.println(pkw2.equals(pkw3));  // false

    }
}
