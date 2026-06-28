package Klausurvorbereitung.AufgabenVorlesung.AbstrakteKlassen;

public class Krieger extends Spielcharakter implements Strategie{
    @Override
    public void angreifen() {
        System.out.println("Kireger greift an");
    }

    @Override
    public void kampfmanoever() {
        System.out.println("Krieger macht ein Kampfmanöver");
    }
}
