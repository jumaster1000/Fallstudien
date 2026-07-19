package Klausurvorbereitung.AufgabenVorlesung.Collections;

import java.util.*;

public class Lottozahlen {
    public static void main(String[] args) {
        HashSet<Integer> ziehung1 = new HashSet<>();
        HashSet<Integer> ziehung2 = new HashSet<>();
        HashSet<Integer> ziehung3 = new HashSet<>();
        HashSet<Integer> ziehung4 = new HashSet<>();
        HashSet<Integer> ziehung5 = new HashSet<>();
        HashSet<Integer> ziehung6 = new HashSet<>();
        HashSet<Integer> ziehung7 = new HashSet<>();
        HashSet<Integer> ziehung8 = new HashSet<>();
        HashSet<Integer> ziehung9 = new HashSet<>();
        HashSet<Integer> ziehung10 = new HashSet<>();


        ArrayList<HashSet> ziehungen = new ArrayList<>();

        for (int i = 0; i <= 10 ; i++) {
            //ziehungen.add();
        }

        Random e = new Random();

        int zahl = 0;

        for(HashSet f : ziehungen) {
            for (int i = 0; i <= 6; i++) {
                zahl = e.nextInt(1, 50);
                if (!f.contains(zahl)) {
                    f.add(zahl);
                } else {
                    i--;
                }

            }
            System.out.println(f);
        }

    }
}
