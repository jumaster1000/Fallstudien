package Klausurvorbereitung.AufgabenVorlesung.AbstrakteKlassen;

public class Main {
    public static void main(String[] args) {
        Magier magier = new Magier();
        Krieger krieger = new Krieger();

        magier.angreifen();
        krieger.verteidigen();
        magier.kampfmanoever();



        krieger.angreifen();
        magier.verteidigen();
        krieger.kampfmanoever();
    }
}
