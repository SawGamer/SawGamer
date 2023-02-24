package TLOSUNG._240_Primzahlensieb;

import java.util.ArrayList;

public class Primzahlensieb {               //Abdullah

    private static final int MAX = 100;
    private static boolean[] isPrim = new boolean[MAX];

    private static int[] machArr() {
        int[] arr = new int[MAX];
        for (int i = 2; i <= arr.length; ++i) {
            arr[i-2] = i;
            isPrim[i-2] = i == 2 || i%2 == 1 ? true : false;
        }
        return arr;
    }

    private static ArrayList<Integer> siebe(int[] n) {
        ArrayList<Integer> prim = new ArrayList<Integer>();
        for (int i = 2; i <= MAX; ++i) {
            if (isPrim[i-2]) {
                prim.add(n[i-2]);
                for (int j = i*i; j <= MAX; j += i) {
                    isPrim[j-2] = false;
                }
            }
        }
        return prim;
    }

    private static void gibAus(ArrayList<Integer> list) {
        for(int i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        gibAus(siebe(machArr()));
    }

}
