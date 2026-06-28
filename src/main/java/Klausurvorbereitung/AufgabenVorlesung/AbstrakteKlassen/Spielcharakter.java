package Klausurvorbereitung.AufgabenVorlesung.AbstrakteKlassen;

public abstract class Spielcharakter {
    public abstract void angreifen();

    public void verteidigen(){
        System.out.println("Gegner verteidigt sich");
    }
}
