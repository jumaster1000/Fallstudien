package Klausurvorbereitung.AufgabenVorlesung.AbstrakteKlassen;

public class Magier extends Spielcharakter implements Strategie{
    @Override
    public void angreifen() {
        System.out.println("Magier greift an");
    }

    @Override
    public void kampfmanoever() {
        System.out.println("Magier macht ein Kampfmanöver");
    }
}
