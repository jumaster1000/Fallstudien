package UebungJulia.Uebung1.Interfaces;

public class Admin implements Nachricht{
    @Override
    public void benachrichtigen() {
        System.out.println("Der Admin erhält eine Systembenachrichtigung");
    }
}
