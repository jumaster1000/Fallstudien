package Klausurvorbereitung.AufgabenVorlesung.Collections;

import java.util.HashSet;
import java.util.Random;

public class LottozahlenEinObjekt {
    public static void main(String[] args) {
        HashSet<Integer> ziehung = new HashSet<>();

        Random e = new Random();

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 6; j++) {
                int zahl = e.nextInt(1, 50);
                if (!ziehung.contains(zahl)) {
                    ziehung.add(zahl);
                } else {
                    j--;
                }

            }
            System.out.println(ziehung);
            ziehung.clear();
        }

    }
}
