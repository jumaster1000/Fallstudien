package UebungJulia.Uebung1.Interfaces;

public class Main {
    public static void main(String[] args) {

        Nachricht n1 = new Admin();
        Nachricht n2  = new Kunde();

        n1.benachrichtigen();
        n2.benachrichtigen();
    }
}
