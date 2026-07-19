package Klausurvorbereitung.AufgabenVorlesung.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class LottoJahreSpielen {
    public static void main(String[] args) {
        Random e = new Random();

        HashSet<Integer> lottoZiehungen = new HashSet<>();
        HashSet<Integer> getippteZahlen = new HashSet<>();

        // Lotto Zahlen tippen
        for (int j = 0; j < 6; j++) {
            int zahl = e.nextInt(1, 50);
            if (!getippteZahlen.contains(zahl)) {
                getippteZahlen.add(zahl);
            } else {
                j--;
            }
        }

        int sechser = 0;
        int anzahlSechser = 0;
        int richtig = 0;
        int jahr = 0;

        System.out.println("LottoJahreSpielen.main");
        while(anzahlSechser < 1) {

            // 100 Zieheungen pro Jahr
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 6; j++) {
                    int zahl = e.nextInt(1, 50);
                    if (!lottoZiehungen.contains(zahl)) {
                        lottoZiehungen.add(zahl);
                    } else {
                        j--;
                    }

                }

                // Getippte Zahlen mit Lotto Zahlen abgleichen
                for (Integer k : getippteZahlen) {
                    if (lottoZiehungen.contains(k)) {
                        sechser++;
                        richtig++;
                    }
                }

                // Schauen ob bei der Ziehung ein Sechser dabei ist
                if (sechser == 6) {
                    anzahlSechser++;
                    if (jahr == 0){
                        System.out.println("Sechser im Lotto innerhalb eines Jahres, mit " + richtig + "Richtigen");
                        lottoZiehungen.clear();
                        break;
                    } else {
                        System.out.println("Sechser im Lotto nach " + jahr + " Jahren, mit " + richtig + "Richtigen");
                        lottoZiehungen.clear();
                        break;
                    }
                } else{
                    sechser = 0;

                    if(i == 99){
                        jahr++;
                    }
                    lottoZiehungen.clear();
                }


            }
        }
    }
}
