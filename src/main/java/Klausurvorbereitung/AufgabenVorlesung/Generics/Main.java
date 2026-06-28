package Klausurvorbereitung.AufgabenVorlesung.Generics;

import java.util.Arrays;

public class Main implements Comparable{
    @Override
    public int compareTo(Object o) {
        //Arrays.sort();
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Bier b1 = new Bier("Kellerbier", "Gold Ochsen", 500);
        Bier b2 = new Bier("Weizen", "Gold Ochsen", 500);
        Bier b3 = new Bier("Radler", "Berg", 300);
        Bier b4 = new Bier("Dunkel", "Augustiner", 250);

        Bier bierliste[] = {b1, b2, b3, b4};

        for(Bier b : bierliste){
            System.out.println(b.toString());
        }

        for(int i = 0; i < bierliste.length; i++){

        }

    }
}
