package TLOSUNG._120_CaesarChiffreBruteforcen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cäsar_Chiffera {


//Generating possibilities
     private void Generate() {

         //System input using Scanner , StringBuilder to get use of the Setchar method
         Scanner in = new Scanner(System.in);

         StringBuilder s = new StringBuilder(in.nextLine());


         //Hashmap has key and value to decrypt
         HashMap<Character, Character> BiChiff = new HashMap<Character, Character>();

         //Original Alphabet
         ArrayList<Character> Normal = new ArrayList<>();
         for (char y = 'a'; y <= 'z'; y++) {
             Normal.add(y);
         }
         //Same Array as "Normal" but ready to alter and shift
         ArrayList<Character> Shift = new ArrayList<>();
         for (char y = 'a'; y <= 'z'; y++) {
             Shift.add(y);
         }

         //Shifting the characters to generate all possibilities
         for (int i = 0; i < 26; i++) {

             Shift.add(0, Shift.get(25));
             Shift.remove(26);
             int y = 0;

             while (y < 26) {
                 BiChiff.put(Normal.get(y), Shift.get(y));

                 //   System.out.println(Normal.get(y) + "With : "+ Shift.get(y));
                 if (BiChiff.containsKey(Normal.get(y))) {
                     //    System.out.println("Replacing: " + Normal.get(y) + "With : "+ Shift.get(y));
                     BiChiff.replace(Normal.get(y), Shift.get(y));
                 } else {
                     System.out.println("Nothing ADDED");
                 }

                     y++;
                 }
             BiChiff.put(' ',' ');



             //Shifting the characters to generate all possibilities

             for (int a = 0; a < s.length() ; a++) {
                 s.setCharAt(a, BiChiff.get(s.charAt(a)));
             }
             System.out.println(s);
             }
         }

    public static void main(String... args) {

        Cäsar_Chiffera S = new Cäsar_Chiffera();
        S.Generate();


        }


}
