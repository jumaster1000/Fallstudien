package UebungJulia.Uebung1.Interfaces;

public class Kunde implements Nachricht{
    @Override
    public void benachrichtigen() {
        System.out.println("Der Kunde erhält eine Benachrichtigung");

    }
}
